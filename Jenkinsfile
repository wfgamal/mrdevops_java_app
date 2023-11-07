// @Library('shared-lib') _
@Library("shared-lib") _

pipeline{

  agent any
  tools {
        maven 'Maven 3.9.5'
        
    }

stages{
    stage('Git checkout'){
      steps{

        git branch: 'main', url: 'https://github.com/wfgamal/mrdevops_java_app.git'
      }
}


    stage('mvn unitTest'){
      steps{
        script{

            mvnTest()

        }

        
      }
}


    stage('mvn Integration Test'){
      steps{
        script{

            mvnIntegrationTest()

        }

      }
}

tage('mvn Build'){
      steps{
        script{

            mvnBuild()

        }

      }
}
}

}