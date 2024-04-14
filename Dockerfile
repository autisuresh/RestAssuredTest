FROM eclipse-temurin:22-jdk-alpine

COPY src /RestAssuredTest/src

COPY pom.xml /RestAssuredTest/pom.xml

WORKDIR /RestAssuredTest/

ENTRYPOINT mvn clean test
# need to work on file