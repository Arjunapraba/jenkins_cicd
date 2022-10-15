FROM openjdk:8
EXPOSE 8080
ADD target/Spring_demo-0.0.1-SNAPSHOT.war Spring_demo-0.0.1-SNAPSHOT.war
ENTRYPOINT ["java","-jar","/Spring_demo-0.0.1-SNAPSHOT.war"]