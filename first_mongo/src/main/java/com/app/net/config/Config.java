package com.app.net.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.MongoClient;

@Configuration
@EnableMongoRepositories(basePackages = "com.app.net.repositories")
@PropertySource(value = "classpath:application.properties")
public class Config extends AbstractMongoConfiguration{

	
	@Value("${mongo.db.host}")
	private String MONGO_DB_HOST;

	@Value("${mongo.db.port}")
	private int MONGO_DB_PORT;

	@Value("${mongo.db.name}")
	private String DB;
	@Override
	public MongoClient mongoClient() {
		// TODO Auto-generated method stub
		 return new MongoClient(MONGO_DB_HOST, MONGO_DB_PORT);
	}

	@Override
	protected String getDatabaseName() {
		// TODO Auto-generated method stub
		return DB;
	}

}
