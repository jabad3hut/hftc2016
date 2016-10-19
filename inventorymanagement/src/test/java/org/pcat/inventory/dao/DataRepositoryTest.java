package org.pcat.inventory.dao;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations={"classpath:service-config.xml"})
public class DataRepositoryTest  {
	@Autowired
//	private ApplicationContext ctx = new FileSystemXmlApplicationContext("file:~/scratch/dispatcher-servlet.xml");

	@Test
	public void ctxTest(){
		assertTrue(true);
	}
	@Test
	public void testCtx() {
		assertTrue(true);
	}
}
