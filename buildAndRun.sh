#!/bin/sh
mvn clean package && docker build -t com.pedantic/hello-world-cdi .
docker rm -f hello-world-cdi || true && docker run -d -p 8080:8080 -p 4848:4848 --name hello-world-cdi com.pedantic/hello-world-cdi 
