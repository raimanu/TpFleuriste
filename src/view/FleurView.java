package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableRowSorter;
import javax.swing.table.TableModel;

public class FleurView extends JPanel
{
    private static JButton ajouterProduit, supprimerProduit, modifierProduit, alerte,filter, clearFilter;
    private static JTable table;

    public FleurView()
    {
        //Creation du panel principale
        this.setLayout(new BorderLayout(0, 0));

        //Creation panel de gauche pour mettre les boutons
        JPanel panel = new JPanel();
        this.add(panel, BorderLayout.WEST);

        //Creation boite verticale pour inserer les composants du panel de gauche
        Box verticalBox = Box.createVerticalBox();
        panel.add(verticalBox);

        //Creation bouton ajouter
        ajouterProduit = new JButton ("Ajouter",new ImageIcon("images"+File.separator+"add.png"));
        verticalBox.add(ajouterProduit);

        //Creation bouton supprimer
        supprimerProduit = new JButton ("Supprimer",new ImageIcon("images"+File.separator+"delete.png"));
        verticalBox.add(supprimerProduit);

        //Creation bouton modifier
        modifierProduit = new JButton ("Modifier",new ImageIcon("images"+File.separator+"modifier.png"));
        verticalBox.add(modifierProduit);

        //Creation bouton alerte
        alerte = new JButton ("Alerte",new ImageIcon("images"+File.separator+"add.png"));
        verticalBox.add(alerte);

        //Creation bouton filtre
        filter = new JButton ("filtre",new ImageIcon("images"+File.separator+"filtre.png"));
        verticalBox.add(filter);

        //Creation bouton clearFilter
        clearFilter = new JButton ("Enlever Filtre",new ImageIcon("images"+File.separator+"clear.png"));
        verticalBox.add(clearFilter);

        JPanel depPanel = new JPanel();
        depPanel.setLayout(new BorderLayout(0, 0));
        this.add(depPanel);
    }

    ////////////////////ACTION LISTENER///////////////////////////////
    public static void ajouterProduitListener(ActionListener listenAjouterProduit)
    {
        ajouterProduit.addActionListener(listenAjouterProduit);
    }

    public static void supprimerProduitListener(ActionListener listenSupprimerProduit)
    {
        supprimerProduit.addActionListener(listenSupprimerProduit);
    }

    public static void modifierProduitListener(ActionListener listenModifierProduit)
    {
        modifierProduit.addActionListener(listenModifierProduit);
    }
    public static void alerteListener(ActionListener listenAlerte)
    {
        alerte.addActionListener(listenAlerte);
    }
    public static void filterListener(ActionListener listenFilter)
    {
        filter.addActionListener(listenFilter);
    }
    public static void clearFilterListener(ActionListener listenClearFilter)
    {
        clearFilter.addActionListener(listenClearFilter);
    }
}