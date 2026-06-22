def call(String imageName, String imageTag, String dockerhubUser){
  sh "docker build -t ${dockerhubUser}/${imageName}:${imageTag} ."
}
