
FROM openjdk:17

EXPOSE 9096

ADD target/devops.jar devops.jar

ENTRYPOINT [ "java","-jar","devops" ]