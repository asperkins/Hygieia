node('maven-3.3'){
  stage 'checkout'
  checkout scm
  stage 'build'
  sh """
    export https_proxy=http://http.proxy.fmr.com:8000
    export http_proxy=http://http.proxy.fmr.com:8000
    export DOCKER_HOST=tcp://fpcms-hygieia.fmr.com:2376

    mvn install -DskipTests

    bin/mvn docker:build
"""
}