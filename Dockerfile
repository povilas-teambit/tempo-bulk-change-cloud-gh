FROM maven:3.9.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17-jre-slim
VOLUME /tmp
COPY --from=build /target/tbc-c-1.0.0.jar tempo-bulk-change-cloud.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","tempo-bulk-change-cloud.jar"]