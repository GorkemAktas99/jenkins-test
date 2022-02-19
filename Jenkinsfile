def gv
pipeline {
    // sh ile calistirilan kodlar container icinde degil
    // containerlarin uzerinde kostugu makinada calisirlar
    agent any //where execute
    environment {
        NEW_VERSION = '1.3.0'
    }
    parameters{
        choice(name:'VERSION',choices:['1.1.0','1.2.0'],description:'')
        booleanParam(name:'executeTests',defaultValue:true,description:'')
    }
    stages{ // where the "work" happens
        stage("init"){
            steps{
                script{
                    gv = load "init.groovy"
                }
            }
        }
        stage("build"){
            steps{
                script{
                    gv.buildApp()
                }
            }
        }
        stage("test"){
            when{
                expression{
                    params.executeTests
                }
            }
            steps{
                script{
                    gv.testApp()
                }
            }
        }
        stage("deploy"){
            steps{
                script{
                    gv.deployApp()
                }
            }
        }
    }
}
node {

}