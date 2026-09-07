package com.cabinetkine.cabinet_kine_backend.controller;

import com.cabinetkine.cabinet_kine_backend.dto.LoginRequest;
import com.cabinetkine.cabinet_kine_backend.service.JwtService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cabinetkine.cabinet_kine_backend.model.Utilisateur;
import com.cabinetkine.cabinet_kine_backend.repository.UtilisateurRepository;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;
    private final UtilisateurRepository utilisateurRepository;

    public AuthController(AuthenticationManager authenticationManager, JwtService jwtService, UtilisateurRepository utilisateurRepository){
        this.authenticationManager = authenticationManager;
        this.jwtService = jwtService;
        this.utilisateurRepository = utilisateurRepository;
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest loginRequest){

        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginRequest.getEmail(),
                        loginRequest.getMotDePasse()
                )
        );
        Utilisateur utilisateur = utilisateurRepository.findByEmail(loginRequest.getEmail()).orElseThrow();
        return jwtService.genererToken(utilisateur.getEmail(), utilisateur.getRole());
    }


}
