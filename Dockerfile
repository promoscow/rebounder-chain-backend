# back
FROM openjdk:8-jdk-alpine

LABEL maintainer="2262288@gmail.com"

WORKDIR /usr/app/back
VOLUME /tmp

EXPOSE 8088

ARG JAR_FILE=build/libs/rebounder-chain-backend-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} rebounder-chain-backend.jar
ENTRYPOINT ["java","-jar","/rebounder-chain-backend.jar"]

# front
FROM node:alpine
LABEL maintainer="2262288@gmail.com"
WORKDIR /usr/app/front
COPY ../rebounder-chain-frontend/ ./

RUN npm install
CMD ["npm", "start"]