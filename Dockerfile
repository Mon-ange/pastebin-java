FROM openjdk:17
COPY ./target/pastebin-0.0.1-SNAPSHOT.jar /usr/src/myapp/pastebin-0.0.1-SNAPSHOT.jar
WORKDIR /usr/src/myapp
ENTRYPOINT ["java","-jar","pastebin-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080