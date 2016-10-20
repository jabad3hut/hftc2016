package org.pcat.inventory.dao;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.pcat.inventory.model.User;
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
	UserRepository repo;
	@Before
	public void setUp() throws Exception {
//		User(String firstname, String supervisor, String email, String role, String lastname, String isactive) {
	}

	@Test
	public void userAllSelectTest() {
		repo.save(new User("usr1", "supr1", "usr1.pcat@mailinator.com", "Home Visitor", "usrLast1", "1"));
		repo.findAll().forEach(user -> logger.info(user.toString()));
	}

}
