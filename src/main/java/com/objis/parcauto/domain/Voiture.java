/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.parcauto.domain;

/**
 *
 */
public class Voiture {
    private Long id;
    private String immatriculation;
    private String marque;
    private String couleur;
    private Chauffeur chauffeur;
    private Garage garage;

    public Voiture(Long id, String immatriculation, String marque, String couleur, Chauffeur chauffeur, Garage garage) {
        this.id = id;
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.couleur = couleur;
        this.chauffeur = chauffeur;
        this.garage = garage;
    }

    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public Chauffeur getChauffeur() {
        return chauffeur;
    }

    public void setChauffeur(Chauffeur chauffeur) {
        this.chauffeur = chauffeur;
    }
    
    
    
}
