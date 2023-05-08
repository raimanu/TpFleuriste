public interface FleurFactory {
    FleurVivante creerFleurVivante(String nom, String couleur, double prix, int age, String dureeVie, int taille);
    FleurPlastique creerFleurPlastique(String nom, String couleur, double prix, int taille, String matiere);
}
