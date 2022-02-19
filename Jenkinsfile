pipeline {
    agent any //where execute
    stages{ // where the "work" happens
        stage("build"){
            steps{
                sh 'npm install'
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