package org.pcat.inventory.dao;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = { "classpath:serviceContext.xml" })
public class UserRepositoryTest {
	public static final Logger logger = LoggerFactory.getLogger(UserRepositoryTest.class);
	@Autowired
	UserRepository userRepository;
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void userAllSelectTest() {
		userRepository.findAll().forEach(user -> logger.info(user.toString()));
	}

}
