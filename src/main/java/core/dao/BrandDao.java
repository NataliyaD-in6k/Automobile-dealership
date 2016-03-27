package core.dao;

import core.entity.Brand;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BrandDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Brand brand;

    public BrandDao() {
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Brand> getAll() {
        List<Brand> brands = new ArrayList<Brand>();
        return brands = sessionFactory.getCurrentSession().createCriteria(Brand.class).list();
    }
}
