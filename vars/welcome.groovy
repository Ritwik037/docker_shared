def call(){
  sh 'docker build -t $docker_credentials_USR/sample:$BUILD_NUMBER .'
  sh 'docker login -u $docker_credentials_USR -P $docker_credentials_PSW'
  SH 'docker push $docker_credentials_USR/sample:$BUILD_NUMBER'

}  

