package web.controller;

import core.entity.User;
import core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("")
    public String showSignInForm() {
        return "sign-in";
    }

    @RequestMapping(value = "process-form", method = RequestMethod.POST)
    public String processForm(HttpServletRequest request) {
        if (userService.authorize(request)) {
            return "redirect:/profile";
        } else {
            return "redirect:/authorization-error";
        }
    }

    @RequestMapping(value = "profile", method = RequestMethod.GET)
    public String showUserProfile(ModelMap model, HttpServletRequest request) {
        model.addAttribute(userService.getUser(request));
        return "/user-profile";
    }

    @RequestMapping(value = "authorization-error", method = RequestMethod.GET)
    public String showAuthorizationError(){
        return "/authorization-error";
    }
}
