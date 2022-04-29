def call(Map config = [:] ) {
//   sh "echo ${config.userName} ${config.passWord}"
  sh 'docker build -t $${config.userName}/sample:$BUILD_NUMBER .'
  sh 'docker login -u $${config.username} -p $${config.password}'
  sh 'docker push $${config.username}/sample:$BUILD_NUMBER'
  sh 'docker logout'

}  

