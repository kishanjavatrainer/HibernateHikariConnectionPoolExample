package com.infotech.client;

import com.infotech.dao.UserDAO;
import com.infotech.entities.User;

public class PersistEntityClientTest {

	public static void main(String[] args) {
		
		UserDAO userDAO = new UserDAO();
		User user = getUser();
		userDAO.createUser(user);
	}

	private static User getUser() {
		User user = new User();
		user.setFirstName("Sean");
		user.setLastName("Murphy");
		return user;
	}
}