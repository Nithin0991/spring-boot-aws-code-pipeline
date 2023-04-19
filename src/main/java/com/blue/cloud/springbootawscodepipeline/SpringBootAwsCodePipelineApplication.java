package com.blue.cloud.springbootawscodepipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application-${spring.profiles.active:dev}.properties")
public class SpringBootAwsCodePipelineApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAwsCodePipelineApplication.class, args);
	}

}
