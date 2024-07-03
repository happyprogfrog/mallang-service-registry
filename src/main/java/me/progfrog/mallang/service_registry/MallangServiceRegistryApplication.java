package me.progfrog.mallang.service_registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MallangServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MallangServiceRegistryApplication.class, args);
	}

}
