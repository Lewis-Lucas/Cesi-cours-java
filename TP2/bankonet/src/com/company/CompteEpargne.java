package com.company;

public class CompteEpargne {

    private String numero;
    private String intitule;
    private double solde;
    private double tauxInteret;

    public CompteEpargne(String numero, String intitule, double solde, double tauxInteret){
        this.numero = numero;
        this.intitule = intitule;
        this.solde = solde;
        this.tauxInteret = tauxInteret;
    }

    public String toString(){
        return "Le numéro du " + this.intitule + " est " + this.numero +
                ". Son solde est de " + this.solde + " et le taux d'intérêt s'élève à " + this.tauxInteret;
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
            this.solde -= montant;
            if (totalApresDebit < 0) {
                System.out.println("Le solde ne peut pas être négatif. Le solde s'élève maintenant à " + this.solde);
            } else {
                System.out.println("Le solde s'élève maintenant à " + this.solde);
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
