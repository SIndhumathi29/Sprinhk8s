FROM openjdk:11
ADD target/springk8s.jar springk8s.jar
EXPOSE 8086
ENTRYPOINT ["java","-jar","springk8s.jar"]