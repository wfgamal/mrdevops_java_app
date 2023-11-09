def call (String USERHUB, String IMAGENAME){

   sh """
   apt-get update
   apt-get install trivy -y
   trivy image ${USERHUB}/${IMAGENAME}:${BUILD_NUMBER} > scan.txt
   cat scan.txt

   """

}