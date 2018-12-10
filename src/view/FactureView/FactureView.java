package view.FactureView;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class FactureView extends JPanel {
    private JTable factTable;
    private Object[] tableHeader = {"N°", "Nom du client", "Prénom du client", "Montant"};
    private JButton supprimerFactButton;


    public FactureView() {
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
            this.factTable = new JTable(new DefaultTableModel(tableHeader, 0));
            this.factTable.setFillsViewportHeight(true);
            this.factTable.setEnabled(true);
            /// setting scroll
            JScrollPane scrollPane = new JScrollPane((factTable));
            this.add(scrollPane, gc);

            // Bouton supprimer
            supprimerFactButton = new JButton("Supprimer facture");
            gc.gridx = 0;
            gc.gridy = 5;
            gc.gridwidth = 1;
            gc.gridheight = 1;
            //gc.fill = GridBagConstraints.BOTH;
            this.add(supprimerFactButton, gc);
        }

        public void setProdTable(Object[][] prodTableData) {
            this.factTable = new JTable(prodTableData, this.tableHeader);
            this.factTable.setFillsViewportHeight(true);
        }

        public void addRow(Object[] row) {
            DefaultTableModel model = (DefaultTableModel) this.factTable.getModel();
            model.addRow(row);
        }

        public int getSelectedRow() { return this.factTable.getSelectedRow();}

        public void deleteRow(int index) {
            DefaultTableModel model = (DefaultTableModel) this.factTable.getModel();
            model.removeRow(index);
        }

        public void clearTable() {
            int tableSize = this.factTable.getRowCount();
            for(int i=0; i<tableSize; i++) {
                deleteRow(i);
            }
        }

    }