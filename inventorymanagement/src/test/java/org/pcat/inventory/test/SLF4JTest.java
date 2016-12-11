package org.pcat.inventory.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import junit.framework.TestCase;

public class SLF4JTest extends TestCase {
	private static final Logger logger = LoggerFactory.getLogger(SLF4JTest.class);

	public void testLogging() {
		logger.trace("I am logging");
		String name = "Abhijit";
		logger.debug("Hi, {}", name);
		logger.info("Welcome to the example of Logback");
		logger.warn("warning message");
		logger.error("error message");

	}
}
