pipeline {
    agent any

    stages {
//         stage('Checkout') {
//             steps {
//                 checkout scm
//             }
//         }
        stage('Test') {
            steps {
                sh 'chmod +x ./gradlew'
                sh './gradlew test'
            }
        }
        stage('Build') {
            steps {
                sh './gradlew build -x test'
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