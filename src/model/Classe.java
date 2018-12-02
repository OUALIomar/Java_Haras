package model;

import contrat.Etudiant;
import contrat.Filiere;
import contrat.Niveau;

import java.util.HashSet;
import java.util.Set;

public final class Classe implements contrat.Classe {

    private final Niveau niveau;
    private final Filiere filiere;
    private final String annee;
    private final Set<contrat.Etudiant> etudiants;


    public Classe(Niveau niveau, Filiere filiere, String annee) {
        this.niveau = niveau;
        this.filiere = filiere;
        this.annee = annee;
        this.etudiants = new HashSet<Etudiant>();
    }


    @Override
    public Niveau getNiveau() {
        return this.niveau;
    }

    @Override
    public String getAnnee() {
        return this.annee;
    }

    @Override
    public Filiere getFiliere() {
        return this.filiere;
    }

    @Override
    public Set<Etudiant> getEtudiants() {
        return this.etudiants;
    }

    @Override
    public boolean addEtudiants(Etudiant etu) { // le prof veux que la methode renvoie un boolean

      return this.etudiants.add(etu);
      /*
        add :
        Ajouter l'élément fourni en paramètre à la collection si
        celle-ci ne le contient pas déjà et renvoyer un booléen qui précise si la
        collection a été modifiée
      */
    }

    @Override
    public boolean removeEtudiant(Etudiant etu) { // le prof veux que la methode renvoie un boolean
        return this.etudiants.remove(etu);
        /*
        Retirer l'élément fourni en paramètre de la collection si
        celle-ci le contient et renvoyer un booléen qui précise si la collection a été modifiée
         */
    }
}
