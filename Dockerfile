FROM java:8
COPY . /var/www/java
WORKDIR /var/www/java
RUN javac src/main/java/org/example/Main.java
CMD ["java", "Hello"]