#FROM openjdk:11-jdk-slim
FROM fabric8/java-alpine-openjdk8-jdk:1.6.2
#FROM amazoncorretto:8
COPY target/collector.jar /opt/collector.jar
ENTRYPOINT ["java",  "-Xms1024m", "-Xmx2048m", "-XX:MetaspaceSize=96m", "-XX:+UseG1GC", "-XX:MaxGCPauseMillis=20",  "-XX:InitiatingHeapOccupancyPercent=35", "-XX:G1HeapRegionSize=16M", "-XX:MinMetaspaceFreeRatio=50", "-XX:MaxMetaspaceFreeRatio=80", "-jar","/opt/collector.jar"]
EXPOSE 5002
