package core.dao;

import core.entity.Model;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ModelDao{

    @Autowired
    private SessionFactory sessionFactory;

    private Model model;

    public ModelDao() {
    }

    public List<Model> getAll() {
        List<Model> models = new ArrayList<Model>();
        models = sessionFactory.getCurrentSession().createCriteria(Model.class).list();
        return models;
    }

    public Model getById(Integer modelId) {
       return (Model) sessionFactory.getCurrentSession().createCriteria(Model.class, "model")
                .add(Restrictions.eq("model.id", modelId)).uniqueResult();
    }
}
