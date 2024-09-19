pipeline {
    agent any

    options {
            skipDefaultCheckout(true)
            timestamps()
    }

    stages {
        stage('Prepare Environment') {
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