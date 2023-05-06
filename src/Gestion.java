public class Gestion {
    public static void main(String[] args) {
        FleurVivanteFactory tulipeFactory = new FleurVivanteFactory();
        FleurPlastiqueFactory fleurPlastiqueFactory = new FleurPlastiqueFactory();
        Commande commande = new Commande();
        FleurVivante tulipe = tulipeFactory.creerFleurVivante("tulipe", "mauve", 100, 2,"2 semaine", 20);
        FleurVivante tulipe2 = tulipeFactory.creerFleurVivante("tulipe", "mauve", 100, 2,"2 semaine", 20);
        FleurPlastique rose = fleurPlastiqueFactory.creerFleurPlastique("rose", "rouge", 10, 30, "polystyrène");
        FleurPlastique rose2 = fleurPlastiqueFactory.creerFleurPlastique("rose", "mauve", 10, 30, "polystyrène");
        tulipe.showProduct();
        tulipe.faner();
        tulipe.showProduct();
        rose.showProduct();
        commande.ajouteProduit(tulipe);
        commande.ajouteProduit(tulipe2);
        commande.ajouteProduit(rose);
        System.out.println("Ajout d'une fleur alors qu'elle est morte', et donc tulipe ne sera pas ajouté à la commande\n");
        commande.showProducts();
        commande.etatSuivant();
        commande.ajouteProduit(rose2);
        System.out.println("Ajout d'une fleur alors que la commande est validée, et donc rien ne changera\n");
        commande.showProducts();
        commande.etatSuivant();
        commande.efface();
        System.out.println("La commande est en état livrée, et donc la méthode efface ne fera rien\n");
        commande.showProducts();
    }
}
