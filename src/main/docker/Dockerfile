FROM adoptopenjdk/openjdk8:jdk8u272-b10

LABEL maintainer="desarrolloit@guatex.com"

RUN apt-get update && apt-get install -y \
    iputils-ping \
    net-tools \
    less \
    nano

# Cambia la ruta al archivo JAR dentro del contexto de construcción correcto
ADD target/devoluciones_impresion-0.0.1-SNAPSHOT.jar /app.jar

EXPOSE 8088

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

