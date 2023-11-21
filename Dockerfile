FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} devsecops.jar
ENTRYPOINT ["java","-jar","/devsecops.jar"]