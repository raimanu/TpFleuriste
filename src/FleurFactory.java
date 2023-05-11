/**
 *Cette interface définit les méthodes pour créer des objets de type FleurVivante et FleurPlastique.
 */
public interface FleurFactory {
    /**
     * Permet de créer un nouvelle instance de la classe FleurVivante
     *
     * @param nom Le nom de la Fleur
     * @param couleur La couleur de la Fleur
     * @param prix Le prix de la Fleur
     * @param age L'age de la Fleur
     * @param dureeVie La duree de vie de la Fleur en bouquet
     * @param taille La taille de la Fleur
     * @return Une nouvelle instance de la classe FleurVivante
     */
    FleurVivante creerFleurVivante(String nom, String couleur, double prix, int age, String dureeVie, int taille);

    /**
     * Permet de créer un nouvelle instance de la classe FleurPlastique
     *
     * @param nom Le nom de la Fleur
     * @param couleur La couleur de la Fleur
     * @param prix Le prix de la Fleur
     * @param taille La taille de la Fleur
     * @param matiere La matiere de la Fleur
     * @return Une nouvelle instance de la classe FleurPlastique
     */
    FleurPlastique creerFleurPlastique(String nom, String couleur, double prix, int taille, String matiere);
}
