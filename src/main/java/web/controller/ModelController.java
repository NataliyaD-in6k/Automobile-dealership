package web.controller;

import core.entity.Model;
import core.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/brands/{brandId}/models")
public class ModelController {
    @Autowired
    private ModelService modelService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Model> getAll(@PathVariable("brandId") Integer brandId) {
        return modelService.getModelsByBrandId(brandId);
    }
}

