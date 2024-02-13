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
