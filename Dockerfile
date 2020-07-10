FROM openjdk:8-jre-slim
EXPOSE 8080
COPY target/pizza-0.0.1-SNAPSHOT.jar /usr/app/pizza-0.0.1-SNAPSHOT.jar
WORKDIR /usr/app/
ENTRYPOINT ["java","-jar","/usr/app/pizza-0.0.1-SNAPSHOT.jar"]