package core.service;

import core.dao.UserDao;
import core.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserDao userDao;

    public User getUserByEmail(String email) {
        return userDao.getUserByEmail(email);
    }

    public boolean authorize(HttpServletRequest request) {
        User user = getUserByEmail(request.getParameter("email"));
        request.getSession().setAttribute("user", user);
        return user != null;
    }

    public User getUser(HttpServletRequest request) {
        return (User) request.getSession().getAttribute("user");
    }

}
