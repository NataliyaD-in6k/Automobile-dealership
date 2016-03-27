package web.controller;

import core.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DealController {

    @Autowired
    private BrandService brandService;

    @RequestMapping(value = "create-deal", method = RequestMethod.POST)
    public String getAllBrands(ModelMap model){
        model.addAttribute("brands", brandService.getAllbrands());
        return "create-deal";
    }
}
