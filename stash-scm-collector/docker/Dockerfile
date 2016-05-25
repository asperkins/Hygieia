
FROM docker.io/java:openjdk-8-jdk

MAINTAINER Hygieia@capitalone.com

ENV http_proxy="http://http.proxy.fmr.com:8000"
ENV https_proxy="http://http.proxy.fmr.com:8000"

RUN \
  mkdir /hygieia && apt-get -y install vim

COPY *.jar /hygieia/
COPY stash-properties-builder.sh /hygieia/

WORKDIR /hygieia

VOLUME ["/hygieia/logs"]

CMD ./stash-properties-builder.sh && \
  java -jar stash-scm-collector*.jar --spring.config.location=/hygieia/hygieia-stash-scm-collector.properties

