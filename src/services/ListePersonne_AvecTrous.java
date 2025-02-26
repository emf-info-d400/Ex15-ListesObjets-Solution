package services;

import models.Personne;

public class ListePersonne_AvecTrous {

    public final static int NBRE_MAX_PERSONNES = 6;

    private Personne[] personnes;

    public ListePersonne_AvecTrous() {
        personnes = new Personne[NBRE_MAX_PERSONNES];
    }

    public int getNombre() {
        int nbPersonnes = 0;

        for (int i = 0; i < personnes.length; i++) {
            if (personnes[i] != null) {
                nbPersonnes++;
            }
        }

        return nbPersonnes;
    }

    public void vider() {
        for (int i = 0; i < personnes.length; i++) {
            personnes[i] = null;
        }
    }

    public boolean ajouter(Personne p) {

        boolean reussi = false;

        if (p != null) {
            for (int i = 0; i < personnes.length; i++) {
                if (personnes[i] == null) {
                    personnes[i] = p;
                    reussi = true;
                    break;
                }
            }
        }

        return reussi;
    }

    public boolean supprimer(Personne p) {

        boolean reussi = false;

        if (p != null) {
            for (int i = 0; i < personnes.length; i++) {
                if (personnes[i] == p) {
                    personnes[i] = null;
                    reussi = true;
                    break;
                }
            }
        }

        return reussi;
    }

    public void afficher() {
        for (int i = 0; i < personnes.length; i++) {
            if (personnes[i] != null) {
                System.out.println(personnes[i]);
            }
        }
    }
}
