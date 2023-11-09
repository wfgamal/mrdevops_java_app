def call (String USERHUB, String IMAGENAME){

   sh """
   apt-get install wget apt-transport-https gnupg lsb-release
   wget -qO - https://aquasecurity.github.io/trivy-repo/deb/public.key | apt-key add -
   echo deb https://aquasecurity.github.io/trivy-repo/deb '$(lsb_release -sc)' main | tee -a /etc/apt/sources.list.d/trivy.list
   apt-get update
   apt-get install trivy -y
   trivy image '${USERHUB}'/'${IMAGENAME}':'${BUILD_NUMBER}' > scan.txt
   cat scan.txt

   """

}