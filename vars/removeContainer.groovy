def call(){
    sh 'docker stop Youtube'
    sh 'docker rm Youtube'
}
