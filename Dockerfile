FROM openjdk:17
WORKDIR /app
COPY ./target/kafka-0.0.1-SNAPSHOT.jar /app
EXPOSE 8000
CMD ["java","-jar","kafka-0.0.1-SNAPSHOT.jar"]