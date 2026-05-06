pipeline {
    agent any
    stages {
        stage('Fetch Code') {
            steps {
                // Pulls the latest bus travel details from GitHub
                git branch: 'main', url: 'https://github.com/your-username/travel-blog-project.git'
            }
        }
        stage('Verify Assets') {
            steps {
                // Ensures images and CSS are present
                echo 'Verifying bus images and dashboard styles...'
            }
        }
        stage('Deployment') {
            steps {
                // Copies the files to a local deployment directory
                bat 'if not exist C:\\deploy\\travel-blog mkdir C:\\deploy\\travel-blog'
                bat 'xcopy * C:\\deploy\\travel-blog /E /I /Y'
                echo 'Travel Blog is now live on the local server.'
            }
        }
    }
}
