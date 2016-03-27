package core.service;

import core.dao.BaseDao;
import core.dao.BrandDao;
import core.entity.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class BrandService {

    @Autowired
    private BrandDao brandDao;

    @Transactional
    public List<Brand> getAllbrands() {
        return brandDao.getAll();
    }
}
