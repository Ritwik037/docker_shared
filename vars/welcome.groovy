def call(Map config = [:] ) {
//   sh "echo ${config.userName} ${config.passWord}"
  sh "docker build -t ${config.userName}/sample:$BUILD_NUMBER ."
  sh "docker login -u ${config.userName} -p ${config.passWord}"
  sh "docker push ${config.userName}/sample:$BUILD_NUMBER"
  sh "docker logout"

}  

