public class Gestion {
    public static void main(String[] args) {
        FleurVivanteFactory tulipeFactory = new FleurVivanteFactory();
        FleurVivante tulipe = tulipeFactory.creerFleurVivante("tulipe", "mauve", 100, 2,"2 semaine", 20);
        FleurVivante tulipe2 = tulipeFactory.creerFleurVivante("tulipe", "mauve", 100, 2,"2 semaine", 20);
        tulipe.showProduct();
        tulipe2.faner();
        tulipe.faner();
        tulipe.showProduct();
        FleurPlastique rose = new FleurPlastique("rose", "rouge", 50, 30, "Polystyrène");
        rose.showProduct();
    }
}
