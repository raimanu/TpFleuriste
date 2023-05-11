/**
 * La classe de l'état de la commande en cours
 */
public class CommandeEnCours extends EtatCommande {
    /**
     * Constructeur de la classe CommandeEnCours
     *
     * @param commande Une instance de la classe commande
     */
    public CommandeEnCours(Commande commande) {
        super(commande);
    }

    /**
     * Ajoute un produit à la liste de la commande
     *
     * @param produit Une instance de la classe Fleur
     */
    public void ajouteProduit(Fleur produit) {
        commande.getProduits().add(produit);
    }

    /**
     * Retire un produit à la liste de la commande
     *
     * @param produit Une instance de la classe Fleur
     */
    public void retireProduit(Fleur produit) {
        commande.getProduits().remove(produit);
    }

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
        return new CommandeValidee(commande);
    }
}