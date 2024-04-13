package sdu.edu.kz.SpringRestfulAPI.controller;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import sdu.edu.kz.SpringRestfulAPI.payload.auth.Token;
import sdu.edu.kz.SpringRestfulAPI.payload.auth.UserLogin;
import sdu.edu.kz.SpringRestfulAPI.services.TokenService;

@RestController
public class AuthController {
    private final AuthenticationManager authenticationManager;
    private final TokenService tokenService;

    public AuthController(AuthenticationManager authenticationManager, TokenService tokenService) {
        this.authenticationManager = authenticationManager;
        this.tokenService = tokenService;
    }

    @PostMapping("/token")
    @ResponseBody
    public Token token(@RequestBody UserLogin userLogin) throws AuthenticationException {
        Authentication authentication = authenticationManager.
                authenticate(new UsernamePasswordAuthenticationToken(userLogin.email(), userLogin.password()));

        return new Token(tokenService.generateToken(authentication));
    }
}
