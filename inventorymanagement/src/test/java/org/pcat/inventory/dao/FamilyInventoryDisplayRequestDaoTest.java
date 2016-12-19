package org.pcat.inventory.dao;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.pcat.inventory.TestHelper;
import org.pcat.inventory.model.FamilyInventory;
import org.pcat.inventory.model.FamilyInventoryDisplayRequest;
import org.pcat.inventory.model.FamilyInventoryImpl;
import org.pcat.inventory.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import ch.qos.logback.classic.Level;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = { "classpath:serviceContext.xml" })
@Transactional
public class FamilyInventoryDisplayRequestDaoTest extends AbstractTransactionalJUnit4SpringContextTests {
	private static final Logger logger = LoggerFactory.getLogger(UserDaoTest.class);
	private static TestHelper testHelper = new TestHelper();
	@Autowired
	private FamilyInventoryDisplayRequestDao familyInventoryDisplayRequestDao;
	@Autowired
	private FamilyInventoryDao familyInventoryDao;
	@Autowired
	private UserDao userDao;

	@BeforeClass
	public static void setup() {
		testHelper.saveCurrentRootLogging();
		testHelper.setRootTestLoggerLevel(Level.DEBUG);
	}

	@AfterClass
	public static void tearDown() {
		testHelper.resetSaveRootLoggerLevel();
	}

	@Test
	public void readTest() {
		/*
		 * List<User> homeVisitors = new ArrayList<>(); for (int x = 0; x < 3;
		 * x++) { User homeVisitor = new User(null, "homeVisitor" + x +
		 * "FirstName", "homeVisitor" + x + "LastName", "homeVisitor" + x +
		 * ".pcat@mailinator.com", "Home Visitor",
		 * "testFirstNameSupervisor testLastNameSupervisor",
		 * "testSupervisor.pcat@mailinator.com", true);
		 * homeVisitors.add(homeVisitor); userDao.saveOrUpdate(homeVisitor); for
		 * (int i = 0; i < 4; i++) { FamilyInventory inv = new
		 * FamilyInventoryImpl(null, "" + x + " homeV-000" + 1,
		 * homeVisitor.getId(), "Pending", 1, null, 63);
		 * familyInventoryDao.saveOrUpdate(inv); } }
		 */
		List<FamilyInventoryDisplayRequest> requests = familyInventoryDisplayRequestDao.findAll();
		assertThat(requests.size(), greaterThanOrEqualTo(5));
		List<Integer> ids = new ArrayList<Integer>();
		ids.add(new Integer(42));
		requests = familyInventoryDisplayRequestDao.findAllForIds(ids);
		assertThat(requests.size(), greaterThanOrEqualTo(3));

	}

}
