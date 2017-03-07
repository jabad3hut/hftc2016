package org.pcat.inventory.test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EnvironmentVariableTests {
	private static final Logger logger = LoggerFactory.getLogger(EnvironmentVariableTests.class);

	@Test
	public void environmentTextDisplayTest() {
		final String pcatEnvironmentText = System.getenv("PCAT_ENVIRONTMENT_DISPLAY_TEXT");
		logger.info(String.format("%nThe value that will show up on the PCAT headers is %s", pcatEnvironmentText));
		assertThat(pcatEnvironmentText, equalTo("Local Test"));
	}

}
