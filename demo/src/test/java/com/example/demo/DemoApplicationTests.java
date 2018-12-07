package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles(profiles = "test")
public class DemoApplicationTests {

	@Autowired
	DemoApplication app;

	@Test
	public void contextLoads() {
		String actual = app.getValueProp();
		Assert.assertEquals("localhost2", actual);
	}

}
