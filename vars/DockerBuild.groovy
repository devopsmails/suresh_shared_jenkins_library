def call ( String ImageTag, String D_Hub_name, String ProjectName) {
    
    sh """
    docker image build -t ${(D_Hub_name)}/${(ProjectName)} ./Dockerfile_suresh
    docker image tag ${(D_Hub_name)}/${(ProjectName)}:${(ImageTag)}
    docker image tag ${(D_Hub_name)}/${(ProjectName)}:latest
    """
}