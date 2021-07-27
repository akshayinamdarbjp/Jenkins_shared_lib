def call(String BucketName, String region) {
	powershell(script: " aws s3api create-bucket --bucket params.BucketName --region params.region --create-bucket-configuration LocationConstraint=us-west-2")		
	}