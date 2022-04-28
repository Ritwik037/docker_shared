def call(){
  sh 'docker ps'
  sh 'docker build -t ritwik72/sample:latest .'
  sh 'echo $docker_credentials_PSW | docker login -u $docker_credentials_USR --password-stdin'
  sh 'docker push ritwik72/sample:latest'
}  

