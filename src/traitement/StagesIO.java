package traitement;

import contrat.Competence;
import contrat.Niveau;
import model.Entreprise;
import model.Stage;

import java.io.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

/**
 * Permet de charger les fichiers contenant les donnees des etudiants et des stages.
 * Parse et donne accès à ces données en mémoire.
 */
public final class StagesIO {

    private final Map<String, contrat.Stage> stagesMap;
    private final Map<String, contrat.Etudiant> etusMap;
    private final Map<Integer, contrat.Classe> classesMap;
    private final Map<String, contrat.Enseignant> enseignantsMap;
    /**
     * Représente le chemin du fichier des données étudiants.
     */
    private Path etuFilePath;
    /**
     * Représente le chemin du fichier des données stages.
     */
    private Path stagesFilePath;


    public StagesIO(Path etuFilePath, Path stagesFilePath) {
        this.etuFilePath = etuFilePath;
        this.stagesFilePath = stagesFilePath;
        this.stagesMap =  new HashMap<>();
        this.etusMap = new HashMap<>();
        this.classesMap = new HashMap<>();
        this.enseignantsMap = new HashMap<>();
    }

    /**
     * Charge les données étudiants + stages des fichiers specifiés en paramètres au constructeur de cette classe.
     * @throws IOException
     */
    public void chargerDonnees() throws IOException {
        //Files.lines(etuFilePath).forEach(line ->Stre

        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(stagesFilePath.toString()));
            String read = null;
            while ((read = in.readLine()) != null) {

                String[] splited = read.split("#");
                // OOL MODIFICATION ICI
                Entreprise entreprise = new Entreprise(splited[4]);
                switch (splited[2]){
                    case "AMOA" :{
                        switch (splited[3]){
                            case "L3":{
                                Stage stage = new Stage(splited[0],splited[1], Competence.AMOA, Niveau.L3,entreprise);
                                stagesMap.put(splited[0],stage);
                            }
                            break;
                            case "M1":{
                                Stage stage = new Stage(splited[0],splited[1], Competence.AMOA, Niveau.M1,entreprise);
                                stagesMap.put(splited[0],stage);
                            }
                            break;
                            case "M2":{
                                Stage stage = new Stage(splited[0],splited[1], Competence.AMOA, Niveau.M2,entreprise);
                                stagesMap.put(splited[0],stage);
                            }
                            break;
                        }
                    }
                    break;
                    case "AMOE" :{
                        switch (splited[3]){
                            case "L3":{
                                Stage stage = new Stage(splited[0],splited[1], Competence.AMOE, Niveau.L3,entreprise);
                                stagesMap.put(splited[0],stage);
                            }
                            break;
                            case "M1":{
                                Stage stage = new Stage(splited[0],splited[1], Competence.AMOE, Niveau.M1,entreprise);
                                stagesMap.put(splited[0],stage);
                            }
                            break;
                            case "M2":{
                                Stage stage = new Stage(splited[0],splited[1], Competence.AMOE, Niveau.M2,entreprise);
                                stagesMap.put(splited[0],stage);
                            }
                            break;
                        }
                    }
                    break;
                    case "DONNEES" :{
                        switch (splited[3]){
                            case "L3":{
                                Stage stage = new Stage(splited[0],splited[1], Competence.DONNEES, Niveau.L3,entreprise);
                                stagesMap.put(splited[0],stage);
                            }
                            break;
                            case "M1":{
                                Stage stage = new Stage(splited[0],splited[1], Competence.DONNEES, Niveau.M1,entreprise);
                                stagesMap.put(splited[0],stage);
                            }
                            break;
                            case "M2":{
                                Stage stage = new Stage(splited[0],splited[1], Competence.DONNEES, Niveau.M2,entreprise);
                                stagesMap.put(splited[0],stage);
                            }
                            break;
                        }
                    }
                    break;
                    case "MOBILE" :{
                        switch (splited[3]){
                            case "L3":{
                                Stage stage = new Stage(splited[0],splited[1], Competence.MOBILE, Niveau.L3,entreprise);
                                stagesMap.put(splited[0],stage);
                            }
                            break;
                            case "M1":{
                                Stage stage = new Stage(splited[0],splited[1], Competence.MOBILE, Niveau.M1,entreprise);
                                stagesMap.put(splited[0],stage);
                            }
                            break;
                            case "M2":{
                                Stage stage = new Stage(splited[0],splited[1], Competence.MOBILE, Niveau.M2,entreprise);
                                stagesMap.put(splited[0],stage);
                            }
                            break;
                        }
                    }
                    break;
                    case "SECURITE" :{
                        switch (splited[3]){
                            case "L3":{
                                Stage stage = new Stage(splited[0],splited[1], Competence.SECURITE, Niveau.L3,entreprise);
                                stagesMap.put(splited[0],stage);
                            }
                            break;
                            case "M1":{
                                Stage stage = new Stage(splited[0],splited[1], Competence.SECURITE, Niveau.M1,entreprise);
                                stagesMap.put(splited[0],stage);
                            }
                            break;
                            case "M2":{
                                Stage stage = new Stage(splited[0],splited[1], Competence.SECURITE, Niveau.M2,entreprise);
                                stagesMap.put(splited[0],stage);
                            }
                            break;
                        }
                    }
                    break;
                    case "SYSADMIN" :{
                        switch (splited[3]){
                            case "L3":{
                                Stage stage = new Stage(splited[0],splited[1], Competence.SYSADMIN, Niveau.L3,entreprise);
                                stagesMap.put(splited[0],stage);
                            }
                            break;
                            case "M1":{
                                Stage stage = new Stage(splited[0],splited[1], Competence.SYSADMIN, Niveau.M1,entreprise);
                                stagesMap.put(splited[0],stage);
                            }
                            break;
                            case "M2":{
                                Stage stage = new Stage(splited[0],splited[1], Competence.SYSADMIN, Niveau.M2,entreprise);
                                stagesMap.put(splited[0],stage);
                            }
                            break;
                        }
                    }
                    break;
                    case "WEB" :{
                        switch (splited[3]){
                            case "L3":{
                                Stage stage = new Stage(splited[0],splited[1], Competence.WEB, Niveau.L3,entreprise);
                                stagesMap.put(splited[0],stage);
                            }
                            break;
                            case "M1":{
                                Stage stage = new Stage(splited[0],splited[1], Competence.WEB, Niveau.M1,entreprise);
                                stagesMap.put(splited[0],stage);
                            }
                            break;
                            case "M2":{
                                Stage stage = new Stage(splited[0],splited[1], Competence.WEB, Niveau.M2,entreprise);
                                stagesMap.put(splited[0],stage);
                            }
                            break;
                        }
                    }
                    break;

                }

                for (String part : splited) {

                    System.out.println(part);
                }
            }
        } catch (IOException e) {
            System.out.println("There was a problem: " + e);
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (Exception e) {
            }
        }
    }

    /**
     * Renvoie la liste des classes, triées selon le niveau (L3, M1, M2)
     * @return la liste des classes
     */
    public List<contrat.Classe> getClasses() {
        return null;
    }

    /**
     * Renvoie la liste des enseignants, triés selon leur nom.
     * @return la liste des enseignants
     */
    public List<contrat.Enseignant> getEnseignants(){
        return null;
    }

    public Set<contrat.Entreprise> getEntreprises(){
        return null;
    }

    /**
     * Renvoie la liste des étudiants, triés selon leur nom.
     * @return la liste des étudiants
     */
    public List<contrat.Etudiant> getEtudiants(){
        return null;
    }

    /**
     * Renvoie la liste des stages, triés selon le niveau (L3, M1, M2)
     * @return la liste des stages
     */
    public List<contrat.Stage> getStages(){
        ArrayList result = new ArrayList(Collections.singleton(stagesMap.values().toString()));
        return result;

    }

}
