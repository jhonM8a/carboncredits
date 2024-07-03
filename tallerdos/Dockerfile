FROM maven:latest AS build

WORKDIR /tallerdos
COPY pom.xml .
COPY src/ ./src/

RUN mvn clean package -DskipTests


FROM openjdk:23-jdk-slim

WORKDIR /tallerdos
COPY --from=build /tallerdos/target/tallerdos-0.0.1-SNAPSHOT.jar ./tallerdos.jar

EXPOSE 8080

CMD ["java", "-jar", "tallerdos.jar"]
