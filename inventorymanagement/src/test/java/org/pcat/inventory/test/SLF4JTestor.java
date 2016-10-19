package org.pcat.inventory.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLF4JTestor {
	private static final Logger logger = LoggerFactory.getLogger(SLF4JTestor.class);
	public static void main(String[] args) {
		logger.trace("I am logging");
		String name = "Abhijit";
		logger.debug("Hi, {}", name);
		logger.info("Welcome to the example of Logback");
		logger.warn("warning message");
		logger.error("error message");
	}

}
