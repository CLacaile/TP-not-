package view.FactureView;

import javax.swing.*;

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
}
