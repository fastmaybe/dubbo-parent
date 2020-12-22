FROM openjdk:8-jdk-alpine
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
ADD target/*.jar app.jar
EXPOSE 7001
ENTRYPOINT exec java $JAVA_OPTS  -jar app.jar