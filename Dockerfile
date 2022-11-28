FROM openjdk
EXPOSE 8080
ADD target/*.jar demo-jenkins-docker.jar
ENTRYPOINT["java","-jar","demo-jenkins-docker.jar"]
