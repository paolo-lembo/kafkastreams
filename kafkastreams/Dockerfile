FROM maven:3.8.5-openjdk-17 AS MAVEN_BUILD

WORKDIR /build/

COPY / /build/

RUN mvn clean package -Dmaven.test.skip

FROM eclipse-temurin:17-jdk-alpine

COPY --from=MAVEN_BUILD /build/target/*.jar app.jar
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
ENTRYPOINT ["java", "-jar","/app.jar"]