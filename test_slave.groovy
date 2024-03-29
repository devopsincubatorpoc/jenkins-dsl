pipelineJob("test-master") {
	description()
	keepDependencies(false)
	definition {
		cpsScm {
			scm {
        git {
          remote {
            url('https://github.com/devopsincubatorpoc/pipelinespoc.git')
          }
          branch('*/main')
        }
      }
   }
}
}

pipelineJob("test-slave1") {
	description()
	keepDependencies(false)
	definition {
		cpsScm {
			scm {
        git {
          remote {
            url('https://github.com/devopsincubatorpoc/pipelinespoc.git')
          }
          branch('*/develop')
        }
      }
    }
  }
}

pipelineJob("test-slave2") {
	description()
	keepDependencies(false)
	definition {
		cpsScm {
			scm {
        git {
          remote {
            url('https://github.com/devopsincubatorpoc/pipelinespoc.git')
          }
          branch('*/release')
        }
      }
    }
  }
}
