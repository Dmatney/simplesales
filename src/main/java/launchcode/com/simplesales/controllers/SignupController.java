package launchcode.com.simplesales.controllers;

import launchcode.com.simplesales.models.data.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("signup")

public class SignupController {
    //@Autowired
    //private UserDao userDao;

    @RequestMapping("")
    public String index(Model model) {
        model.addAttribute("title", "Signup");
        return "signup";
    }
}
