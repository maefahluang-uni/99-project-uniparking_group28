package th.mfu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import th.mfu.services.UserService;

@Controller
@RequestMapping("/login")
public class LoginController {

    public LoginController(UserService userService) {
    }

    @GetMapping
    public String showLoginForm() {
        return "login";
    }

    
}
