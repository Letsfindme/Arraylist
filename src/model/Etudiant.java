package model;

public class Etudiant {
    String nom;
    double longeur;

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "nom='" + nom + '\'' +
                ", longeur=" + longeur +
                '}';
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getLongeur() {
        return longeur;
    }

    public void setLongeur(double longeur) {
        this.longeur = longeur;
    }
}
