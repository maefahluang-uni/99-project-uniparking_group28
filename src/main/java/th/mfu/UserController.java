package th.mfu;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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

    @GetMapping("/signup")
    public String showSignupPage() {
        return "signup"; 
    }

    @PostMapping("/main")
    public String showMainPage(){
        return "main-page";
    }

    @GetMapping("/m-square")
    public String showMsquarePage(){
        return "m-square";
    }

    @PostMapping("/reservation")
    public String showReservationPage(){
        return "reservation";
    }
@PostMapping("/test")
    public String showLayoutPage(){
        return "layout";
    }
    




    
}
