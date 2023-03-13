pipeline {

    agent any
	
	tools { 
        maven "Maven"
    }

    stages {
	
		stage ('Initialize') {
            steps {
                
                    echo 'PATH = %PATH%'
                    echo 'M2_HOME = %Maven%'
              
            }
        }

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
}
