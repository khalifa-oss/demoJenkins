FROM openjdk
EXPOSE 8081
ADD target/demo-jenkins-docker.jar demo-jenkins-docker.jar
ENTRYPOINT ["java","-jar","demo-jenkins-docker.jar"]
