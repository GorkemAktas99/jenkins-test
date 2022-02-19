pipeline {
    agent any //where execute
    stages{ // where the "work" happens
        stage("build"){
            steps{
                sh 'apt update'
                sh 'apt install python -y'
                sh 'python --version'
                sh 'apt install docker.io -y'
                sh 'docker container ls -a'
                echo 'building the applicatin'
                echo BRANCH_NAME
            }
        }
        stage("test"){
            steps{
                echo 'testing the application'
            }
        }
        stage("deploy"){
            steps{
                echo 'deploying the application'
            }
        }
    }
}
node {

}
