
FROM openjdk:17

EXPOSE 9096

ADD target/devops-0.0.1-SNAPSHOT.jar devops-0.0.1-SNAPSHOT.jar

ENTRYPOINT [ "java","-jar","/devops-0.0.1-SNAPSHOT" ]