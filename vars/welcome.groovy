def call(){
  sh 'docker service restart'
  sh 'docker ps'
  sh 'docker build -t $docker_credentials_USR/sample:latest .'
  sh 'echo $docker_credentials_PSW | docker login -u $docker_credentials_USR --password-stdin'
  sh 'docker push $docker_credentials_USR/sample:latest'
}  

