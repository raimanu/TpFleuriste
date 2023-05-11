/**
 * Cette classe implémente l'interface FleurFactory et permet de créer des instances de la classe FleurVivante.
 * Elle offre deux méthodes, une pour créer une FleurVivante et une autre pour créer une FleurPlastique,
 * qui est ici renvoyée comme null car elle ne peut pas être créée ici.
 */
public class FleurVivanteFactory implements FleurFactory{

    /**
     * Constructeur de la class FleurVivanteFactory
     */
    public FleurVivanteFactory(){}
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
    @Override
    public FleurVivante creerFleurVivante(String nom, String couleur, double prix, int age, String dureeVie, int taille) {
        return new FleurVivante(nom, couleur, prix, age, dureeVie, taille);
    }

    /**
     * Permet de créer un nouvelle instance de la classe FleurPlastique
     *
     * @param nom Le nom de la Fleur
     * @param couleur La couleur de la Fleur
     * @param prix Le prix de la Fleur
     * @param taille La taille de la Fleur
     * @param matiere La matiere de la Fleur
     * @return Rien car nous ne pouvons pas créer de fleur en plastique ici
     */
    @Override
    public FleurPlastique creerFleurPlastique(String nom, String couleur, double prix, int taille, String matiere) {
        return null;//Non utilisé ici
    }
}
