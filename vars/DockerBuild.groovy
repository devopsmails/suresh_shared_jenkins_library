def call ( String ImageTag, String D_Hub_name, String ProjectName) {

    sh """
    echo ubuntu
    sudo -A docker image build -t ${(D_Hub_name)}/${(ProjectName)} .
    sudo -A docker image tag ${(D_Hub_name)}/${(ProjectName)}:${(ImageTag)}
    sudo -A docker image tag ${(D_Hub_name)}/${(ProjectName)}:latest
    """
}