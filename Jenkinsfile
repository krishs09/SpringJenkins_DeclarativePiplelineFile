pipeline {

    agent any
	
	tools { 
        maven 'M2_HOME' 
    }

    stages {
	
		stage ('Initialize') {
            steps {
                
                    echo "PATH = %PATH%"
                    echo "M2_HOME = %M2_HOME%"
              
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
