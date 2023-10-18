FROM openjdk:8
EXPOSE 8000
ADD target/Jenkinss-0.0.1-SNAPSHOT.jar Jenkinss-0.0.1-SNAPSHOT.jar
ENTRYPOINT["java", "-jar", "/Jenkinss-0.0.1-SNAPSHOT.jar"]