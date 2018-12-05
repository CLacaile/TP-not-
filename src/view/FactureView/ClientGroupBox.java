package view.FactureView;

import view.ClientView;

import javax.swing.*;
import java.awt.*;

public class ClientGroupBox extends JPanel {
    ClientView clientTable;
    JButton selectButton;

    public ClientGroupBox() {
        // Layout
        this.setLayout(new GridBagLayout());
        this.setBorder(BorderFactory.createTitledBorder("Client"));
        // Contraintes
        GridBagConstraints gc = new GridBagConstraints();
        gc.anchor = GridBagConstraints.WEST;
        gc.insets = new Insets(2,2,2,2);
        gc.weightx = 3;
        gc.weighty = 7;

        // Table
        clientTable = new ClientView();
        gc.gridx = 0;
        gc.gridy = 0;
        gc.gridwidth = 3;
        gc.gridheight = 5;
        gc.fill = GridBagConstraints.BOTH;
        JScrollPane clientScrollPane = new JScrollPane(clientTable);
        this.add(clientScrollPane);

        // Select bouton
        selectButton = new JButton("Sélectionner");
        gc.gridx = 0;
        gc.gridy = 6;
        gc.gridwidth = 1;
        gc.gridheight = 1;
        gc.fill = GridBagConstraints.BOTH;
        this.add(selectButton);
    }
}
