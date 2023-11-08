def call (string USERHUB, string IMAGENAME){

   docker build -t ${USERHUB}/${IMAGENAME}:${BUILD_NUMBER} .


}