FROM openjdk:8
EXPOSE 9000
ADD target/springboot-jpa-final.jar springboot-jpa-final.jar
ENTRYPOINT [ "java","-jar","/springboot-jpa-final.jar" ]