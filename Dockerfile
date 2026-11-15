FROM maven:3.9.12-eclipse-temurin-25
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline #pobieranie offline
COPY src ./src
COPY src/main/resources/appsettings.docker.properties \
     ./src/main/resources/appsettings.properties
RUN mvn clean package
CMD ["java", "-jar", "target/dlogistic-1.0-SNAPSHOT.jar"]