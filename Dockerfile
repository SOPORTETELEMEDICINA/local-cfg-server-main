# Dockerfile de local-cfg-server
FROM openjdk:8-jdk-alpine
ENV JAVA_HOME /usr/lib/jvm/java-1.8-openjdk
VOLUME /localcfg
ADD target/local-cfg-server-1.0-SNAPSHOT.jar app.jar
ENV JAVA_OPTS="-Xmx512m -Duser.timezone=America/Mexico_City"
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar
