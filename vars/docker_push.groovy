def call(String imageName, String imageTag, String dockerhubUser){
  withCredentials([usernamePassword(credentialsId: 'dockerHubCred', passwordVariable: 'dockerHubPass', usernameVariable: 'dockerHubUser')]){
    sh "docker login -u ${dockerhubUser} -p ${dockerHubPass}"
  }
  sh "docker push ${dockerhubUser}/${imageName}:${imageTag}"
}
  
