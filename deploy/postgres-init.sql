-- Auth service database (same instance as business DB, separate database per design)
-- Runs only on first start when data volume is empty
CREATE DATABASE cos;
GRANT ALL PRIVILEGES ON DATABASE cos TO cos;
\connect cos
GRANT ALL ON SCHEMA public TO cos;
