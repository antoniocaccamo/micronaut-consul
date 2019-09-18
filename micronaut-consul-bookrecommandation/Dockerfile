FROM adoptopenjdk/openjdk8:alpine-slim
COPY target/micronaut-consul-bookrecommandation.jar micronaut-consul-bookrecommandation.jar
EXPOSE 8082
CMD java -XX:+UnlockExperimentalVMOptions -XX:+UseCGroupMemoryLimitForHeap -Dcom.sun.management.jmxremote -noverify ${JAVA_OPTS} -jar micronaut-consul-bookrecommandation.jar