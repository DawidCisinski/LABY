FROM maven:3.9.12-eclipse-temurin-25
WORKDIR /app
COPY pom.xml .

RUN mkdir -p /orders

COPY src ./src

COPY src/main/resources/appsettings.docker.properties \
     ./src/main/resources/appsettings.properties

RUN mvn clean package
CMD ["java", "-jar", "target/zamow-1.0-SNAPSHOT.jar"]