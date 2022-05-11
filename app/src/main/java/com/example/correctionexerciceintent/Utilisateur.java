package com.example.correctionexerciceintent;

import java.io.Serializable;
import java.util.Date;

public class Utilisateur implements Serializable {

    private String login;
    private String password;
    private String nom;
    private String prenom;
    private Date dateNaissance;
    private int image;

    public Utilisateur() {
    }

    public Utilisateur(String login, String password, String nom, String prenom, Date dateNaissance, int image) {
        this.login = login;
        this.password = password;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.image = image;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
