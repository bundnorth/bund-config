package com.bund.north.bund.config.encode;


import org.jasypt.encryption.StringEncryptor;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
//@TestPropertySource("classpath:application-dev.properties")
public class PropertiesEncryptTest {

	@Autowired
	private StringEncryptor encryptor;

	@Test
	public void encodeSpecial() {
		String uri = encryptor.encrypt("https://github.com/hugo0129/bund-config-support.git");
		String username = encryptor.encrypt("hugolovefreedom@gmail.com");
		String password = encryptor.encrypt("young@hugo2018");
		System.out.println("database url: " + uri);
		System.out.println("database name: " + username);
		System.out.println("database password: " + password);
		Assert.assertTrue(uri.length() > 0);
		Assert.assertTrue(username.length() > 0);
		Assert.assertTrue(password.length() > 0);
	}

}
