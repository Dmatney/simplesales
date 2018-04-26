package launchcode.com.simplesales.controllers;

import launchcode.com.simplesales.models.data.UserDao;
import launchcode.com.simplesales.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

@Controller
@RequestMapping("signup")

public class SignupController {
    @Autowired
    private UserDao userDao;

    @RequestMapping("")
    public String index(Model model) {
        model.addAttribute("title", "Signup");
        return "signup/signup";
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String displayAddCheeseForm(Model model) {
    model.addAttribute("title", "Add Cheese");
        model.addAttribute(new User());
        return "signup/thanks:";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String processAddCheeseForm(@ModelAttribute  @Valid User newUser,
                                       Errors errors, @RequestParam int categoryId, Model model) {
        //if (errors.hasErrors()) {
        //    model.addAttribute("title", "Add Cheese");
        //    return "cheese/add";
        //}
        userDao.save(newUser);

        return "signup/thanks:";
    }
}
