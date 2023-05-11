/**
 * La classe de l'état de la commande
 */
public abstract class EtatCommande {
    /**
     * La commande associée à cet état
     */
    public Commande commande;

    /**
     * Constructeur de la classe EtatCommande
     *
     * @param commande Une instance de la classe commande
     */
    public EtatCommande(Commande commande) {
        this.commande = commande;
    }

    /**
     * Ajoute un produit à la liste de la commande
     *
     * @param produit Une instance de la classe Fleur
     */
    public abstract void ajouteProduit(Fleur produit);

    /**
     * Retire un produit à la liste de la commande
     *
     * @param produit Une instance de la classe Fleur
     */
    public abstract void retireProduit(Fleur produit);

    /**
     * Efface tout les produits de la liste de la commande
     */
    public abstract void efface();

    /**
     * Passe l'état de la commande à son prochain état
     *
     * @return Le nouvelle état de la commande
     */
    public abstract EtatCommande etatSuivant();

}
