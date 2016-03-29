package core.service;

import core.dao.DealDao;
import core.entity.Deal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
}
