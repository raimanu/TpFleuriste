package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;

import java.awt.BorderLayout;
import java.awt.Color;

import java.io.File;

public class HomeView extends JFrame {
    private static JTabbedPane voletOnglet;
    private JPanel ongletAcceuil, ongletFleur, ongletCommande;

    public HomeView() {

        this.setTitle("Application de gestion de stock");

        //Couleur gris du content pane
        this.getContentPane().setBackground(new Color(79, 150, 155));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(new BorderLayout(0, 0));

        voletOnglet = new JTabbedPane(JTabbedPane.TOP);
        this.getContentPane().add(voletOnglet);

        //Couleur du volet d'onglet
        voletOnglet.setBackground(new Color(8, 130, 136));
        voletOnglet.setForeground(Color.BLACK);

        //Ajout de l'onglet Acceuil
        ongletCommande = new AccueilView();
        voletOnglet.addTab("Accueil",new ImageIcon("images"+File.separator+"commande.png"), ongletCommande, null);

        //Ajout de l'onglet Fleur, permettant de gérer les fleurs disponible
        ongletFleur = new FleurView();
        voletOnglet.addTab("Fleur",new ImageIcon("images"+ File.separator+"item.png"), ongletFleur, null);

        //Ajout de l'onglet Commande, permettant de gérer les commandes
        ongletCommande = new CommandeView();
        voletOnglet.addTab("Commande",new ImageIcon("images"+File.separator+"commande.png"), ongletCommande, null);

        //Centrer la fenetre
        this.setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);

    }
}
