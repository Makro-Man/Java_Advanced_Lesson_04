package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.List;

public class UserService {

	private List<User> listofUsers = new ArrayList<>();
	private static UserService userService;

	private UserService() {
	}

	public static UserService getUserService() {
		if (userService == null) {
			userService = new UserService();
		}
		return userService;
	}

	public List<User> getListOfUsers() {
		return listofUsers;
	}

	public void saveUser(User user) {
		listofUsers.add(user);
	}

	public User getUser(String email) {
		return listofUsers.stream().filter(user -> user.getEmail().equals(email)).findAny().orElse(null);
	}

}
