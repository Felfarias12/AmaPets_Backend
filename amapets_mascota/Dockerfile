FROM eclipse-temurin:21-jdk-jammy

WORKDIR /Micromasco

COPY *.jar app.jar

EXPOSE 7579

ENTRYPOINT ["java", "-jar", "app.jar"]