FROM  java:8
VOLUME /tmp
ADD snow-client-demo-0.0.1-SNAPSHOT.jar  app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]