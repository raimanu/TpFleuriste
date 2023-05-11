/**
 * La classe de l'état de la commande validée
 */
public class CommandeValidee extends EtatCommande {

    /**
     * Constructeur de la classe CommandeValidee
     *
     * @param commande Une instance de la classe commande
     */
    public CommandeValidee(Commande commande) {
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
     * Efface tout les produits de la liste de la commande
     */
    public void efface() {
        commande.getProduits().clear();
    }

    /**
     * Passe l'état de la commande à son prochain état
     *
     * @return Le nouvelle état de la commande
     */
    public EtatCommande etatSuivant() {
        return new CommandeLivree(commande);
    }
}
