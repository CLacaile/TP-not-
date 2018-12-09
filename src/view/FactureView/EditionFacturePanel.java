package view.FactureView;

import javax.swing.*;
import java.awt.*;

public class EditionFacturePanel extends JPanel {
    private JTable clientFactureTable;
    private Object[] clientTableHeader= {"ID", "Nom", "Prénom", "Adresse", "Ville", "Réduction"};
    private JTable produitsFactureTable;
    private Object[] produitsFactureTableHeader= {"ID", "Nom", "Catégorie", "Espèce", "Prix unitaire", "Quantité"};
    private JButton ajouterProduitButton;
    private JButton enregistrerFactureButton;
    private JLabel prixHTTitleLabel;
    private JLabel prixHTLabel;
    private JLabel tauxTVATitleLabel;
    private JLabel tauxTVALabel;
    private JLabel montantTotalTitleLabel;
    private JLabel montantTotalLabel;

    private FactureGroupBox factBox;
    private ClientGroupBox clientBox;

    public EditionFacturePanel(){
        // Layout
        this.setLayout(new GridBagLayout());
        // Contraintes
        GridBagConstraints gc = new GridBagConstraints();
        gc.insets = new Insets(2,2,2,2);
        gc.weightx = 5;
        gc.weighty = 14;

        //gc.anchor = GridBagConstraints.PAGE_START;
        // Client Box
        clientBox = new ClientGroupBox();
        gc.gridx = 0;
        gc.gridy = 0;
        gc.gridwidth = 5;
        gc.gridheight = 1;
        gc.fill = GridBagConstraints.BOTH;
        this.add(clientBox, gc);


        // Edit Facture Box
        factBox = new FactureGroupBox();
        gc.gridx = 0;
        gc.gridy = 7;
        gc.gridwidth = 5;
        gc.gridheight = 1;
        gc.fill = GridBagConstraints.BOTH;
        this.add(factBox, gc);

        gc.anchor = GridBagConstraints.PAGE_END;
        // Enregistrer button
        this.enregistrerFactureButton = new JButton("Enregistrer");
        gc.gridx = 0;
        gc.gridy = 14;
        gc.gridheight = 5;
        gc.gridwidth = 14;
        gc.fill = GridBagConstraints.BOTH;
        this.add(enregistrerFactureButton, gc);
    }

    public ClientGroupBox getClientGroupBox() {
        return this.clientBox;
    }
}
