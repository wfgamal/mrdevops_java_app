def call (string USERHUB, string IMAGENAME){

   sh 'docker build -t ${USERHUB}/${IMAGENAME}:${BUILD_NUMBER} .'


}