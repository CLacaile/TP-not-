package view.FactureView;

import view.ClientView;

import javax.swing.*;
import java.awt.*;

public class ClientGroupBox extends JPanel {
    JLabel nomCLabel, prenomCLabel;
    JComboBox nomCListe, prenomCListe;
    JButton selectButton;

    public ClientGroupBox() {
        // Layout
        this.setLayout(new GridBagLayout());
        this.setBorder(BorderFactory.createTitledBorder("Sélection du client"));
        // Contraintes
        GridBagConstraints gc = new GridBagConstraints();

        gc.insets = new Insets(2,2,2,2);
        gc.weightx = 0;
        gc.weighty = 5;

        gc.anchor = GridBagConstraints.CENTER;

        // JLabel nom
        this.nomCLabel = new JLabel("Nom: ");
        gc.gridx = 0;
        gc.gridy = 0;
        gc.gridwidth = 1;
        gc.gridheight = 1;
        gc.fill = GridBagConstraints.BOTH;
        this.add(nomCLabel, gc);

        // JLabel prénom
        this.prenomCLabel = new JLabel("Prénom: ");
        gc.gridx = 2;
        gc.gridy = 0;
        gc.gridwidth = 1;
        gc.gridheight = 1;
        gc.fill = GridBagConstraints.BOTH;
        this.add(prenomCLabel, gc);


        // Jcombo nom
        Object[] nom = {"Nom"};
        this.nomCListe = new JComboBox(nom);
        gc.gridx = 1;
        gc.gridy = 0;
        gc.gridwidth = 1;
        gc.gridheight = 1;
        gc.fill = GridBagConstraints.BOTH;
        this.add(nomCListe, gc);

        // Jcombo prennom
        Object[] prenom = {"Prénom"};
        this.prenomCListe = new JComboBox(prenom);
        gc.gridx = 3;
        gc.gridy = 0;
        gc.gridwidth = 1;
        gc.gridheight = 1;
        gc.fill = GridBagConstraints.BOTH;
        this.add(prenomCListe, gc);

        // Select bouton
        selectButton = new JButton("Sélectionner");
        gc.gridx = 4;
        gc.gridy = 0;
        gc.gridwidth = 1;
        gc.gridheight = 1;
        gc.fill = GridBagConstraints.HORIZONTAL;
        this.add(selectButton, gc);
    }

    public void addNomCComboBox(Object row){
        this.nomCListe.addItem(row);
    }
    public void addPrenomCComboBox(Object row){
        this.prenomCListe.addItem(row);
    }

}
