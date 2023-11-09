def call (String USERHUB, String IMAGENAME){

   sh """
   sudo apt-get update
   sudo apt-get install trivy -y
   trivy image ${USERHUB}/${IMAGENAME}:${BUILD_NUMBER} > scan.txt
   cat scan.txt

   """

}