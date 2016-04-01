package core.dao;

import core.entity.Deal;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DealDao {
    @Autowired
    private SessionFactory sessionFactory;

    private Deal deal;

    public DealDao() {
    }

    public List<Deal> getAll(){
        List<Deal> deals = new ArrayList<Deal>();
        return deals = sessionFactory.getCurrentSession().createCriteria(Deal.class).list();
    }

    public void create(Deal deal) {
        if (deal.getId()==null){
            sessionFactory.getCurrentSession().persist(deal);
        }
    }


    public List<Deal> getAllByUserId(Integer userId) {
        return (List<Deal>) sessionFactory.getCurrentSession().createCriteria(Deal.class, "deal")
                .add(Restrictions.eq("user.id", userId)).list();

    }
}
