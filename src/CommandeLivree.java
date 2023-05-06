public class CommandeLivree extends EtatCommande {

    public CommandeLivree(Commande commande) {
        super(commande);
    }

    public void ajouteProduit(Fleur produit){}

    public void retireProduit(Fleur produit){}

    public void efface(){}

    public EtatCommande etatSuivant()
    {
        return this;
    }
}