package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ClientView extends JPanel {
    private JTable clientTable;
    private Object[] tableHeader = {"ID", "Nom", "Prénom", "Adresse", "Ville", "Réduction"};
    private JButton creerClientButton;
    private JButton supprimerClientButton;

    public ClientView() {
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
        this.clientTable = new JTable(new DefaultTableModel(tableHeader, 0));
        this.clientTable.setFillsViewportHeight(true);
        this.clientTable.setEnabled(true);
        /// setting scroll
        JScrollPane scrollPane = new JScrollPane((clientTable));
        this.add(scrollPane, gc);

        // Bouton créer
        creerClientButton = new JButton("Créer client");
        gc.gridx = 0;
        gc.gridy = 5;
        gc.gridwidth = 1;
        gc.gridheight = 1;
        gc.fill = GridBagConstraints.BOTH;
        this.add(creerClientButton, gc);

        // Bouton supprimer
        supprimerClientButton = new JButton("Supprimer client");
        gc.gridx = 1;
        gc.gridy = 5;
        gc.gridwidth = 1;
        gc.gridheight = 1;
        gc.fill = GridBagConstraints.BOTH;
        this.add(supprimerClientButton, gc);
    }

    public void setClientTable(Object[][] clientTableData) {
        this.clientTable = new JTable(clientTableData, this.tableHeader);
        this.clientTable.setFillsViewportHeight(true);
    }

    public void addRow(Object[] row) {
        DefaultTableModel model = (DefaultTableModel) this.clientTable.getModel();
        model.addRow(row);
    }

    public int getSelectedRow() { return this.clientTable.getSelectedRow();}

    public void deleteRow(int index) {
        DefaultTableModel model = (DefaultTableModel) this.clientTable.getModel();
        model.removeRow(index);
    }

}
