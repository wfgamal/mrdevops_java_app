def call (String USERHUB, String IMAGENAME){

   sh """

   docker rmi ${USERHUB}/${IMAGENAME}:${BUILD_NUMBER}
   docker rmi ${USERHUB}/${IMAGENAME}:latest
   """

}