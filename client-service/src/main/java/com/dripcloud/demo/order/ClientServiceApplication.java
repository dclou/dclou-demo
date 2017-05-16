package com.dripcloud.demo.order;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;

@SpringCloudApplication
public class ClientServiceApplication {

	// https://piotrminkowski.wordpress.com/2017/04/05/part-2-creating-microservices-monitoring-with-spring-cloud-sleuth-elk-and-zipkin/
	@Bean
	public AlwaysSampler defaultSampler() {
		return new AlwaysSampler();
	}

	public static void main(String[] args) {
		SpringApplication.run(ClientServiceApplication.class, args);
	}
}
