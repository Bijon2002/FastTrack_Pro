package com.Project.fasttrack.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/login")
    public String loginPage() {
        return "auth/login"; // Points to templates/auth/login.html
    }

    @GetMapping("/signup")
    public String signupPage() {
        return "auth/signup"; // Points to templates/auth/signup.html
    }
}
