def call(Map config = [:] ) {
  sh 'echo ${config.username}'
  sh 'docker build -t $({config.username})/sample:$BUILD_NUMBER .'
  sh 'docker login -u $$({config.username}) -p $(${config.password})'
  sh 'docker push $$({config.username})/sample:$BUILD_NUMBER'
  sh 'docker logout'

}  

