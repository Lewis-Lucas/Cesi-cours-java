package com.company;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompteEpargneTest {


    CompteEpargne compteMederic = new CompteEpargne("212G21GHGH2", "Compte de Médéric Netto", 10000.23, 0, 5.00);
    CompteEpargne compteLewis = new CompteEpargne( "497339GH3J3", "Compte de Lewis LUCAS", 8549.87, 0, 5.00);
    CompteEpargne compteCourant1 = new CompteEpargne("98478BDN433", "Compte de Jessica DROZA", 22.00, 0, 2.00);

    @Test
    void crediterPositif() {
        compteCourant1.crediter(1.00);
        assertEquals(23.00, compteCourant1.getSolde());
    }

    @Test
    void crediterNegatif() {
        compteCourant1.crediter(-1.00);
        assertEquals(22.00, compteCourant1.getSolde());
    }

    @Test
    void crediterNul() {
        compteCourant1.crediter(0.00);
        assertEquals(22.00, compteCourant1.getSolde());
    }

    @Test
    void debiterPositif() {
        compteCourant1.debiter(10.00);
        assertEquals(12.00, compteCourant1.getSolde());
        compteCourant1.debiter(15.00);
        assertEquals(12.00, compteCourant1.getSolde());
    }

    @Test
    void debiterNegatif() {
        compteCourant1.debiter(-10.00);
        assertEquals(22.00, compteCourant1.getSolde());
    }

    @Test
    void debiterNul() {
        compteCourant1.debiter(0.00);
        assertEquals(22.00, compteCourant1.getSolde());
    }

    @Test
    void calculerInteret() {
        compteCourant1.calculerInterets(compteCourant1.getTauxInteret(), compteCourant1.getSolde());
        assertEquals(22.44, compteCourant1.getSolde());
    }
}