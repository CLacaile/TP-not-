package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ClientView extends JPanel {
    private JTable clientTable;
    private Object[] tableHeader = {"ID", "Nom", "Prénom", "Adresse", "Ville", "Réduction"};

    public ClientView() {
        // Layout
        setLayout(new GridBagLayout());
        // Contraintes
        GridBagConstraints gc = new GridBagConstraints();
        gc.anchor = GridBagConstraints.WEST;
        gc.insets = new Insets(2,2,2,2);
        gc.weightx = 3;
        gc.weighty = 6;

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
