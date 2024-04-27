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
                powershell './gradlew build --scan'
            }
        }
        stage('Test') {
            steps {
                powershell './gradlew test'
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