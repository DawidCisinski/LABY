FROM maven:3.9.12-eclipse-temurin-25

WORKDIR /app

COPY pom.xml .
RUN mvn dependency:go-offline

COPY src ./src

RUN mvn clean package

CMD ["java", "-jar", "target/my-app-1.jar"]