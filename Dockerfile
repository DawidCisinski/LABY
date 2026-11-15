# Etap budowania
FROM maven:latest AS build
#FROM maven:3.9.9-eclipse-temurin-25 AS build
RUN java --version

WORKDIR /app

COPY . .

# Nadpisanie konfiguracji dockerowej
RUN cp src/main/resources/appsettings.docker.properties \
          src/main/resources/appsettings.properties

RUN mvn clean package

# Etap uruchomienia
FROM eclipse-temurin:25-jre

WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]