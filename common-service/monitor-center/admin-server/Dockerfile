FROM frolvlad/alpine-oraclejdk8
VOLUME /tmp
ADD ./target/admin-server.jar app.jar
RUN sh -c 'touch /app.jar'
EXPOSE 8888
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]