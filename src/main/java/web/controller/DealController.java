package web.controller;

import core.entity.Deal;
import core.entity.Model;
import core.entity.User;
import core.service.BrandService;
import core.service.DealService;
import core.service.ModelService;
import core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class DealController {

    @Autowired
    private BrandService brandService;
    @Autowired
    private ModelService modelService;
    @Autowired
    private DealService dealService;
    @Autowired
    private UserService userService;

    @RequestMapping(value = "choose-brand", method = RequestMethod.POST)
    public String getAllBrands(ModelMap model) {
        model.addAttribute("brands", brandService.getAllBrands());
        return "choose-brand";
    }


    @RequestMapping(value = "price", method = RequestMethod.POST)
    public String getPrice(HttpServletRequest request, @RequestParam("model_id") Integer modelId, ModelMap model) {
        model.addAttribute("model", modelService.getById(modelId));
        model.addAttribute("user", request.getSession().getAttribute("user"));
        return "deal-registration";
    }

//    @RequestMapping(value = "register-deal", method = RequestMethod.POST)
//    public String registerDeal(@RequestParam("user_id") Integer userId, @RequestParam("model_id") Integer modelId, ModelMap model) {
//        dealService.create(new Deal(userService.getById(userId), modelService.getById(modelId)));
//        model.addAttribute("deals", dealService.getAll());
//        return "deals";
//    }

    @RequestMapping(value = "all-deals")
    public String showAllDeals(ModelMap model){
        model.addAttribute("deals", dealService.getAll());
        return "all-deals";
    }

    @RequestMapping(value = "/user-deals", method = RequestMethod.POST)
    public String showUserDeals(ModelMap model, HttpServletRequest request,
                                @RequestParam("user_id") Integer userId,
                                @RequestParam("model_id") Integer modelId) {
        dealService.create(new Deal(userService.getById(userId), modelService.getById(modelId)));
//        User user = (User)(model.get(request.getSession().getAttribute("user")));
        model.addAttribute("deals", dealService.getAllByUserId(userId));
        request.getSession().setAttribute("user-id", userId);
        return "redirect:/deals";
    }

    @RequestMapping(value = "deals", method = RequestMethod.POST)
    public void showDeals(HttpServletRequest request, @RequestBody Deal deal){
        User user = (User)request.getSession().getAttribute("user");
        deal.setUser(user);
        dealService.create(deal);
    }

    @RequestMapping(value = "deals", method = RequestMethod.GET)
    public List<Deal> showDeals(HttpServletRequest request){
        return dealService.getAllByUserId(((User)request.getSession().getAttribute("user")).getId());
    }
}
