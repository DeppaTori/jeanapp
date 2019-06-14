FROM java:8-jdk-alpine

COPY ./target/jeanapp-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch jeanapp-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","jeanapp-0.0.1-SNAPSHOT.jar"]