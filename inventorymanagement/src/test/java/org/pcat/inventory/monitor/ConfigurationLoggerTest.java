package org.pcat.inventory.monitor;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = { "classpath:test-serviceContext.xml" })
public class ConfigurationLoggerTest {
	private static final Logger logger = LoggerFactory.getLogger(ConfigurationLoggerTest.class);

	@BeforeClass
	public static void setup() {

	}

	@Test
	public void logConfigurationTest() {
	}
}
