package org.pcat.inventory.controller;

import javax.servlet.http.HttpServletRequest;

import org.pcat.inventory.model.User;
import org.pcat.inventory.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LoginController {

	@Autowired
	private LoginService loginService;
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	/**
	 * @return the LoginService
	 */
	public LoginService getUserLoginManagementService() {
		return loginService;
	}

	/**
	 * @param loginService
	 *            the LoginService to set
	 */
	public void setUserLoginManagementService(LoginService loginService) {
		this.loginService = loginService;
	}

	/**
	 * Method to validate user from the Database.
	 * 
	 * @param request
	 * @param model
	 * @return String value using which front end can decide on hiding the
	 *         navigation.
	 */
	@RequestMapping(value = "/loginPage")
	public ModelAndView isUserLoggedIn(HttpServletRequest request, Model model) {
		logger.info("@RequestMapping(value = /loginPage)	"
				+ "public ModelAndView isUserLoggedIn(HttpServletRequest request, Model model)");
		String email = request.getParameter("email");
		logger.info("I am in login controller... {}", email);
		User user = loginService.validateUserLogin(email);
		logger.debug("User is... {}", user);
		String forward = "index.jsp";
		if (user != null) {
			if (user.getRole().toLowerCase().contains("admin")) {
				forward = "listAllUsers.jsp";
			} else if (user.getRole().toLowerCase().contains("supervisor")) {
				forward = "review-approvals.jsp";
			} else {
				forward = "request.jsp";
			}
		}
		return new ModelAndView(forward, "user", user);
	}

	/**
	 * Method to Logout user.
	 * 
	 * @param request
	 * @param model
	 * @return String value using which front end can decide on hiding the
	 *         navigation.
	 */
	@RequestMapping(value = "/logout")
	public ModelAndView logOut(HttpServletRequest request, Model model) {
		logger.info("@RequestMapping(value = /logout)"
				+ "	public ModelAndView logOut(HttpServletRequest request, Model model)");
		return new ModelAndView("index.jsp");
	}

}
