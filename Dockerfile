FROM maven:3.8.6-openjdk-21 AS build

WORKDIR /app

COPY pom.xml /app/
COPY src /app/src/

RUN mvn clean package -DskipTests

CMD ["java", "-cp", "temperature-converter.jar", "Tasks.TemperatureConverter"]
