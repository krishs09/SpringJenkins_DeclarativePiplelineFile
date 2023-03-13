pipeline {

    agent any
	
	tools { 
        maven 'Maven' 
    }

    stages {
	
		stage ('Initialize') {
            steps {
                
                    echo 'PATH = %PATH%'
                    echo 'M2_HOME = %Maven%'
              
            }
        }
		
		stage ('Checkout'){
			steps {
				echo 'Cloning...'
				checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/krishs09/SpringJenkins_DeclarativePiplelineFile.git']])
			}
		}

		stage('Build') {
			    steps {
				echo 'Bulding App...'
				    
				  call mvn clean
				  call mvn install
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
