pipelineJob("test-slave1") {
	description()
	keepDependencies(false)
	definition {
		cpsScm {
			scm {
        git {
          remote {
            url('git@github.com:devopsincubatorpoc/pipelinespoc.git')
          }
          branch('*/main')
        }
      }
}			
"""pipeline {
    agent {
        node ('slave1')
    }
    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        stage('Google') {
            steps {
                echo 'Building Hello World'
                sh 'curl google.com'
            }
        }
        stage('Facebook') {
            steps {
                echo 'Releasing Hello World'
                sh 'curl facebook.com'
            }
        }
        stage('Yahoo') {
            steps {
                echo 'Deploying Hello World'
                sh 'curl yahoo.com'
            }
        }
        stage('Apple') {
            steps {
                echo 'Testing Hello World'
                sh 'curl apple.com'
            }
        }  
        stage('Monitor') {
            steps {
                echo 'Monitoring Hello World'
                sh 'curl valtech.com'
            }
        }       
              
    }
}"""		}
	}
