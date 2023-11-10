def call (String USERHUB, String IMAGENAME){


 // Install trivy
                sh 'curl -sfL https://raw.githubusercontent.com/aquasecurity/trivy/main/contrib/install.sh | sh -s -- -b /usr/local/bin v0.18.3'
                sh 'curl -sfL https://raw.githubusercontent.com/aquasecurity/trivy/main/contrib/html.tpl > html.tpl'

   sh """
   trivy image ${USERHUB}/${IMAGENAME}:${BUILD_NUMBER} > scan.txt
   cat scan.txt

   """

}