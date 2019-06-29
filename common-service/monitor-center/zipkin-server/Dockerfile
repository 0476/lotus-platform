FROM registry.cn-beijing.aliyuncs.com/ailikes_tools/alpine-openjdk8:latest

MAINTAINER ailikes <15600499930@163.com>
ENV LANG en_US.UTF-8
RUN apk add --update --no-cache ttf-dejavu fontconfig && rm -rf /var/cache/apk/*

VOLUME /tmp
ADD ./target/zipkin-server.jar app.jar
RUN sh -c 'touch /app.jar'
EXPOSE 11008
ENV JAVA_OPTS="-Duser.timezone=Asia/Shanghai"
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]