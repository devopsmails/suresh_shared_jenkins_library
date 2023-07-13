def call( String aws_account_id, String region, String ecr_repo_name) {

    sh """
     docker rmi ${ecr_repo_name}:latest ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ecr_repo_name}:latest
    """
} 