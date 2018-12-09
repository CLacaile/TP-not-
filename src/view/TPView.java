package view;

import view.FactureView.EditionFacturePanel;
import view.FactureView.FactureView;

import javax.swing.*;

public class TPView extends JFrame {
    private ClientView clientPanel;
    private ProduitView produitPanel;
    private FactureView facturePanel;
    private EditionFacturePanel editFactPanel;

    public TPView() {
        JTabbedPane tabbedPane = new JTabbedPane();

        // Onglet "Clients"
        this.clientPanel = new ClientView();
        tabbedPane.addTab("Clients", null, clientPanel, "Voir et gérer les clients");

        // Onglet "Produits"
        this.produitPanel = new ProduitView();
        tabbedPane.addTab("Produits", null, produitPanel, "Voir et gérer les produits");

        // Onglet "Factures"
        this.facturePanel = new FactureView();
        tabbedPane.addTab("Factures", null, facturePanel, "Voir et gérer les factures");

        // Onglets "Editer Facture"
        this.editFactPanel = new EditionFacturePanel();
        tabbedPane.addTab("Editer une facture", null, editFactPanel, "Créer une nouvelle facture");

        // Général
        this.setTitle("Outil de gestion pour fleuriste");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.add(tabbedPane);
        this.setVisible(true);
    }

    public ClientView getClientPanel() { return this.clientPanel;}

    public ProduitView getProduitPanel() { return this.produitPanel;}

    public FactureView getFacturePanel() { return this.facturePanel;}

    public EditionFacturePanel getEditFactPanel() {
        return this.editFactPanel;
    }

}
