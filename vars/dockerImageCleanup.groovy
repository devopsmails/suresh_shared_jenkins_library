def call (String project, String ImageTag, String hubUse) {

    sh """
        docker rmi ${(hubUser)}/${(project)}:${ImageTag}
        docker rmi ${(hubUser)}/${(project)}:latest

    """
}
