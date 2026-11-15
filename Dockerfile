FROM maven:3.9.12-eclipse-temurin-25
WORKDIR /app
COPY pom.xml .
COPY src ./src
COPY appsettings.docker .
RUN mvn clean package
CMD ["java", "-jar", "target/dlogistic-1.0-SNAPSHOT.jar"]