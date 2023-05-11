import java.util.*;

/**
 * La classe Commande permet de créer et gérer une commande de fleurs.
 * Elle contient une liste de fleurs ainsi que l'état de la commande.
 */
public class Commande {
    /**
     * Constante pour réinitialiser la couleur du texte.
     */
    public static final String color_reset = "\u001B[0m";

    /**
     * Constante pour définir la couleur du texte en jaune.
     */
    public static final String color_yellow = "\u001B[33m";

    /**
     * Constante pour définir la couleur du texte en rouge.
     */
    public static final String color_red = "\u001B[41m";

    /**
     * État actuel de la commande.
     */
    public EtatCommande etatCommande;

    /**
     * Liste des produits de la commande.
     */
    public List<Fleur> fleurs = new ArrayList<Fleur>();

    /**
     * Constructeur de la classe Commande
     */
    public Commande() {
        etatCommande = new CommandeEnCours(this);
    }

    /**
     * Ajoute un produit à la liste de la commande
     *
     * @param produit Une instance de la classe Fleur
     */
    public void ajouteProduit(Fleur produit) {
        if(produit instanceof FleurVivante){
            if(!((FleurVivante) produit).estVivant()){
                System.out.println(color_red+"La fleur " + produit.nom + " est morte, elle ne peut pas être vendu.\n"+color_reset);
                return;
            }
        }
        etatCommande.ajouteProduit(produit);
    }

    /**
     * Retire un produit à la liste de la commande
     *
     * @param produit Une instance de la classe Fleur
     */
    public void retireProduit(Fleur produit) {
        etatCommande.retireProduit(produit);
    }

    /**
     * Efface tout les produits de la liste de la commande
     */
    public void efface() {
        etatCommande.efface();
    }

    /**
     * Passe l'état de la commande à son prochain état
     */
    public void etatSuivant() {
        etatCommande = etatCommande.etatSuivant();
    }

    /**
     *Renvoie tous les produits de la liste fleurs
     *
     * @return Tous les produits de la liste fleurs
     */
    public List<Fleur> getProduits() {
        return fleurs;
    }

    /**
     * Affiche ce que contient la liste de la commande
     */
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