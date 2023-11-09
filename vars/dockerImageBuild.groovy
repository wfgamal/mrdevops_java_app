def call (String USERHUB, String IMAGENAME){

   sh """
   docker build -t ${USERHUB}/${IMAGENAME} .
   docker tag ${USERHUB}/${IMAGENAME} ${USERHUB}/${IMAGENAME}:${BUILD_NUMBER}
   docker tag ${USERHUB}/${IMAGENAME} ${USERHUB}/${IMAGENAME}:latest
   """

}