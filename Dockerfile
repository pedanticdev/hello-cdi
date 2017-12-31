FROM airhacks/glassfish
COPY ./target/hello-world-cdi.war ${DEPLOYMENT_DIR}
