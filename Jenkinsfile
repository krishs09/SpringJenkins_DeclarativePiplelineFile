pipeline {

    agent any
	 
	tools { 
        maven 'Maven' 
    }
	
	parameters {
    string(name: 'server', defaultValue: "C:\\Users\\admin\\Downloads\\apache-tomcat-9.0.73")
 //  string(name: 'emailTo', defaultValue: "timothyjames.short@gmail.com")
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
                echo 'Bulding App..'
				
				bat """
					cd freddie-app
					mvn clean package
				  """
		    
		    echo "${env.WORKSPACE}"
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
