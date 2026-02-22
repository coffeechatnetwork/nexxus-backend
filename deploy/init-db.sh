#!/usr/bin/env bash
set -e

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
REPO_ROOT="$(cd "$SCRIPT_DIR/.." && pwd)"
SQL_DIR="$REPO_ROOT/migration"
CONTAINER="${COS_POSTGRES_CONTAINER:-cos-postgres}"
USER="${POSTGRES_USER:-cos}"
DB_COS="${POSTGRES_DB:-cos}"
DB_AUTH="cos"

cd "$REPO_ROOT"

if ! docker ps --format '{{.Names}}' | grep -q "^${CONTAINER}$"; then
  echo "Starting postgres..."
  docker compose up -d postgres
  echo "Waiting for postgres to be ready..."
  until docker exec "$CONTAINER" pg_isready -U "$USER" -d "$DB_COS" >/dev/null 2>&1; do
    sleep 1
  done
  sleep 2
fi

echo "Running auth.sql..."
docker exec -i "$CONTAINER" psql -U "$USER" -d "$DB_COS" < "$SQL_DIR/auth.sql" 2>/dev/null || true

echo "Running cos.sql..."
docker exec -i "$CONTAINER" psql -U "$USER" -d "$DB_AUTH" < "$SQL_DIR/cos.sql"

echo "Database init done."
