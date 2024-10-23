FROM openjdk:17

ARG JAR_FILE=build/libs/opensearch-demo-0.0.1-SNAPSHOT.jar

RUN mkdir -p /app/logs
WORKDIR /app
COPY ${JAR_FILE} /app/app.jar

EXPOSE 8818

ENTRYPOINT ["/bin/sh", "-c","java -jar /app/app.jar --mpw.key=ae119551916f74d5"]