pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                dir('dating-server/example-service') {
                    sh 'mvn -B -ntp clean package -DskipTests'
                }
            }
        }

        stage('Image') {
            steps {
                sh 'docker build -t dating-example-service:dev ./dating-server/example-service'
            }
        }

        stage('Deploy') {
            steps {
                sh 'docker compose -f docker-compose.app.yml up -d'
            }
        }
    }
}