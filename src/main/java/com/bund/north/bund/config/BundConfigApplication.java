package com.bund.north.bund.config;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author Hugo
 */
@SpringBootApplication
@EnableConfigServer
@EnableEncryptableProperties
public class BundConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(BundConfigApplication.class, args);
	}

}
