package org.pcat.inventory.service;

import org.pcat.inventory.dao.UserDao;
import org.pcat.inventory.model.HomeVisitor;
import org.pcat.inventory.model.PcatPerson;
import org.pcat.inventory.model.Supervisor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;

	private HomeVisitor buildHomeVisitor(PcatPerson user) {
		return new HomeVisitor(user.getFirstName(), user.getLastName(), user.getEmail(), null, user.getSupervisorEmail());
	}

	public HomeVisitor getHomeVisitor(int userId) {
		PcatPerson user = userDao.getById(userId);
		return buildHomeVisitor(user);
	}

	public HomeVisitor getHomeVisitorByEmailAddress(String emailAddress) {
		PcatPerson user = userDao.getByEmailId(emailAddress);
		return buildHomeVisitor(user);
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
}
