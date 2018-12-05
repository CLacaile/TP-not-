package view;

import view.FactureView.EditionFactureView;
import view.FactureView.FactureView;

import javax.swing.*;

public class TPView extends JFrame {
    private ClientView clientPanel;
    private EditionFactureView editFactPanel;

    public TPView() {
        JTabbedPane tabbedPane = new JTabbedPane();

        // Onglet "Clients"
        this.clientPanel = new ClientView();
        tabbedPane.addTab("Clients", null, clientPanel, "Voir et gérer les clients");

        // Onglets "Facture"
        this.editFactPanel = new EditionFactureView();
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

}
