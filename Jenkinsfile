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
                bat './gradlew build'
            }
        }
        stage('Test') {
            steps {
                bat './gradlew test'
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: '**/*.jar'
            junit 'build/test-results/**/*.xml'
        }
    }
}