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

public class AccueilView extends JPanel{
    private static JTable table;

    public AccueilView() {

        //Creation du panel principale
        this.setLayout(new BorderLayout(0, 0));

        this.setBackground(new Color(79, 150, 155));

        //Creation panel de gauche pour mettre les boutons
        JPanel panel = new JPanel();
        this.add(panel, BorderLayout.WEST);

        //Creation boite verticale pour inserer les composants du panel de gauche
        Box verticalBox = Box.createVerticalBox();
        panel.add(verticalBox);
    }
}
