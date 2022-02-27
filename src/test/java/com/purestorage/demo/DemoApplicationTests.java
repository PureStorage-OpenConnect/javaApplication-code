package com.purestorage.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private GreetingController controller;

	@Test
	public void testGreeting() throws Exception {
		assertThat(controller.greeting()).isEqualTo("Hello, World");
	}

}
