package view.FactureView;

import javax.swing.*;
import java.awt.*;

public class EditionFactureView extends JPanel {
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

    public EditionFactureView() {
        // Layout
        setLayout(new GridBagLayout());
        // Contraintes
        GridBagConstraints gc = new GridBagConstraints();
        gc.insets = new Insets(2,2,2,2);
        gc.weightx = 5;
        gc.weighty = 14;

        gc.anchor = GridBagConstraints.NORTH;
        // Client Box
        clientBox = new ClientGroupBox();
        gc.gridx = 0;
        gc.gridy = 0;
        gc.gridwidth = 5;
        gc.gridheight = 8;
        gc.fill = GridBagConstraints.HORIZONTAL;
        this.add(clientBox, gc);

        gc.anchor = GridBagConstraints.SOUTH;
        // Edit Facture Box
        factBox = new FactureGroupBox();
        gc.gridx = 0;
        gc.gridy = 0;
        gc.gridwidth = 1;
        gc.gridheight = 1;
        gc.fill = GridBagConstraints.HORIZONTAL;
        this.add(factBox, gc);
    }
}
