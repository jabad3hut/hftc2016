package org.pcat.inventory.monitor;

import javax.annotation.PostConstruct;

import org.pcat.inventory.dao.BaseDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class LogConfiguration {
	private static final Logger logger = LoggerFactory.getLogger(BaseDao.class);

	@PostConstruct
	public void initClass() {
		logger.info("initializing the class");
		logger.info(String.format("PCAT_DB_URL=",System.getenv().get("PCAT_DB_URL")));
	}
}
