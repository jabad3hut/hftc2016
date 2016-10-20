package org.pcat.inventory.dao;

import java.util.Properties;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = { "classpath:serviceContext.xml" })
public class UserRepositoryTest {
	public static final Logger logger = LoggerFactory.getLogger(UserRepositoryTest.class);
//	@Autowired
	UserRepository userRepository;
	@Autowired
	ApplicationContext ctx;
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void userAllSelectTest() {
//		
//		userRepo.findAll().forEach(user -> logger.info(user.toString()));
//		userRepo.findAll().forEach(user -> logger.info(user.toString()));
//		userRepository.findAll().forEach(user -> logger.info(user.toString()));
	}

}
