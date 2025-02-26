package services;

import models.Personne;

public class ListePersonne_SansTrous {

    public final static int NBRE_MAX_PERSONNES = 6;

    private Personne[] personnes;
    private int nbPersonnes;

    public ListePersonne_SansTrous() {
        personnes = new Personne[NBRE_MAX_PERSONNES];
        nbPersonnes = 0;
    }

    public int getNombre() {
        return nbPersonnes;
    }

    public void vider() {
        nbPersonnes = 0;
    }

    public boolean ajouter(Personne p) {

        boolean reussi = false;

        if (p != null) {
            if (nbPersonnes < NBRE_MAX_PERSONNES) {
                personnes[nbPersonnes++] = p;
                reussi = true;
            }
        }

        return reussi;
    }

    public boolean supprimer(Personne p) {

        boolean reussi = false;

        if (p != null) {
            for (int i = 0; i < nbPersonnes; i++) {
                if (personnes[i] == p) {
                    for (int j = i; j < nbPersonnes - 1; j++) {
                        personnes[j] = personnes[j + 1];
                    }
                    nbPersonnes--;
                    reussi = true;
                }
            }
        }

        return reussi;
    }

    public void afficher() {
        for (int i = 0; i < nbPersonnes; i++) {
            System.out.println(personnes[i]);
        }
    }

}
