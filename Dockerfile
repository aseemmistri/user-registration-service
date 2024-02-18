FROM openjdk:17-jdk-slim
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/user-registration-service.jar
ADD ${JAR_FILE} userregistration.jar
ENTRYPOINT [ "java","-jar","/userregistration.jar" ]

MAINTAINER "aseem & Raj"

