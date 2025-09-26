FROM maven:latest
LABEL authors="ottopar"

WORKDIR /app

COPY pom.xml /app
COPY src /app/src/

RUN mvn package

CMD ["java", "-cp", "target/OTP1-tasks-1.0-SNAPSHOT.jar", "Tasks.TemperatureConverter"]
