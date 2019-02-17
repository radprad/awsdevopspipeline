package com.vinsys.devops;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.AutoConfigureMockRestServiceServer;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.reactive.function.BodyInserter;
import org.springframework.web.reactive.function.BodyInserters;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureWebTestClient
public class DevopsApplicationTests {

	@Autowired
	private WebTestClient webClient;

	@Test
	public void contextLoads() {
	}

	@Test
	public void  login(){
		LoginRequest request = new LoginRequest();
		request.setUsername("nilesh");
		request.setPassword("password");
		webClient.post().uri("/login").body(BodyInserters.fromObject(request)).exchange().expectStatus().isOk();
	}

	@Test
	public void  logout(){
	}



}

