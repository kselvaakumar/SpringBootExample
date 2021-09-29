FROM adoptopenjdk/openjdk11:alpine-jre
#FROM ghcr.io/graalvm/graalvm-ce:latest
ADD target/SpringBootExample-0.0.1-SNAPSHOT.jar spring-boot-graalvm.jar
EXPOSE 30000
ENTRYPOINT ["java","-jar","spring-boot-graalvm.jar"]