package com.company;

public class CompteEpargne extends Compte{

    private double tauxInteret;

    public CompteEpargne(String numero, String intitule, double solde, double montantDecouvert, double tauxInteret){
        super(numero, intitule, solde, montantDecouvert);
        this.tauxInteret = tauxInteret;
    }

    public void calculerInterets(double tauxInteret, double solde){
        this.solde += solde * tauxInteret/100;
    }

    //GETTERS AND SETTERS

    public double getTauxInteret() {
        return tauxInteret;
    }
}
