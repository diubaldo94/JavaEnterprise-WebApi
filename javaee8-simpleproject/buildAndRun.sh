#!/bin/sh
mvn clean package && docker build -t diubaldo.javaProejct/javaee8-simpleproject .
docker rm -f javaee8-simpleproject || true && docker run -d -p 8080:8080 -p 4848:4848 --name javaee8-simpleproject diubaldo.javaProejct/javaee8-simpleproject 
