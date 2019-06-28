FROM registry.cn-beijing.aliyuncs.com/ailikes_tools/alpine-openjdk8:latest
VOLUME /tmp
ADD ./target/front-web.jar app.jar
EXPOSE 8001
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]