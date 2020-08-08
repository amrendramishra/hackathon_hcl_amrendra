package com.hackathon;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import com.hackathon.model.Book;

import junit.framework.Assert;

@SpringBootTest
class Hackathon08AugSaturdayApplicationTests {
	 
	
	RestTemplate rest;

	@Test
	void contextLoads() {
	}
	
	
	@Test
	public void testGetUserById() {
	Book book = rest.getForObject("http://127.0.0.1:8080/getBooks/c", Book.class);
	Assert.assertNotNull(book);
	}
	
}
