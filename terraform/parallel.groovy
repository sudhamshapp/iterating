pipeline {
    agent any
    stages {
        stage('Parallel Execution') {
            parallel {
                stage('Clone and Build Repo 1') {
                    steps {
                        sh 'ls -ltra'
                        sh 'cd absolute-path-of-the-directory && mvn clean install'
                    }
                }
                stage('Clone and Build Repo 2') {
                    steps {
                        sh 'ls -ltra'
                        sh 'cd absolute-path-of-the-directory && mvn clean install'
                    }
                }
                stage('Clone and Build Repo 3') {
                    steps {
                        sh 'ls -ltra'
                        sh 'cd absolute-path-of-the-directory && mvn clean install'
                    }
                }
                stage('Clone and Build Repo 4') {
                    steps {
                        sh 'ls -ltra'
                        sh 'cd absolute-path-of-the-directory && mvn clean install'
                    }
                }
            }
        }
    }
}
