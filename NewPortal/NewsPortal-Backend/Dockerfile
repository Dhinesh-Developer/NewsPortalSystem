FROM openjdk:17-jdk-slim
WORKDIR /app
LABEL maintainer="dhineshdeveloper"

# Copy the jar file into the image and rename it to app.jar
ADD target/NewsPortal-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
