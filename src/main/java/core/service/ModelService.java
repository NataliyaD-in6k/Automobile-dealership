package core.service;

import core.dao.ModelDao;
import core.entity.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class ModelService {
    @Autowired
    private ModelDao modelDao;

    @Transactional
    public List<Model> getModelsByBrandId(Integer brandId) {
        List<Model> models = new ArrayList<Model>();

        for (Model model : modelDao.getAll()) {
            if (model.getBrand().getId().equals(brandId)) {
                models.add(model);
            }
        }
        return models;
    }
    @Transactional
    public Model getModelById(Integer modelId) {
        return modelDao.getById(modelId);
    }
}
