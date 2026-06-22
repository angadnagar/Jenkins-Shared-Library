def call(string imageName, string imageTag, string dockerhubUser){
  sh "docker build -t ${dockerhubUser}/${imageName}:${imageTag} ."
}
