/**
 * La classe Fleur représente une fleur.
 */
public abstract class Fleur {

    /** Le nom de la fleur */
    protected String nom;

    /** Le prix de la fleur */
    protected double prix;

    /** La couleur de la fleur */
    protected String couleur;

    /** La taille de la fleur */
    protected int taille;

    /**
     * Le constructeur de la classe Fleur.
     * @param nom Le nom de la fleur.
     * @param prix Le prix de la fleur.
     * @param couleur La couleur de la fleur.
     * @param taille La taille de la fleur.
     */
    public Fleur(String nom, double prix, String couleur, int taille){
        this.nom = nom;
        this.prix = prix;
        this.couleur = couleur;
        this.taille = taille;
    }

    /**
     *Permet de changer le prix de la Fleur
     * @param Nvprix Un nombre de type double qui sera le nouveau prix de la Fleur
     */
    public abstract void setPrix(double Nvprix);

    /**
     *Renvoie le prix de la Fleur
     * @return Le prix de la Fleur de type double
     */
    public abstract double getPrix();

    /**
     * Permet de changer la couleur de la Fleur
     * @param NvCouleur La nouvelle couleur de la Fleur
     */
    public abstract void setCouleur(String NvCouleur);

    /**
     * Renvoie la couleur de la Fleur
     * @return La couleur de la Fleur
     */
    public abstract String getCouleur();

    /**
     * Permet de changer la taille de la Fleur
     * @param NvTaille La nouvelle taille de la Fleur
     */
    public abstract void setTaille(int NvTaille);

    /**
     * Renvoie la taille de la Fleur
     * @return La taille de la Fleur
     */
    public abstract int getTaille();

    /**
     *Permet d'afficher les caractéristiques de la Fleur
     */
    public abstract void showProduct();
}