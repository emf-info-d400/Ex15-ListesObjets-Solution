package services;

import models.Personne;

public class ListePersonne_Dynamique {

    private Personne[] personnes;

    public ListePersonne_Dynamique() {
        personnes = new Personne[0]; // Aucune pour l'instant
    }

    public int getNombre() {
        return personnes.length;
    }

    public void vider() {
        personnes = new Personne[0];
    }

    public boolean ajouter(Personne p) {

        boolean reussi = false;

        if (p != null) {
            Personne[] personnesNouveau = new Personne[personnes.length + 1];
            for (int i = 0; i < personnes.length; i++) {
                personnesNouveau[i] = personnes[i];
            }
            personnesNouveau[personnesNouveau.length - 1] = p;
            personnes = personnesNouveau;
            reussi = true;
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
            if (reussi) {
                Personne[] personnesNouveau = new Personne[personnes.length - 1];
                int pos = 0;
                for (int i = 0; i < personnes.length; i++) {
                    if (personnes[i] != null) {
                        personnesNouveau[pos++] = personnes[i];
                    }
                }
                personnes = personnesNouveau;
            }
        }

        return reussi;
    }

    public void afficher() {
        for (int i = 0; i < personnes.length; i++) {
            System.out.println(personnes[i]);
        }
    }
}
