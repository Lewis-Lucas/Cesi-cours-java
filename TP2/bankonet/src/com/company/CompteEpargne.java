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

    public void debiter(double montant) {
        if (montant > 0 && (this.solde - montant) > 0) {
            this.solde -= montant;
        } else {
            System.out.println("Echec de l'opération");
        }
    }

    public boolean isDebitAutorise() {
        return false;
    }

    //GETTERS AND SETTERS

    public double getTauxInteret() {
        return tauxInteret;
    }
}
