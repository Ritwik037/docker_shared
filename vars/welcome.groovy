def call(variable){
  sh 'docker build -t ${variable}_USR/sample:$BUILD_NUMBER .'
  sh 'docker login -u ${variable}_USR -p ${variable}_PSW'
  sh 'docker push ${variable}_USR/sample:$BUILD_NUMBER'
  sh 'docker logout'

}  

