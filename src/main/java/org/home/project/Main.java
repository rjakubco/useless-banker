package org.home.project;

import org.home.project.dao.UserDao;
import org.home.project.entities.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.io.IOException;

/**
 * @author : Roman Jakubco (rjakubco@redhat.com)
 */

public class Main {
	public static void main(String[] args) throws IOException {
//		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringMongoConfig.class);
		ApplicationContext ctx = new FileSystemXmlApplicationContext(new String[]{"src/main/resources/OSGI-INF/spring/applicationContext.xml"});
		UserDao userDao = (UserDao)ctx.getBean(UserDao.class);
//		MongoOperations mongoOperation = (MongoOperations)ctx.getBean("mongoClient");

//		CodecRegistry codecRegistry = CodecRegistries.fromProviders(MongoMapper.getProviders());
//
//		MongoClientOptions settings = MongoClientOptions.builder().codecRegistry(codecRegistry).build();
//
//		MongoClient client = new MongoClient(new ServerAddress("localhost", 27017), settings);
//
//		MongoCollection<User> collection = client.getDatabase("test").getCollection("users", User.class);
//
//		User person = new User();
//		person.setUsername("Foo Bar");
//		person.setPassword("HUUUUu");
//
//		// Store person normally.
//		collection.insertOne(person);
//
//		// Access data.
//		User person2 = collection.find().first();
//
//		System.out.println(person2);


//		Converter converter = new Converter();
//
//		converter.convertStringToHistory(FileUtils.readFileToString(new File("/home/rjakubco/Downloads/HIST_273200630_201611161419.txt")));


		User user = userDao.findUser(null);
		System.out.println(user);
	}
}
