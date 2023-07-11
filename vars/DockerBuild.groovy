def call ( String ImageTag, String D_Hub_name, String ProjectName) {

    sh """
    sudo docker image build -t ${(D_Hub_name)}/${(ProjectName)} .
    sudo docker image tag ${(D_Hub_name)}/${(ProjectName)}:${(ImageTag)}
    sudo docker image tag ${(D_Hub_name)}/${(ProjectName)}:latest
    """
}