package th.mfu.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import th.mfu.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class UserController {


    @InitBinder
    public final void initBinderUsuariosFormValidator(final WebDataBinder binder, final Locale locale) {
        final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", locale);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

    @GetMapping("/users")
    public String showUserTypePage() {
        return "user-type-select"; 
    }

    @GetMapping("/to-login")
    public String showLoginPage() {
        return "login";
    }

    @GetMapping("/to-admin-login")
    public String showAdminLoginPage() {
        return "admin-login"; 
    }

    @GetMapping("/m-square")
    public String showMsquarePage(){
        return "m-square";
    }

    @GetMapping("/m-booking")
    public String showMBookingPage(){
        return "booking";
    }

    @PostMapping("/main")
    public String processLogin(String username, String password, RedirectAttributes redirectAttributes) {
        if (UserService.isValidUser(username, password)) {
            // Valid user, redirect to success page
            return "main-page";
        } else {
            // Invalid user, redirect back to login with an error message
            redirectAttributes.addFlashAttribute("error", "Invalid username or password");
            return "redirect:/login";
        }
    }
   

  




    
}
