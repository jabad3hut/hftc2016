package org.pcat.inventory.service;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.pcat.inventory.model.HomeVisitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomeVisitorEmailRequestBOTest {
	private static final Logger logger = LoggerFactory.getLogger(HomeVisitorEmailRequestBOTest.class);
	HomeVisitorEmailRequestBO emailUtility = new HomeVisitorEmailRequestBO();

	@Test
	public void messageBodyBuilderTest() {
		HomeVisitor homeVisitor = new HomeVisitor(null, "testFirst", "testLast", "testEmail@mailinator.com",
				"testSupervisor", "testSupervisorEmail@mailinator.com");
		String testBody = String.format("Requestor:  testFirst testLast%nApprover:  testSupervisor%n"
				+ "These items have been requested:%nQty: 1 of Item 1 from Chattanooga%n"
				+ "Qty: 1 of Item 2 from Chattanooga%nQty: 1 of Item 3 from Chattanooga%n"
				+ "Qty: 1 of Item 4 from Chattanooga%nQty: 1 of Item 5 from Chattanooga%n"
				+ "Qty: 1 of Item 6 from Chattanooga");
		List<String> items = new ArrayList<String>();
		items.add("Qty: 1 of Item 1 from Chattanooga");
		items.add("Qty: 1 of Item 2 from Chattanooga");
		items.add("Qty: 1 of Item 3 from Chattanooga");
		items.add("Qty: 1 of Item 4 from Chattanooga");
		items.add("Qty: 1 of Item 5 from Chattanooga");
		items.add("Qty: 1 of Item 6 from Chattanooga");
		String renderedString = emailUtility.getMessageBody(homeVisitor.getFirstName(), homeVisitor.getLastName(),
				homeVisitor.getSupervisor(), items);
		logger.info(String.format("%ntestBody%n%s", testBody));
		logger.info(String.format("%nrenderedString%n%s", renderedString));
		assertThat(renderedString, equalTo(testBody));
	}
}
