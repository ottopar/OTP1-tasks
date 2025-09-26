FROM maven:3.8.6-openjdk-21 AS build

WORKDIR /app

COPY pom.xml /app/
COPY src /app/src/

RUN mvn clean package -DskipTests

FROM openjdk:21-jre-slim

WORKDIR /app

COPY --from=build /app/target/OTP1-tasks-1.0-SNAPSHOT.jar /app/temperature-converter.jar

CMD ["java", "-cp", "temperature-converter.jar", "Tasks.TemperatureConverter"]
