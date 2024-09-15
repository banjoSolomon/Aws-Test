
FROM maven:3.8.7 AS build
COPY . .
RUN mvn -B clean package -DskipTests

# Run stage
FROM openjdk:17
COPY --from=build target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "-Dserver.port=8080", "app.jar"]
