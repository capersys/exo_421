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
public class JeuDeDe {

    int nbreJoueur = 3;
    private Joueur[] joueurs;
    public Gobelet gobelet;

    public JeuDeDe() {

        gobelet = new Gobelet();
        joueurs = new Joueur[nbreJoueur];
        for (int i = 0; i < nbreJoueur; i++) {
            joueurs[i] = new Joueur();
        }
    }

    public void jouerUnePartie() {

        while (pasDeGagnant()) {
            jouerUnTour();
            afficherResultat();

        }
    }

    private void jouerUnTour() {
        System.out.println("Un tour va commencer");
        for (Joueur j : joueurs) {
            j.jouerUnTour(gobelet);
        }

    }

    private boolean pasDeGagnant() {
        boolean pasDeGagnant = true;
        for (Joueur j : joueurs) {
            if (j.asTuGagne()) {
                System.out.println("Le joueur " + j.nomJoueur + " a gagné");
                pasDeGagnant = false;
            }
        }
        return pasDeGagnant;
    }

    private void afficherResultat() {
        for (Joueur j : joueurs) {
            System.out.println("Le joueur " + j.nomJoueur + " a " + j.getscore() + " points.");
        }
    }

}
