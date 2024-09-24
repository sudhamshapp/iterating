pipeline {
    agent any
    stages {
        stage('parallel stages'){
            parallel {
                stage('clone the repo'){
                    steps {
                        sh 'ls -ltra'
                        sh cd 'absolute-path-of-the-directory && mvn clean install'
                    }
                }
                stage('clone the repo'){
                    steps {
                        sh 'ls -ltra'
                        sh cd 'absolute-path-of-the-directory && mvn clean install'
                    }
                }
                stage('clone the repo'){
                    steps {
                        sh 'ls -ltra'
                        sh cd 'absolute-path-of-the-directory && mvn clean install'
                    }
                }
                stage('clone the repo'){
                    steps {
                        sh 'ls -ltra'
                        sh cd 'absolute-path-of-the-directory && mvn clean install'
                    }
                }

            }
            
        }

    }
}