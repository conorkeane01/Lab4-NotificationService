FROM openjdk:21-jdk-oracle

WORKDIR /app

COPY target/Week11Example-0.0.1-SNAPSHOT.jar /app

EXPOSE 8083

ENV SERVICE_NETWORK=my_network

CMD ["java", "-jar", "Week11Example-0.0.1-SNAPSHOT.jar"]