pipeline {

    agent any
	
	tools { 
        maven 'MAVEN' 
    }

    stages {
	
		stage ('Initialize') {
            steps {
                
                    echo 'PATH = %PATH%'
                    echo 'M2_HOME = %M2_HOME%'
              
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
