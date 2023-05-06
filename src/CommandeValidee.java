public class CommandeValidee extends EtatCommande {
    public CommandeValidee(Commande commande) {
        super(commande);
    }

    public void ajouteProduit(Fleur produit){}

    public void retireProduit(Fleur produit){}

    public void efface() {
        commande.getProduits().clear();
    }

    public EtatCommande etatSuivant() {
        return new CommandeLivree(commande);
    }
}
