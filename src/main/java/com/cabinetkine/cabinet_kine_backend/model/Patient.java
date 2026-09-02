package com.cabinetkine.cabinet_kine_backend.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;
    private String telephone;

    public String getNom(){
        return nom;
    }

    public void SetNom(String nom){
        this.nom = nom;
    }

    public String getPrenom(){
        return prenom;
    }

    public void setPrenom(String prenom){

        this.prenom = prenom;
    }

    public String getTelephone(){

        return telephone;
    }

    public void setTelephone(String telephone)
    {
        this.telephone = telephone;
    }


}
