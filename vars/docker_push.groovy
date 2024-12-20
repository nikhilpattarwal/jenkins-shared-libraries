def call(String image, String tag ){
   withCredentials([usernamePassword(credentialsId: 'dockerHubCred', passwordVariable: 'dockerHubPass', usernameVariable: 'dockerHubUser')]){
                 sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
                 sh "docker push ${dockerHubUser}/${image}:${tag}"
                 }
}
