FROM maven:latest
label authors="ottopar"

WORKDIR /app

COPY pom.xml /app
COPY src /app/src/

RUN mvn package

CMD ["java", "-jar", "target/temperature-converter.jar"]
