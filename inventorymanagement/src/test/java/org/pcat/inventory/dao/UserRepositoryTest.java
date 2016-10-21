package org.pcat.inventory.dao;

<<<<<<< HEAD
import java.util.Random;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.pcat.inventory.model.Inventory;
=======
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
>>>>>>> master
import org.pcat.inventory.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
<<<<<<< HEAD
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = { "classpath:test-serviceContext.xml" })
@Transactional
public class UserRepositoryTest {
	public static final Logger logger = LoggerFactory.getLogger(UserRepositoryTest.class);
	@Autowired
	UserRepository usrRepo;
	@Autowired
	InventoryRepository invRepo;

	@Before
	public void setUp() throws Exception {
		// User(String firstname, String supervisor, String email, String role,
		// String lastname, String isactive) {
=======

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = { "classpath:serviceContext.xml" })
public class UserRepositoryTest {
	public static final Logger logger = LoggerFactory.getLogger(UserRepositoryTest.class);
	@Autowired
	UserRepository repo;
	@Before
	public void setUp() throws Exception {
//		User(String firstname, String supervisor, String email, String role, String lastname, String isactive) {
>>>>>>> master
	}

	@Test
	public void userAllSelectTest() {
<<<<<<< HEAD
		int usrNbr = new Random().nextInt();
		logger.debug(
				"-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-marker begine-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		User newUser = new User(String.format("usr{%d}", usrNbr), String.format("supr{%d}", usrNbr),
				String.format("usr{%d}.pcat@mailinator.com", usrNbr), "Home Visitor",
				String.format("usrLast{%d", usrNbr), "1");
		logger.debug(newUser.toString());
		usrRepo.save(newUser);
		logger.debug(
				"-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-marker end-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		usrRepo.findAll().forEach(user -> logger.info(user.toString()));
	}

	@Test
	public void inventoryTest() {
		// public Inventory(Integer id, String productName, String productDesc,
		// Integer totalInventory,
		// Integer reservedInventory, String location
		int invNbr = new Random().nextInt();
		logger.debug(
				"-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-marker begine-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		Inventory inv = new Inventory(String.format("product {%d}", invNbr),
				String.format("prod desc {%d}", invNbr), invNbr, 0, "Nashville");
		
		invRepo.save(inv);
		logger.debug(
				"-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-marker end-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		invRepo.findAll().forEach(inv_ -> logger.info(inv_.toString()));

	}
=======
		repo.save(new User("usr1", "supr1", "usr1.pcat@mailinator.com", "Home Visitor", "usrLast1", "1"));
		repo.findAll().forEach(user -> logger.info(user.toString()));
	}

>>>>>>> master
}
