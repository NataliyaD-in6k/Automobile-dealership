package core.service;

import core.dao.UserDao;
import core.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Transactional
    public User getUserByEmail(String email){
        return userDao.getUserByEmail(email);
    }

}
