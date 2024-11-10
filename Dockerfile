FROM openjdk:17-jdk-alpine
ARG JAR_FILE=build/libs/DeployProject-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} deploy-project.jar

ENTRYPOINT ["java", "-jar", "deploy-project.jar"]