FROM openjdk:17

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:resolve
EXPOSE 8080

COPY src ./src

CMD ["./mvnw", "spring-boot:run"]