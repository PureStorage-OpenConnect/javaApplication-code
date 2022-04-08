FROM openjdk:14.0-jdk-buster

WORKDIR /work

COPY code/mvnw /work/mvnw
COPY code/.mvn /work/.mvn
COPY code/pom.xml /work/pom.xml

RUN ./mvnw dependency:go-offline

COPY code/ /work/
RUN ./mvnw install

RUN chmod +x /work/target/demo-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/work/target/demo-0.0.1-SNAPSHOT.jar"]
