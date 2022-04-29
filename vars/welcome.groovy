def call(){
  sh 'docker ps'
  sh 'docker build -t $docker_ credentials_USR/sample:latest .'
  sh 'docker login -u $docker_credentials_USR -p $docker_credentials_PSW'
  sh 'docker push $docker_credentials_USR/sample:latest'
}  

