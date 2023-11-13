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


//     stage('mvn unitTest'){
//       steps{
//         script{

//             mvnTest()

//         }

        
//       }
// }


//     stage('mvn Integration Test'){
//       steps{
//         script{

//             mvnIntegrationTest()

//         }

//       }
// }

    

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
        
        script{

            def SonarQubecredentialsId = 'sonarqube'
            qualityGate(SonarQubecredentialsId)

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

    stage('Docker Image Build'){
      steps{
        script{

            dockerImageBuild("wfgamal","mrdevopsapp")

        }

      }
}

//     stage('Docker Image scan: Trivy'){
//       steps{
//         script{

//             dockerImageScan("wfgamal","mrdevopsapp")

//         }

//       }
// }
    stage('Docker Image Push'){
      steps{
        script{

            dockerImagePush("wfgamal","mrdevopsapp")

        }

      }
}
    stage('Docker Image Cleanup'){
      steps{
        script{

            dockerImageCleanup("wfgamal","mrdevopsapp")

        }

      }
}
}

}