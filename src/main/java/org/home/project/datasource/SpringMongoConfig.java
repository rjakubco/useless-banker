package org.home.project.datasource;

import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoDatabase;

import eu.dozd.mongo.MongoMapper;

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
	private String DB = "test";

	@Override
	protected String getDatabaseName() {
		return DB;
	}

	@Override
	public MongoClient mongo() throws Exception {
		CodecRegistry codecRegistry = CodecRegistries.fromProviders(MongoMapper.getProviders());

		MongoClientOptions settings = MongoClientOptions.builder().codecRegistry(codecRegistry).build();
		return new MongoClient(new ServerAddress(MONGO_DB_HOST, MONGO_DB_PORT), settings);
	}

	@Bean(name = "mongoDatabase")
	public MongoDatabase getDatabase() throws Exception {
		return mongo().getDatabase(getDatabaseName());
	}
}
