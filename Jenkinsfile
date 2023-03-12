pipeline {

    agent any

    stages {

		stage('Build') {
            steps {
                echo 'Bulding App'
            }
        }
        
		stage('Test') {
            steps {
                echo 'Testing App'
            }
        } 
		
		stage('Deploy') {
            steps {
                echo 'Deploying App'
            }
        }
    }
    
    post {
        
        always
        {
            emailext body: 'Summary', subject: 'Pipeline status', to: 'kyadav016@gmail.com'    
        }
    }
}
