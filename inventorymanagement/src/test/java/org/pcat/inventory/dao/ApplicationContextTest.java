package org.pcat.inventory.dao;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = { "classpath:serviceContext.xml" })
public class ApplicationContextTest {
	public static final Logger logger = LoggerFactory.getLogger(ApplicationContext.class);
	@Autowired
	ApplicationContext ctx;

	@Test
	public void ctxTest() {
		logger.info("The application context loaded is:  {%s}", ctx.getApplicationName());
		assertThat(ctx, notNullValue());
	}
}
