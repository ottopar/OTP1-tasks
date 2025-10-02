FROM openjdk:21-jdk
LABEL authors="ottopar"

WORKDIR /app

RUN apt-get update && apt-get install -y maven

COPY pom.xml /app
COPY src /app/src/

RUN mvn package

ENV DISPLAY=:0

CMD ["java", "--module-path", "/root/.m2/repository/org/openjfx/javafx-controls/20.0.1/javafx-controls-20.0.1.jar:/root/.m2/repository/org/openjfx/javafx-base/20.0.1/javafx-base-20.0.1.jar:/root/.m2/repository/org/openjfx/javafx-graphics/20.0.1/javafx-graphics-20.0.1.jar", "--add-modules", "javafx.controls,javafx.graphics", "-cp", "target/OTP1-tasks-1.0-SNAPSHOT.jar", "Tasks.Main"]
