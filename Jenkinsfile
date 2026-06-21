import com.calypso.VersionUtils
@Library('groovy-pipeline-library@java21') _

pipeline {

    agent any

    stages {

        stage('Version') {
            steps {
                script {
                    def version = VersionUtils.generateVersion(this)

                    echo "Version = ${version}"

                    createGitTag(version)

                }
            }
        }

        stage('Test') {
            steps {
                sh 'chmod +x ./gradlew'
                sh './gradlew test'
            }
        }

        stage('Build') {
            steps {
                gradleBuild()
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