/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exo421;

import java.util.Scanner;

/**
 *
 * @author Christophe
 */
public class Joueur {

    private int score;
    String nomJoueur;
    private static int numJoueur = 1;

    public Joueur() {

        score = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Quel est le nom du joueur n°" + numJoueur + " ?");
        nomJoueur = input.nextLine();
        numJoueur++;
    }

    public void jouerUnTour(Gobelet gobelet) {

        gobelet.lancer();
        if (gobelet.verif421()) {
            score = score + 1;
        }
    }

    public int getscore() {
        return score ;
    }
   
    public boolean asTuGagne() {
        return (score == 5);
    }
}
