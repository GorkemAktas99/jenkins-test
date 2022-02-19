pipeline {
    agent any //where execute
    stages{ // where the "work" happens
        stage("build"){
            steps{
                sh 'apt update'
                sh 'apt install python -y'
                sh 'python --version'
                echo 'building the applicatin'
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
