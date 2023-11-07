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

    stage('mvn Build'){
      steps{
        script{

            mvnBuild()

        }

      }
}

    stage('StaticCode Analysis: sonarqube'){
      steps{
        script{

            def SonarQubecredentialsId = 'sonarqube'
            staticAnalysis(SonarQubecredentialsId)

        }

      }
}

stage('quality Gate check: sonarqube'){
      
      steps{
        timeout(time: 5, unit: 'MINUTES')
        script{

            def SonarQubecredentialsId = 'sonarqube'
            qualityGate(SonarQubecredentialsId)

        }

      }
}
}

}