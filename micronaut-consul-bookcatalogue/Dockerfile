FROM adoptopenjdk/openjdk8:alpine-slim
COPY target/micronaut-consul-bookcatalogue.jar micronaut-consul-bookcatalogue.jar
EXPOSE 8080
CMD java -XX:+UnlockExperimentalVMOptions -XX:+UseCGroupMemoryLimitForHeap \
         -Dcom.sun.management.jmxremote -noverify -Djava.security.egd=file:/dev/./urandom \
         ${JAVA_OPTS} -jar micronaut-consul-bookcatalogue.jar