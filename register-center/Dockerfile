FROM registry.cn-beijing.aliyuncs.com/ailikes_tools/alpine-openjdk8:latest
VOLUME /tmp
ADD ./target/eureka-server.jar app.jar
RUN sh -c 'touch /app.jar'
EXPOSE 1111
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]