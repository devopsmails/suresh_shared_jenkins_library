def call( String project, String ImageTag, String hubUser) {

    sh """
     docker image build -t ${(hubUser)}/${(project)} https://github.com/devopsmails/mrdevops_java_app.git/Dockerfile_suresh
     docker image tag ${(hubUser)}/${(project)} ${(hubUser)}/${(project)}:${ImageTag}
     docker image tag ${(hubUser)}/${(project)} ${(hubUser)}/${(project)}:latest
    """
} 