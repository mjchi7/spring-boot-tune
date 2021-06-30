FROM openjdk:11.0.11-slim

RUN mkdir -p /java/run
WORKDIR /java/run

COPY build/libs/mongocall-0.0.1-SNAPSHOT.jar /java/run/mongocall-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "mongocall-0.0.1-SNAPSHOT.jar"]