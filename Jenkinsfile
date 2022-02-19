pipeline {
    agent any //where execute
    environment {
        NEW_VERSION = '1.3.0'
    }
    stages{ // where the "work" happens
        stage("build"){
            steps{
                sh 'docker container run -it ubuntu /bin/bash'
                sh 'whoami'
                echo 'building the applicatin'
                echo BRANCH_NAME
                echo "building version ${NEW_VERSION}"
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
