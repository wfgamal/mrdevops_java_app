FROM openjdk:8-jdk-alpine
RUN useradd -ms /bin/bash javauser
USER javauser
WORKDIR /app
COPY ./target/*.jar app.jar
ENTRYPOINT [ "java","-jar","app.jar" ]