package model;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class Entreprise implements contrat.Entreprise {

    private final String nom;
    private final Set<Stage> stages;

    public Entreprise(String nom) {
        this.nom = nom;
        this.stages = new HashSet<Stage>();
    }


    @Override
    public String getNom() {
        return this.nom;
    }

    @Override
    public Set<Stage> getStages() {
        return this.stages;
    }

    @Override
    public boolean addStage(Stage stage) {
        return this.stages.add(stage);
    }
}
