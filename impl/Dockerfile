FROM openjdk:24-ea-21-jdk-slim-bookworm
WORKDIR /app

COPY target/impl-0.0.1-SNAPSHOT.jar loyalty.jar

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "loyalty.jar"]