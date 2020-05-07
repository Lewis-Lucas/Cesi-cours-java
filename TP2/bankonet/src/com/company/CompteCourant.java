package com.company;

public class CompteCourant extends Compte{

    private static int nbCompteCourants = 0;

    public CompteCourant(String numero, String intitule, double solde, double montantDecouvertAutorise){
        super(numero, intitule, solde, montantDecouvertAutorise);
        nbCompteCourants++;
    }

    public void debiter(double montant) {
        if ((montant > 0.00) && (this.solde - montant) > (0 - this.montantDecouvertAutorise)) {
            this.solde -= montant;
        } else {
            System.out.println("Echec de l'opération");
        }
    }

    public boolean isDebitAutorise() {
        return true;
    }


    //GETTERS AND SETTERS

    public static int getNbCompteCourants() {
        return nbCompteCourants;
    }

}
