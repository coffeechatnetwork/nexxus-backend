# Build stage (use non-alpine Maven image; alpine tag may be unavailable)
FROM maven:3.9-eclipse-temurin-17 AS build
WORKDIR /app

# Copy entire project
COPY . .

RUN mvn dependency:go-offline -B
RUN mvn package -DskipTests -B

# Run stage (use -jre to avoid Alpine metadata resolve issues)
FROM eclipse-temurin:17-jre
WORKDIR /app

RUN apt-get update && apt-get install -y --no-install-recommends curl \
    && rm -rf /var/lib/apt/lists/* \
    && useradd -m -s /bin/bash appuser
USER appuser

COPY --from=build /app/nexxus-starter/target/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
