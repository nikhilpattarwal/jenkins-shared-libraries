def call(String dockerUser, String image, String imageTag){
   sh "docker build -t ${dockerUser}/${image}:${imageTag} ."
}
