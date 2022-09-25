import jdk.jfr.Category;

import java.util.ArrayList;

public class Jeux {
    private String nom;
    private Categorie categorie;

    public Jeux(String nom, Categorie categorie) {
        this.nom = nom;
        this.categorie = categorie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCategorie() {
        return categorie.getNomCategorie();
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    static public String toString(ArrayList<Jeux> allJeux) {
        String print = " \n";
        int index = 0;
        if (allJeux != null) {
            for (Jeux currentJeux : allJeux) {
                print += " \n " + (index + 1) +"-"+ " nom de jeux : " + currentJeux.nom + " categorie : " + currentJeux.getCategorie();
                index++;
            }
        }

        return print;
    }
}
