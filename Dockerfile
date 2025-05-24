FROM openjdk:17

WORKDIR /app

#ARG DB_URL
#ARG DB_USERNAME
#ARG DB_PASSWORD
#
#ENV DB_URL=${DB_URL}
#ENV DB_USERNAME=${DB_USERNAME}
#ENV DB_PASSWORD=${DB_PASSWORD}

COPY ./target/course-service.jar /app

EXPOSE 8090

CMD ["java", "-jar", "course-service.jar"]