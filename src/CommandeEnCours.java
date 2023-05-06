public class CommandeEnCours extends EtatCommande {
    public CommandeEnCours(Commande commande) {
        super(commande);
    }

    public void ajouteProduit(Fleur produit) {
        commande.getProduits().add(produit);
    }

    public void retireProduit(Fleur produit) {
        commande.getProduits().remove(produit);
    }

    public void efface() {
        commande.getProduits().clear();
    }

    public EtatCommande etatSuivant() {
        return new CommandeValidee(commande);
    }
}