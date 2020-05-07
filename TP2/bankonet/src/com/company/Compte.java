package com.company;

public class Compte {

    protected String numero;
    protected String intitule;
    protected double solde;
    protected double montantDecouvertAutorise;

    public Compte(String numero, String intitule, double solde, double montantDecouvertAutorise){
        this.numero = numero;
        this.intitule = intitule;
        this.solde = solde;
        this.montantDecouvertAutorise = montantDecouvertAutorise;
    }

    public String toString(){
        return "Le numéro du " + this.intitule + " est " + this.numero +
                ". Son solde est de " + this.solde + ".";
    }

    public void crediter(double montant){
        if(montant >= 0.00) {
            this.solde += montant;
            System.out.println("Le " + this.intitule + " a bien été crédité. Son solde est maintenant de " + this.solde);
        }
        else{
            System.out.println("Le montant a crédité ne peut pas être négatif. Le solde reste donc à " + this.solde);
        }
    }

    public void debiter(double montant){
        if(montant >= 0.00) {
            double totalApresDebit = this.solde - montant;

            if (totalApresDebit < (-this.montantDecouvertAutorise)) {
                System.out.println("Le montant du découvert total a été dépassé. Le solde s'élève maintenant à " + this.solde);
            } else {
                this.solde -= montant;
                System.out.println("Le montant du découvert total est respecté. Le solde s'élève maintenant à " + this.solde);
            }
        }
        else{
            System.out.println("Le montant a débité ne peut pas être négatif. Le solde reste donc à " + this.solde);
        }
    }


    //GETTERS AND SETTERS

    public double getSolde() {
        return solde;
    }
}
