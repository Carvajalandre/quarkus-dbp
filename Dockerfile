FROM eclipse-temurin:17-jre
COPY target/quarkus-postgres-1.0.0-SNAPSHOT.jar /application.jar
CMD ["java", "-jar", "/application.jar"]
