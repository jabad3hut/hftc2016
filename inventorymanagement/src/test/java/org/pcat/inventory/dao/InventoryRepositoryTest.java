package org.pcat.inventory.dao;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Random;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.pcat.inventory.model.Inventory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.jdbc.JdbcTestUtils;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = { "classpath:test-serviceContext.xml" })
@Transactional
public class InventoryRepositoryTest {
	public static final Logger logger = LoggerFactory.getLogger(InventoryRepositoryTest.class);
	@Autowired
	InventoryRepository invRepo;
	
	JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	@Test
	@Transactional
	public void createInventory() {
		final int count = countRowsInTable("inventory");

		int invNbr = new Random().nextInt();
		logger.debug(
				"-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-marker begine-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		Inventory inv = new Inventory(String.format("product {%d}", invNbr), String.format("prod desc {%d}", invNbr),
				invNbr, 0, "Nashville");

		invRepo.save(inv);
		logger.info("save & flush");
		assertNumInventory(count + 1);
		logger.debug(
				"-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-marker end-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		// invRepo.findAll().forEach(inv_ -> logger.info(inv_.toString()));

	}

	private void assertNumInventory(int i) {
//		assertThat(i, equalTo(countRowsInTable("inventory")));

	}

	private int countRowsInTable(String tableName) {
		return JdbcTestUtils.countRowsInTable(this.jdbcTemplate, tableName);
	}
}
