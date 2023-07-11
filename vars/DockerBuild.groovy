def call ( String ImageTag, String D_Hub_name, String ProjectName) {

    sh """
    echo Devops@@1 | sudo -S docker image build -t ${(D_Hub_name)}/${(ProjectName)} .
    sudo -S docker image tag ${(D_Hub_name)}/${(ProjectName)}:${(ImageTag)}
    sudo -S docker image tag ${(D_Hub_name)}/${(ProjectName)}:latest
    """
}