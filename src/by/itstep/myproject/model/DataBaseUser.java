package by.itstep.myproject.model;

import java.util.ArrayList;
import java.util.List;

public class DataBaseUser {

	List<User> users = new ArrayList<>();

	public void addUser(User user) {
		users.add(user);
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<User> getUsers() {
		return users;
	}
	public boolean checkUser(String login, String password) {
		for (User user : users) {
			if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

	public User getUser(String login, String password) {
		for (User user : users) {
			if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
				return user;
			}
		}
		return null;
	}

}
