def call(){
    sh 'mvn test INCLUDE_SRC_TEST_IN_LIBRARIES=true'
}