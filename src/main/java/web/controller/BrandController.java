package web.controller;

import core.entity.Brand;
import core.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/brands")
public class BrandController {
    @Autowired
    private BrandService brandService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Brand> getAll() {
        return brandService.getAllBrands();
    }
}

