package com.bund.north.bund.config;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Hugo
 */
@SpringBootApplication
@EnableConfigServer
@EnableEncryptableProperties
//@EnableEurekaClient
@EnableDiscoveryClient
public class BundConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(BundConfigApplication.class, args);
	}

}
