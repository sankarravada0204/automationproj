FROM openjdk:8
EXPOSE 8080
ADD target/docker-jenkins-automation-proj.jar docker-jenkins-automation-proj.jar
ENTRYPOINT ["java","-jar","/docker-jenkins-automation-proj.jar"]
