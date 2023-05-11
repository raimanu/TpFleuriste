/**
 * La classe FleurVivante représente une fleur vivante.
 * Cette classe étend la classe Fleur pour hériter de ses propriétés et ajoute une propriété age, dureeVie et vivant.
 */
public class FleurVivante extends Fleur {
    /**
     * L'age de la fleur
     */
    protected int age;
    /**
     * La durée de vie de la fleur
     */
    protected String dureeVie;
    /**
     * Si la fleur est vivante ou non
     */
    protected boolean vivant = true;

    /**
     * Le constructeur de la classe FleurVivante
     *
     * @param nom Le nom de la Fleur
     * @param couleur La couleur de la Fleur
     * @param prix Le prix de la Fleur
     * @param age L'age de la Fleur
     * @param dureeVie La durée de vie de la Fleur
     * @param taille La taille de la Fleur
     */
    public FleurVivante(String nom, String couleur, double prix, int age, String dureeVie, int taille){
        super(nom,prix,couleur,taille);
        this.age = age;
        this.dureeVie = dureeVie;
    }
    /**
     *Permet de changer le prix de la Fleur
     * @param Nvprix Un nombre de type double qui sera le nouveau prix de la Fleur
     */
    @Override
    public void setPrix(double Nvprix) {
        this.prix = Nvprix;
    }

    /**
     *Renvoie le prix de la Fleur
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
     * Modifie l'âge de la Fleur en lui attribuant une nouvelle valeur.
     *
     * @param age la nouvelle valeur de l'âge de l'objet
     */
    public void vieillir(int age) {
        this.age = age;
    }

    /**
     * Renvoie l'âge actuel de la Fleur.
     *
     * @return l'âge actuel de la Fleur
     */
    public int getAge() {
        return age;
    }

    /**
     * Modifie la durée de vie de la Fleur en lui attribuant une nouvelle valeur.
     *
     * @param dureeVie la nouvelle valeur de la durée de vie de la Fleur
     */
    public void setDureeVie(String dureeVie) {
        this.dureeVie = dureeVie;
    }

    /**
     * Renvoie la durée de vie actuelle de la Fleur.
     *
     * @return la durée de vie actuelle de la Fleur
     */
    public String getDureeVie() {
        return dureeVie;
    }

    /**
     * Fait mourir la Fleur en changeant sa variable vivant en false.
     */
    public void faner(){
        this.vivant = false;
    }

    /**
     * Vérifie si l'objet est vivant ou non.
     *
     * @return true si l'objet est vivant, false sinon
     */
    public boolean estVivant(){
        return vivant;
    }


    /**
     *Permet d'afficher les caractéristiques de la Fleur
     */
    @Override
    public void showProduct() {
        System.out.println(nom+" : coûte "+prix+" euro\n"+"Elle est de couleur "+couleur+", elle a " + age + " ans, mesure "+ taille + " cm et peut durer "+dureeVie+" en bouquet.\n");
    }
}
