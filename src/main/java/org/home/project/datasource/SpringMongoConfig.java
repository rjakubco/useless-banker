package org.home.project.datasource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.ServerAddress;

/**
 * @author : Roman Jakubco (rjakubco@redhat.com)
 */
@Configuration
public class SpringMongoConfig extends AbstractMongoConfiguration {

	//	@Value("${MONGO_DB_HOST}")
	private String MONGO_DB_HOST = "localhost";

	//	@Value("${MONGO_DB_PORT}")
	private int MONGO_DB_PORT = 27017;

	//	@Value("${DB}")
	private String database = "test";

	@Override
	protected String getDatabaseName() {
		return database;
	}

	@Override
	public MongoClient mongo() throws Exception {
		return new MongoClient(new ServerAddress(MONGO_DB_HOST, MONGO_DB_PORT));
	}

	@Bean(name = "mongoDatabase")
	public DB getDatabase() throws Exception {
		return mongo().getDB(getDatabaseName());
	}
}
