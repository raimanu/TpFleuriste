public abstract class EtatCommande {
    public Commande commande;

    public EtatCommande(Commande commande) {
        this.commande = commande;
    }

    public abstract void ajouteProduit(Fleur produit);

    public abstract void retireProduit(Fleur produit);

    public abstract void efface();

    public abstract EtatCommande etatSuivant();

}
