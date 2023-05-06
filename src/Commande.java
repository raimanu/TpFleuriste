import java.util.*;
public class Commande {
    public static final String color_reset = "\u001B[0m";
    public static final String color_yellow = "\u001B[33m";
    public static final String color_red = "\u001B[41m";
    public EtatCommande etatCommande;

    public List<Fleur> fleurs = new ArrayList<Fleur>();

    public Commande() {
        etatCommande = new CommandeEnCours(this);
    }

    public void ajouteProduit(Fleur produit) {
        if(produit instanceof FleurVivante){
            if(!((FleurVivante) produit).estVivant()){
                System.out.println(color_red+"La fleur " + produit.nom + " est morte, elle ne peut pas être vendu.\n"+color_reset);
                return;
            }
        }
        etatCommande.ajouteProduit(produit);
    }

    public void retireProduit(Fleur produit) {
        etatCommande.retireProduit(produit);
    }

    public void efface() {
        etatCommande.efface();
    }

    public void etatSuivant() {
        etatCommande = etatCommande.etatSuivant();
    }

    public List<Fleur> getProduits() {
        return fleurs;
    }

    public void showProducts() {
        System.out.println(color_yellow + "Voici ce que contient la commande : \n");
        System.out.println("---------------------------------------------------------------" + color_reset);
        for (Fleur produit: fleurs){
            produit.showProduct();
            System.out.println(color_yellow + "---------------------------------------------------------------" + color_reset);
        }
        System.out.print("\n");
    }
}