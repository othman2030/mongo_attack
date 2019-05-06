package com.app.net.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.app.net.config.Config;
import com.app.net.model.Todo;
import com.app.net.repositories.TodoRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes={Config.class})
@EnableMongoRepositories(
		  basePackages = { "com.app.net.repositories" })
public class TodoappApplicationTests {

	
	@Autowired
	 TodoRepository todoRepository ;
	
	@Test
	 public void test()
	 {
		todoRepository.save(new Todo("Helloo World", Boolean.TRUE, new Date())) ;
	 }
}
