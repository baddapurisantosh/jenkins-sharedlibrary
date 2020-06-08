def call(){
pipeline {
    agent any
	environment {
	def buildCommand = "mvn clean install -DskipTests"
	def mavenImage = "maven:3.6-jdk-8"
	def registry = "baddapurisanthosh/myapps"
    def registryCredential = ‘dockerhub’
	}
            stages {
        stage ('checkout') {
            steps {
                git credentialsId: 'git', url: 'https://github.com/baddapurisantosh/raam.git'
                }
        }
      }
   }
}
