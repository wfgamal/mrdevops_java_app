@Library('shared-lib') _

pipeline{

  agent any

stages{
    stage('Git checkout'){
      steps{

        git branch: 'main', url: 'https://github.com/wfgamal/mrdevops_java_app.git'
      }
}


    stage('mvn uniTest'){
      steps{
        script{

            sh 'mvn test'

        }

        
      }
}

}

}