// @Library('shared-lib') _

pipeline{

  agent any
  tools {
        maven 'Maven 3.9.5'
        jdk 'Java 17.0.4.1'
    }

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