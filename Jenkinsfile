// TODO: Remove hard coded mvn path as this only works on the fpcmslinuxsb1.fmr.com jenkins instance
node('master'){
  def mvnPath="/home/tcserver/.jenkins/tools/hudson.tasks.Maven_MavenInstallation/Maven_3.x/bin/"
  def javaHome="/opt/common/jdk1.8.0_60"
  env.PATH= "${mvnPath}:${javaHome}/bin:${env.PATH}"
  stage 'checkout'
    checkout scm
  stage 'build'
    sh """
    java -version
    echo \$PATH
    export https_proxy=http://http.proxy.fmr.com:8000
    export http_proxy=http://http.proxy.fmr.com:8000
    export DOCKER_HOST=tcp://fpcms-hygieia.fmr.com:2376

    mvn install -DskipTests
    mvn docker:build
    """
  stage 'Shutting down'
    sh "ssh a568788@fpcms-hygieia 'docker-compose down'"
  stage 'Updating docker compose'
    sh "ssh a568788@fpcms-hygieia curl -o /home/a568788/docker-compose.yml -k https://itec-stash.fmr.com/projects/PL200440/repos/jenkins-phoenix-poc/browse/Hygieia/docker-compose.yml?raw"
  stage 'Starting Hygieia'
    sh "ssh a568788@fpcms-hygieia 'docker-compose up -d'"
}