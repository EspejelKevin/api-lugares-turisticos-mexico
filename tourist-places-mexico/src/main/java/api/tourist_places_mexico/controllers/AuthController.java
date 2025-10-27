package api.tourist_places_mexico.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import api.tourist_places_mexico.domain.dto.auth.LoginAdminDTO;
import api.tourist_places_mexico.domain.dto.auth.SignUpAdminDTO;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/auth/api/v1")
public class AuthController {

    @PostMapping("/login")
    public String login(@Valid @RequestBody LoginAdminDTO payload) {
        return "Login";
    }

    @PostMapping("/signup")
    public String signup(@Valid @RequestBody SignUpAdminDTO payload) {
        return "Signup";
    }

    @GetMapping("/verify-token")
    public String verifyToken() {
        return "Verify token";
    }
}
