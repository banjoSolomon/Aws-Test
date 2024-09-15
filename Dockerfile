FROM maven:3.8.7 as build
COPY testing .
RUN mvn -B clean package -DskipTests

FROM openjdk:17
COPY --from=build target/*.jar testing.jar
EXPOSE 8080


ENTRYPOINT ["java", "-jar", "-Dserver.port=8080", "testing.jar"]