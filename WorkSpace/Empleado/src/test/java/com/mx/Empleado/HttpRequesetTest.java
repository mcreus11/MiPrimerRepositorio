package com.mx.Empleado;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class HttpRequesetTest {
	
	private int port;
	@Autowired
	TestRestTemplate restTemplate;
	
	@Test
	void greetingShouldReturnDefaultMesage()throws Exception{
		assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/",
				String.class)).contains("hola, mundo");
	}

}
