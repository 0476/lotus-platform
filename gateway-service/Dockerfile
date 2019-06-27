FROM registry.cn-beijing.aliyuncs.com/ailikes_tools/alpine-openjdk8:latest
VOLUME /tmp
ADD ./target/gateway-service.jar app.jar
RUN sh -c 'touch /app.jar'
EXPOSE 2222
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]