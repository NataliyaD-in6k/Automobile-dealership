package web.controller;

import core.entity.User;
import core.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
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

    @RequestMapping("/login")
    public String showSignInForm(HttpServletRequest request) {
        return "sign-in";
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String showUserProfile(ModelMap model, HttpServletRequest request) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        String name = auth.getName();
        model.addAttribute("username", name);
        return "user-profile";
    }

    @RequestMapping(value = "authorization-error", method = RequestMethod.GET)
    public String showAuthorizationError() {
        return "authorization-error";
    }


}
