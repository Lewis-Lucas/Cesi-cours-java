package com.company;

public class Main {

    public static void main(String[] args) {

        CompteCourant compteMederic = new CompteCourant("212G21GHGH2", "Compte de Médéric Netto", 1000.23, 500.00);
        CompteCourant compteLewis = new CompteCourant( "497339GH3J3", "Compte de Lewis LUCAS", 8549.87, 500.00);

        System.out.println(compteMederic.toString());

        compteMederic.crediter(100.10);

        System.out.println(compteMederic.getSolde());

        compteLewis.debiter(9000.00);
        compteLewis.crediter(9000.00);
        compteLewis.debiter(9500.00);
    }
}
