pipeline {

    agent any
	
	tools { 
        maven 'MAVEN_HOME' 
    }

    stages {
	
		stage ('Initialize') {
            steps {
                
                    echo 'PATH = %PATH%'
                    echo 'M2_HOME = %M2_HOME%'
              
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
