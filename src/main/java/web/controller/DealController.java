package web.controller;

import core.entity.Deal;
import core.entity.Model;
import core.entity.User;
import core.service.BrandService;
import core.service.DealService;
import core.service.ModelService;
import core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class DealController {


    @Autowired
    private BrandService brandService;
    @Autowired
    private ModelService modelService;
    @Autowired
    private DealService dealService;
    @Autowired
    private UserService userService;

    @RequestMapping(value = "create-deal", method = RequestMethod.POST)
    public String getAllBrands(ModelMap model) {
        model.addAttribute("brands", brandService.getAllbrands());
        return "create-deal";
    }

    @RequestMapping(value = "create-deal", method = RequestMethod.GET)
    public String setBrand(HttpServletRequest request, ModelMap model) {
        List<Model> models = (List<Model>) request.getSession().getAttribute("models");
        model.addAttribute(models);
        return "create-deal";
    }

    @RequestMapping(value = "models", method = RequestMethod.POST)
    public String getModels(@RequestParam("brand_id") Integer brandId, ModelMap model) {
        model.addAttribute("models", modelService.getModelsByBrandId(brandId));
        return "create-deal";
    }

    @RequestMapping(value = "price", method = RequestMethod.POST)
    public String getPrice(HttpServletRequest request, @RequestParam("model_id") Integer modelId, ModelMap model) {
        model.addAttribute("model", modelService.getById(modelId));
        model.addAttribute("user", request.getSession().getAttribute("user"));
        return "create-deal";
    }

    @RequestMapping(value = "register-deal", method = RequestMethod.POST)
    public String registerDeal(@RequestParam("user_id") Integer userId, @RequestParam("model_id") Integer modelId, ModelMap model) {
        dealService.create(new Deal(userService.getById(userId), modelService.getById(modelId)));
        model.addAttribute("deals", dealService.getAll());
        return "deals";
    }

    @RequestMapping(value = "register-deal", method = RequestMethod.GET)
    public String showUserDeals(ModelMap model, HttpServletRequest request) {
        User user = (User)(model.get(request.getSession().getAttribute("user")));
        dealService.getAllByUserId(user.getId());

        return "deals";
    }
}
