package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ProduitView extends JPanel {
    private JTable prodTable;
    private Object[] tableHeader = {"ID", "Nom", "Catégorie", "Espèce", "Prix", "Stock"};
    private JButton creerProdButton;
    private JButton supprimerProdButton;


    public ProduitView() {
        // Layout
        setLayout(new GridBagLayout());
        // Contraintes
        GridBagConstraints gc = new GridBagConstraints();
        gc.anchor = GridBagConstraints.WEST;
        gc.insets = new Insets(2,2,2,2);
        gc.weightx = 3;
        gc.weighty = 5;

        // Table
        /// setting coordinates
        gc.gridx = 0;
        gc.gridy = 0;
        gc.gridwidth = 3;
        gc.gridheight = 4;
        gc.fill = GridBagConstraints.BOTH;
        /// setting table
        this.prodTable = new JTable(new DefaultTableModel(tableHeader, 0));
        this.prodTable.setFillsViewportHeight(true);
        this.prodTable.setEnabled(true);
        /// setting scroll
        JScrollPane scrollPane = new JScrollPane((prodTable));
        this.add(scrollPane, gc);

        // Bouton créer
        creerProdButton = new JButton("Créer produit");
        gc.gridx = 0;
        gc.gridy = 5;
        gc.gridwidth = 1;
        gc.gridheight = 1;
        gc.fill = GridBagConstraints.BOTH;
        this.add(creerProdButton, gc);

        // Bouton supprimer
        supprimerProdButton = new JButton("Supprimer produit");
        gc.gridx = 1;
        gc.gridy = 5;
        gc.gridwidth = 1;
        gc.gridheight = 1;
        gc.fill = GridBagConstraints.BOTH;
        this.add(supprimerProdButton, gc);
    }

    public void setProdTable(Object[][] prodTableData) {
        this.prodTable = new JTable(prodTableData, this.tableHeader);
        this.prodTable.setFillsViewportHeight(true);
    }

    public void addRow(Object[] row) {
        DefaultTableModel model = (DefaultTableModel) this.prodTable.getModel();
        model.addRow(row);
    }

    public int getSelectedRow() { return this.prodTable.getSelectedRow();}

    public void deleteRow(int index) {
        DefaultTableModel model = (DefaultTableModel) this.prodTable.getModel();
        model.removeRow(index);
    }

}