package core.service;

import core.dao.DealDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DealService {

    @Autowired
    private DealDao dealDao;


}
