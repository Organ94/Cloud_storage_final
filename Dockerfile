FROM openjdk:18-jdk-alpine3.13

EXPOSE 5050

ADD target/Cloud_storage_finel-0.0.1-SNAPSHOT.jar diplom.jar

ENTRYPOINT ["java", "-jar", "diplom.jar"]