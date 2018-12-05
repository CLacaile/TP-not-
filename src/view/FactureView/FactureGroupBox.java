package view.FactureView;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class FactureGroupBox extends JPanel {
    private JTable produitsAjoutesTable;
    private Object[] produitsAjoutesTableHeader = {"ID", "Nom", "Catégorie", "Espèce", "Prix unitaire", "Quantité", "Prix total"};
    private JLabel clientIDTitleLabel;
    private JLabel clientIDLabel;
    private JLabel prenomClientTitleLabel = new JLabel("Prénom: ");
    private JLabel prenomClientLabel;
    private JLabel nomClientTitleLabel = new JLabel("Nom: ");
    private JLabel nomClientLabel;
    private JLabel adresseClientTitleLabel = new JLabel("Adresse: ");
    private JLabel adresseClientLabel;
    private JLabel villeClientTitleLabel = new JLabel("Ville: ");
    private JLabel villeClientLabel;
    private JLabel montantHTTitleLabel = new JLabel("Montant HT: ");
    private JLabel montantHTLabel;
    private JLabel tauxTVATitleLabel = new JLabel("Taux TVA: ");
    private JLabel tauxTVALabel;
    private JLabel reductionTitleLabel = new JLabel("Réduction: ");
    private JLabel reductionLabel;
    private JLabel montantTotalTitleLabel = new JLabel("Montant total: ");
    private JLabel montantTotalLabel;

    public FactureGroupBox() {
        // Layout
        this.setLayout(new GridBagLayout());
        this.setBorder(BorderFactory.createTitledBorder("Facture"));
        // Contraintes
        GridBagConstraints gc = setGBConstraints(5, 14);

        // Client Info Titles
        ///client title label
        this.clientIDTitleLabel = new JLabel("N° client: ");
        gc.gridx = 0;
        gc.gridy = 0;
        gc.gridwidth = 1;
        gc.gridheight = 1;
        gc.fill = GridBagConstraints.HORIZONTAL;
        this.add(clientIDTitleLabel, gc);
        ///client prénom title label
        this.prenomClientTitleLabel = new JLabel("Prénom: ");
        gc.gridx = 0;
        gc.gridy = 1;
        gc.gridwidth = 1;
        gc.gridheight = 1;
        gc.fill = GridBagConstraints.HORIZONTAL;
        this.add(prenomClientTitleLabel, gc);
        ///client nom title label
        this.nomClientTitleLabel = new JLabel("Nom: ");
        gc.gridx = 0;
        gc.gridy = 2;
        gc.gridwidth = 1;
        gc.gridheight = 1;
        gc.fill = GridBagConstraints.HORIZONTAL;
        this.add(nomClientTitleLabel, gc);
        ///client adresse title label
        this.adresseClientTitleLabel = new JLabel("Adresse: ");
        gc.gridx = 0;
        gc.gridy = 3;
        gc.gridwidth = 1;
        gc.gridheight = 1;
        gc.fill = GridBagConstraints.HORIZONTAL;
        this.add(adresseClientTitleLabel, gc);
        ///client ville title label
        this.villeClientTitleLabel = new JLabel("Ville: ");
        gc.gridx = 0;
        gc.gridy = 4;
        gc.gridwidth = 1;
        gc.gridheight = 1;
        gc.fill = GridBagConstraints.HORIZONTAL;
        this.add(villeClientTitleLabel, gc);
        ///client reduction title label
        this.reductionTitleLabel = new JLabel("Réduction: ");
        gc.gridx = 0;
        gc.gridy = 5;
        gc.gridwidth = 1;
        gc.gridheight = 1;
        gc.fill = GridBagConstraints.HORIZONTAL;
        this.add(reductionTitleLabel, gc);

        // Client Info Text
        ///client ID text
        this.clientIDLabel = new JLabel("");
        gc.gridx = 1;
        gc.gridy = 0;
        gc.gridwidth = 1;
        gc.gridheight = 1;
        gc.fill = GridBagConstraints.HORIZONTAL;
        this.add(clientIDLabel, gc);
        ///client prénom text
        this.prenomClientLabel = new JLabel("");
        gc.gridx = 1;
        gc.gridy = 1;
        gc.gridwidth = 1;
        gc.gridheight = 1;
        gc.fill = GridBagConstraints.HORIZONTAL;
        this.add(prenomClientLabel, gc);
        ///client nom title label
        this.nomClientLabel = new JLabel("");
        gc.gridx = 1;
        gc.gridy = 2;
        gc.gridwidth = 1;
        gc.gridheight = 1;
        gc.fill = GridBagConstraints.HORIZONTAL;
        this.add(nomClientLabel, gc);
        ///client adresse title label
        this.adresseClientLabel = new JLabel("");
        gc.gridx = 1;
        gc.gridy = 3;
        gc.gridwidth = 1;
        gc.gridheight = 1;
        gc.fill = GridBagConstraints.HORIZONTAL;
        this.add(adresseClientLabel, gc);
        ///client ville title label
        this.villeClientLabel = new JLabel("");
        gc.gridx = 1;
        gc.gridy = 4;
        gc.gridwidth = 1;
        gc.gridheight = 1;
        gc.fill = GridBagConstraints.HORIZONTAL;
        this.add(villeClientLabel, gc);
        ///client reduction title label
        this.reductionLabel = new JLabel("");
        gc.gridx = 1;
        gc.gridy = 5;
        gc.gridwidth = 1;
        gc.gridheight = 1;
        gc.fill = GridBagConstraints.HORIZONTAL;
        this.add(reductionLabel, gc);

        // Produit selectionnes Table
        ///setting coordinates
        gc.gridx = 0;
        gc.gridy = 6;
        gc.gridwidth = 5;
        gc.gridheight = 4;
        gc.fill = GridBagConstraints.BOTH;
        ///setting table
        this.produitsAjoutesTable = new JTable(new DefaultTableModel(produitsAjoutesTableHeader, 0));
        this.produitsAjoutesTable.setFillsViewportHeight(true);
        this.produitsAjoutesTable.setEnabled(true);
        ///setting scroll
        JScrollPane scrollPane = new JScrollPane(this.produitsAjoutesTable);
        this.add(scrollPane, gc);

        // Facture infos title
        gc.anchor = GridBagConstraints.EAST;
        /// Montant HT title
        this.montantHTTitleLabel = new JLabel("Montant HT: ");
        gc.gridx = 4;
        gc.gridy = 10;
        gc.gridwidth = 1;
        gc.gridheight = 1;
        gc.fill = GridBagConstraints.HORIZONTAL;
        this.add(montantHTTitleLabel, gc);
        ///TVA title label
        this.tauxTVATitleLabel = new JLabel("Taux TVA: ");
        gc.gridx = 4;
        gc.gridy = 11;
        gc.gridwidth = 1;
        gc.gridheight = 1;
        gc.fill = GridBagConstraints.HORIZONTAL;
        this.add(tauxTVATitleLabel, gc);
        ///Reduction title label
        this.reductionTitleLabel = new JLabel("Réduction: ");
        gc.gridx = 4;
        gc.gridy = 12;
        gc.gridwidth = 1;
        gc.gridheight = 1;
        gc.fill = GridBagConstraints.HORIZONTAL;
        this.add(reductionTitleLabel, gc);
        ///client adresse title label
        this.montantTotalTitleLabel= new JLabel("Total: ");
        gc.gridx = 4;
        gc.gridy = 13;
        gc.gridwidth = 1;
        gc.gridheight = 1;
        gc.fill = GridBagConstraints.HORIZONTAL;
        this.add(montantTotalTitleLabel, gc);


        // Facture texts
        /// Montant HT text
        this.montantHTLabel = new JLabel("");
        gc.gridx = 5;
        gc.gridy = 10;
        gc.gridwidth = 1;
        gc.gridheight = 1;
        gc.fill = GridBagConstraints.HORIZONTAL;
        this.add(montantHTLabel, gc);
        ///TVA text
        this.tauxTVALabel = new JLabel("");
        gc.gridx = 5;
        gc.gridy = 11;
        gc.gridwidth = 1;
        gc.gridheight = 1;
        gc.fill = GridBagConstraints.HORIZONTAL;
        this.add(tauxTVALabel, gc);
        ///Reduction text
        this.reductionLabel = new JLabel("");
        gc.gridx = 5;
        gc.gridy = 12;
        gc.gridwidth = 1;
        gc.gridheight = 1;
        gc.fill = GridBagConstraints.HORIZONTAL;
        this.add(reductionLabel, gc);
        ///client adresse title label
        this.montantTotalLabel = new JLabel("");
        gc.gridx = 5;
        gc.gridy = 13;
        gc.gridwidth = 1;
        gc.gridheight = 1;
        gc.fill = GridBagConstraints.HORIZONTAL;
        this.add(montantTotalLabel, gc);
    }

    public GridBagConstraints setGBConstraints(int weightx, int weighty) {
        GridBagConstraints gdbc = new GridBagConstraints();
        gdbc.anchor = GridBagConstraints.WEST;
        gdbc.insets = new Insets(2,2,2,2);
        gdbc.weightx = weightx;
        gdbc.weighty = weighty;
        return gdbc;
    }
    public void setClientIDLabel(String clientID) {
        this.clientIDLabel.setText(clientID);
    }

    public void setPrenomClientLabel(String prenomC) {
        this.prenomClientLabel.setText(prenomC);
    }

    public void setNomClientLabel(String nomC) {
        this.prenomClientLabel.setText(nomC);
    }

    public void setAdresseClientLabel(String adresseC) {
        this.adresseClientLabel.setText(adresseC);
    }

    public void setVilleClientLabel(String villeC) {
        this.villeClientLabel.setText(villeC);
    }

    public void setReductionLabel(String reduction) {
        this.villeClientLabel.setText(reduction);
    }

    public void addRow(Object[] row) {
        DefaultTableModel model = (DefaultTableModel) this.produitsAjoutesTable.getModel();
        model.addRow(row);
    }

    public int getSelectedRow() { return this.produitsAjoutesTable.getSelectedRow();}

    public void deleteRow(int index) {
        DefaultTableModel model = (DefaultTableModel) this.produitsAjoutesTable.getModel();
        model.removeRow(index);
    }
}
