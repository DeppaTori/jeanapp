node {
    def app

    stage('Clone repository') {
            checkout scm
     }

     stage('Build image') {
            app = docker.build("deppatori/jeanapp")
     }
}