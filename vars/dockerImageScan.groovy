def call (String USERHUB, String IMAGENAME){

   sh """

   trivy image ${USERHUB}/${IMAGENAME}:${BUILD_NUMBER} > scan.txt
   cat scan.txt

   """

}