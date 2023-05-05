public interface FleurAbstractFactory {
    public FleurVivante creerFleurVivante(String nom, String couleur, double prix, int age, String dureeVie, int taille);
    public FleurPlastique creerFleurPlastique(String nom, String couleur, double prix, int taille, String matiere);
}
