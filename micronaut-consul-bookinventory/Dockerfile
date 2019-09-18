FROM adoptopenjdk/openjdk8:alpine-slim
COPY target/micronaut-consul-bookinventory.jar micronaut-consul-bookinventory.jar
EXPOSE 8081
CMD java -XX:+UnlockExperimentalVMOptions -XX:+UseCGroupMemoryLimitForHeap -Dcom.sun.management.jmxremote -noverify ${JAVA_OPTS} -jar micronaut-consul-bookinventory.jar