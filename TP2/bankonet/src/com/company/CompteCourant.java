package com.company;

public class CompteCourant extends Compte{

    private static int nbCompteCourants = 0;

    public CompteCourant(String numero, String intitule, double solde, double montantDecouvertAutorise){
        super(numero, intitule, solde, montantDecouvertAutorise);
        nbCompteCourants++;
    }



    //GETTERS AND SETTERS

    public static int getNbCompteCourants() {
        return nbCompteCourants;
    }

}
