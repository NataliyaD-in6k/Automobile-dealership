package core.dao;

import core.entity.User;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    private User user;

    public UserDao() {
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getByEmail(String email) {
        return (User) sessionFactory.getCurrentSession().createCriteria(User.class, "user")
                .add(Restrictions.eq("user.email", email)).uniqueResult();
    }

    public User getById(Integer id){
        return (User) sessionFactory.getCurrentSession().createCriteria(User.class, "user")
                .add(Restrictions.eq("user.id", id)).uniqueResult();
    }

}
