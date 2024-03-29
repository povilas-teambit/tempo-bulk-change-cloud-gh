FROM maven:3.9.6-eclipse-temurin-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM azul/zulu-openjdk:17-latest
VOLUME /tmp
COPY --from=build /target/tbc-c-1.0.0.jar tempo-bulk-change-cloud.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","tempo-bulk-change-cloud.jar"]