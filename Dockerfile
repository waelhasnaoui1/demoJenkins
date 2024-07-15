FROM openjdk:17-jdk-alpine

COPY target/demojenkins-1.jar demojenkins-1.jar


ENTRYPOINT ["java","-jar","/demojenkins-1.jar"]