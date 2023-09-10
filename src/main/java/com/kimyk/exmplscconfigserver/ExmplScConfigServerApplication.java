package com.kimyk.exmplscconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ExmplScConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExmplScConfigServerApplication.class, args);
	}

}
