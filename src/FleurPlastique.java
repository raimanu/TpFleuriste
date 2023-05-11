/**
 * La classe FleurPlastique représente une fleur en plastique.
 * Cette classe étend la classe Fleur pour hériter de ses propriétés et ajoute une propriété matière.
 */
public class FleurPlastique extends Fleur{
    /**
     * La matière de la fleur
     */
    private String matiere;

    /**
     * Constructeur de la classe FleurPlastique
     *
     * @param nom Le nom de la Fleur
     * @param couleur La couleur de la Fleur
     * @param prix Le prix de la Fleur
     * @param taille La taille de la Fleur
     * @param matiere La matière de la Fleur
     */
    public FleurPlastique(String nom, String couleur, double prix, int taille, String matiere){
        super(nom,prix,couleur,taille);
        this.matiere = matiere;
    }

    /**
     * Permet de changer le prix de la Fleur
     *
     * @param Nvprix Un nombre de type double qui sera le nouveau prix de la Fleur
     */
    @Override
    public void setPrix(double Nvprix) {
        this.prix = Nvprix;
    }

    /**
     * Renvoie le prix de la Fleur
     *
     * @return Le prix de la Fleur de type double
     */
    @Override
    public double getPrix() {
        return prix;
    }

    /**
     * Permet de changer la couleur de la Fleur
     *
     * @param NvCouleur La nouvelle couleur de la Fleur
     */
    @Override
    public void setCouleur(String NvCouleur) {
        this.couleur = NvCouleur;
    }

    /**
     * Renvoie la couleur de la Fleur
     *
     * @return La couleur de la Fleur
     */
    @Override
    public String getCouleur() {
        return couleur;
    }

    /**
     * Permet de changer la taille de la Fleur
     *
     * @param NvTaille La nouvelle taille de la Fleur
     */
    @Override
    public void setTaille(int NvTaille) {
        this.taille = NvTaille;
    }

    /**
     * Renvoie la taille de la Fleur
     *
     * @return La taille de la Fleur
     */
    @Override
    public int getTaille() {
        return taille;
    }

    /**
     * Permet de changer la matière de la Fleur
     *
     * @param NvMatiere La nouvelle matière de la Fleur
     */
    public void setMatiere(String NvMatiere) {
        this.matiere = NvMatiere;
    }

    /**
     * Renvoie la matière de la Fleur
     *
     * @return La matière de la Fleur
     */
    public String getMatiere() {
        return matiere;
    }

    /**
     * Permet d'afficher les caractéristiques de la Fleur
     */
    @Override
    public void showProduct() {
        System.out.println(nom+" : coûte "+prix+" euro\n"+"Elle est de couleur "+couleur+", elle mesure "+ taille + " et est fait de " + matiere + "\n");
    }
}
