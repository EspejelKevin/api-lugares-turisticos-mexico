package api.tourist_places_mexico.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("auth/api/v1")
public class AuthController {

    @PostMapping("/login")
    public String login() {
        return "Login";
    }

    @PostMapping("/signup")
    public String signup() {
        return "Signup";
    }

    @GetMapping("/verify-token")
    public String verifyToken() {
        return "Verify token";
    }
}
