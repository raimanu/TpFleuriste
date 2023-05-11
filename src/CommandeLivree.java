/**
 * La classe de l'état de la commande livrée
 */
public class CommandeLivree extends EtatCommande {

    /**
     * Constructeur de la classe CommandeLivree
     *
     * @param commande Une instance de la classe commande
     */
    public CommandeLivree(Commande commande) {
        super(commande);
    }

    /**
     * N'ajoute rien car la commande est validée
     *
     * @param produit Une instance de la classe Fleur
     */
    public void ajouteProduit(Fleur produit){}

    /**
     * Ne retire rien car la commande est validée
     *
     * @param produit Une instance de la classe Fleur
     */
    public void retireProduit(Fleur produit){}

    /**
     * N'efface rien car la commande est livrée
     */
    public void efface(){}

    /**
     * Ne fait rien car il n'y a pas de prochaine état
     *
     * @return L'état de la commande actuelle
     */
    public EtatCommande etatSuivant()
    {
        return this;
    }
}