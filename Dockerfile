# back
FROM openjdk:8-jdk-alpine

LABEL maintainer="2262288@gmail.com"
VOLUME /tmp

EXPOSE 8099

ARG JAR_FILE=build/libs/rebounder-chain-backend-0.0.20.jar
ADD ${JAR_FILE} rebounder-chain-backend.jar
ENTRYPOINT ["java","-jar","/rebounder-chain-backend.jar"]