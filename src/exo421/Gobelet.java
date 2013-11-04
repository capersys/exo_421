/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo421;

/**
 *
 * @author Christophe
 */
public class Gobelet {

    public De[] des;
    private int resultatDé;

    public Gobelet() {

        des = new De[3];
        for (int i = 0; i < des.length; i++) {
            des[i] = new De();
        }
    }

    public void lancer() {
        for (De d : des) {
            d.lancer();
        }
    }

    public boolean verif421() {
        resultatDé = 0;             
        int[] test421 = {4, 0, 2, 0, 1, 0};    // tableau 2 en 1 : test si le dé tombe sur le 4, le 2 ou le 1. Si oui, le '0' devient '1'

        for (int i = 0; i < des.length; i++) {
            //System.out.println("Le dé "+i+" a la valeur "+des[i].lireValeur());
            for (int j = 0; j < test421.length; j += 2) {
                if (des[i].lireValeur() == test421[j]) {
                    test421[j + 1] = 1;
                }
            }
        }
        for (int j = 1; j < test421.length; j += 2) {    // totalise le score obtenu après le lancer des 3 dés
            resultatDé = resultatDé + test421[j];
        }
        //System.out.println("Resultat du tirage = "+resultatDé);
        return (resultatDé == 3);   // si le resultat est =3, le joueur a obtenu le 421 !

// version précédente
//        if ((des[0].lireValeur() == 4) || (des[0].lireValeur() == 2) || (des[0].lireValeur() == 1)) {
//            resultatDé = resultatDé + 1;
//        }
//
//        if (((des[1].lireValeur() == 4) || (des[1].lireValeur() == 2) || (des[1].lireValeur() == 1)) && ((des[1].lireValeur() != des[0].lireValeur()))) {
//            resultatDé = resultatDé + 1;
//
//        }
//
//        if (((des[2].lireValeur() == 4) || (des[2].lireValeur() == 2) || (des[2].lireValeur() == 1))
//                && (((des[2].lireValeur() != des[0].lireValeur()) && (des[2].lireValeur() != des[1].lireValeur())))) {
//            resultatDé = resultatDé + 1;
//        }
//        System.out.println("Valeur de D0= " + des[0].lireValeur() + ". Valeur de D1= " + des[1].lireValeur() + ". Valeur de D2= " + des[2].lireValeur());
//        return (resultatDé == 3);
    }

}
