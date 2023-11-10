def call (String USERHUB, String IMAGENAME){


 // Install trivy
                sh 'sudo chmod -R 777 /usr/bin'
                sh 'curl -sfL https://raw.githubusercontent.com/aquasecurity/trivy/main/contrib/install.sh | sh -s -- -b /usr/bin v0.18.3'
                sh 'curl -sfL https://raw.githubusercontent.com/aquasecurity/trivy/main/contrib/html.tpl > html.tpl'

   sh """
   trivy image ${USERHUB}/${IMAGENAME}:${BUILD_NUMBER} > scan.txt
   cat scan.txt

   """

}