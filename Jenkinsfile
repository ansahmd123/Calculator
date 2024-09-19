pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build') {
            steps {
                bat './gradlew clean build'
            }
        }
        stage('Test') {
            steps {
                bat './gradlew test'
            }
        }
        stage('Post-Build Actions'){
            steps {
                archiveArtifacts artifacts: '**/build/libs/*.jar'
                junit 'build/test-results/**/*.xml'
            }
        }
    }

}