FROM openjdk:11

COPY build/libs/template.jar /usr/app/template.jar
COPY start.sh /usr/app/start.sh

ENTRYPOINT ["/usr/app/start.sh"]