def call() {
    sh 'trivy image kiranitagi007/youtube:latest > trivyimage.txt'
}
