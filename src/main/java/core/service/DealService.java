package core.service;

import core.dao.DealDao;
import core.entity.Deal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class DealService {

    @Autowired
    private DealDao dealDao;

    @Transactional
    public void create(Deal deal){
        dealDao.create(deal);
    }

    @Transactional
    public List<Deal> getAll() {
         return dealDao.getAll();
    }

    @Transactional
    public List<Deal> getAllByUserId(Integer userId) {
        List<Deal> deals = new ArrayList<Deal>();
        for (Deal deal : dealDao.getAll()) {
            if (deal.getUser().getId().equals(userId)) {
                deals.add(deal);
            }
        }
        return deals;
//        return dealDao.getAllByUserId(userId);
    }
}
