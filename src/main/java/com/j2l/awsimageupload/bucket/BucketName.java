package com.j2l.awsimageupload.bucket;

public enum BucketName {

    PROFILE_IMAGE("spring-boot-react");
    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
