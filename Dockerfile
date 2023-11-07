FROM amazoncorretto:17-alpine-jdk

COPY target/ULTIMO-SERVICIO-REST-API-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]