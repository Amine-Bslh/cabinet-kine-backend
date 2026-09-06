package com.cabinetkine.cabinet_kine_backend.service;

import com.cabinetkine.cabinet_kine_backend.model.Utilisateur;
import com.cabinetkine.cabinet_kine_backend.repository.UtilisateurRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UtilisateurRepository utilisateurRepository;

    public CustomUserDetailsService(UtilisateurRepository utilisateurRepository){

        this.utilisateurRepository  =utilisateurRepository;
    }
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException{

        Utilisateur utilisateur = utilisateurRepository.findByEmail(email)
                .orElseThrow(()-> new UsernameNotFoundException("Utilisateur non trouvé"));

        return new User(
                utilisateur.getEmail(),
                utilisateur.getMotDePasse(),
                List.of()
        );
    }


}
