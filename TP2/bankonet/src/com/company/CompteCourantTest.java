package com.company;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompteCourantTest {
    @Test
    void createCompte() {
        CompteCourant compteMederic = new CompteCourant("212G21GHGH2", "Compte de Médéric Netto", 10000.23, 500.00);
        CompteCourant compteLewis = new CompteCourant( "497339GH3J3", "Compte de Lewis LUCAS", 8549.87, 500.00);
        CompteCourant compteJessica = new CompteCourant("98478BDN433", "Compte de Jessica DROZA", 20.00, 200.00);

        assertEquals(3, CompteCourant.getNbCompteCourants());
    }

    @Test
    void crediterPositif() {
        CompteCourant compteCourant1 = new CompteCourant("numtest", "test", 22.00, 150.0);
        compteCourant1.crediter(1.00);
        assertEquals(23.00, compteCourant1.getSolde());
    }

    @Test
    void crediterNegatif() {
        CompteCourant compteCourant1 = new CompteCourant("numtest", "test", 22.00, 150.0);
        compteCourant1.crediter(-1.00);
        assertEquals(22.00, compteCourant1.getSolde());
    }

    @Test
    void crediterNul() {
        CompteCourant compteCourant1 = new CompteCourant("numtest", "test", 22.00, 150.0);
        compteCourant1.crediter(0.00);
        assertEquals(22.00, compteCourant1.getSolde());
    }

    @Test
    void debiterPositif() {
        CompteCourant compteCourant1 = new CompteCourant("numtest", "test", 22.00, 150.0);
        compteCourant1.debiter(10.00);
        assertEquals(12.00, compteCourant1.getSolde());
    }

    @Test
    void debiterNegatif() {
        CompteCourant compteCourant1 = new CompteCourant("numtest", "test", 22.00, 150.0);
        compteCourant1.debiter(-10.00);
        assertEquals(22.00, compteCourant1.getSolde());
    }

    @Test
    void debiterNul() {
        CompteCourant compteCourant1 = new CompteCourant("numtest", "test", 22.00, 150.0);
        compteCourant1.debiter(0.00);
        assertEquals(22.00, compteCourant1.getSolde());
    }
}