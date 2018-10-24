FROM openjdk:8u131-jre-alpine

ADD target/*.jar /opt/exam.jar

EXPOSE 8080

CMD [ "java", "-jar", "/opt/exam.jar" ]