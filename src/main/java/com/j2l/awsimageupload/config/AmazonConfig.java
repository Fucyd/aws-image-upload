package com.j2l.awsimageupload.config;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Builder;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AmazonConfig {

    @Bean
    public AmazonS3 s3(){
        AWSCredentials awsCredentials = new BasicAWSCredentials(
                "AKIAIFNMT7LWCUKHRVKA",
                "PCEvK+E5Nprqq09FdBUHJ7r+T+B9v6+oNzQBaOFE");


        return AmazonS3ClientBuilder
                .standard()
                .withCredentials((new AWSStaticCredentialsProvider(awsCredentials)))
                .withRegion("eu-west-1")
                .build();
    }
}