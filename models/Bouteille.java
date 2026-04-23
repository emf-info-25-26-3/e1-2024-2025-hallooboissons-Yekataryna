package models;

public class Bouteille {

    private static String nom;
    private static double prix;
    private static int contenance;
    public int remplissage = 100;
    public static boolean enVerre;

    public Bouteille(String nom, double prix, int contenance, boolean enVerre) {
        this.nom = nom;
        this.prix = prix;
        this.contenance = contenance;
        this.enVerre = enVerre;
        this.remplissage = 100;
    }

    public static String getNom() {
        return nom;
    }

    public static double getPrix() {
        return prix;
    }

    public static int getContenance() {
        return contenance;
    }

    public int getRemplissage() {
        return remplissage;
    }

    public void setRemplissage(int remplissage) {
        this.remplissage = remplissage;
    }

    public static boolean isEnVerre() {
        return enVerre;
    }

    @Override
    public String toString() {
        String verre = "verre";
        if (enVerre == false) {
            verre = "plastique";
        }
        String cont = "entamée";
        if (contenance == 100) {
            cont = "pleine";
        } else if (contenance == 0) {
            cont = "vide";
        }

        return "Bouteille '" + nom + "' de " + remplissage + "L en " + verre + " à "
                + prix + "Frs - " + cont;
    }

}
