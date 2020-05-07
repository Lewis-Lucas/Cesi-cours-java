package com.company;

public class Client {

    private String identifiant;
    private String nom;
    private String prenom;
    private CompteCourant compteCourant;
    private CompteEpargne compteEpargne;

    public Client(String identifiant, String nom, String prenom, CompteCourant compteCourant, CompteEpargne compteEpargne){
        this.identifiant = identifiant;
        this.nom = nom;
        this.prenom = prenom;
        this.compteCourant = compteCourant;
        this.compteEpargne = compteEpargne;
    }

    public String toString(){
        return "Le client " + this.identifiant + " s'appelle " + this.prenom + " " + this.nom +
                ".";
    }

    public double calculerAvoirGlobal() {
        return this.compteEpargne.getSolde() + this.compteCourant.getSolde();
    }
}
