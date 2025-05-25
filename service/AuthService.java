package service;

import dao.UserDAO;
import model.User;
//These files created by me are for user registration and login and to check the availibility of an existing username as well
public class AuthService {
    private UserDAO userDAO = new UserDAO();

    public boolean register(String username, String password) {
        if (userDAO.getUser(username) != null) return false;
        userDAO.saveUser(new User(username, password));
        return true;
    }

    public boolean login(String username, String password) {
        User user = userDAO.getUser(username);
        return user != null && user.getPassword().equals(password);
    }
}
