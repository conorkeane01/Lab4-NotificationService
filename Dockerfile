FROM openjdk:21-jdk-oracle

WORKDIR /app

COPY target/NotificationService-0.0.1-SNAPSHOT.jar /app

EXPOSE 8083

CMD ["java", "-jar", "NotificationService-0.0.1-SNAPSHOT.jar"]