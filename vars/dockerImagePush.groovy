def call (String USERHUB, String IMAGENAME){
    withCredentials([usernamePassword(credentialsId: 'dockerhub', passwordVariable: 'PASS', usernameVariable: 'USERNAME')]) {
    sh 'docker login -u $USERNAME -p $PASS'
}
sh """
  docker push ${USERHUB}/${IMAGENAME}:${BUILD_NUMBER}

"""

}