def call(Map params)
	powershell(script: " aws s3api create-bucket --bucket params.BucketName --region params.region --create-bucket-configuration LocationConstraint=us-west-2")