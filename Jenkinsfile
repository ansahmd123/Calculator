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
        stage('Build&Test') {
            steps {
                bat './gradlew clean build'
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