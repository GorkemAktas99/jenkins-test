pipeline {
    agent any //where execute
    environment {
        NEW_VERSION = '1.3.0'
    }
    parameters {
        choice(name:'VERSION',choices:['1.1.0','1.2.0'],description:'')
    }
    stages{ // where the "work" happens
        stage("build"){
            steps{
                sh 'docker container run -i ubuntu /bin/bash'
                sh 'whoami'
                echo 'building the applicatin'
                echo BRANCH_NAME
                echo "building version ${params.VERSION}"
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
