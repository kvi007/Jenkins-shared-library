def call() {
    sh 'trivy image kiranitagi007/Youtube:latest > trivyimage.txt'
}
