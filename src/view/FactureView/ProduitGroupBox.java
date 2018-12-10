package view.FactureView;

import javax.swing.*;
import java.awt.*;

public class ProduitGroupBox extends JPanel {
    JLabel nomPLabel, catPLabel, qtePLabel;
    JTextField qtePText;
    JComboBox nomPListe, catPListe;
    JButton selectButton;

    public ProduitGroupBox() {
        // Layout
        this.setLayout(new GridBagLayout());
        this.setBorder(BorderFactory.createTitledBorder("Sélection des produits"));
        // Contraintes
        GridBagConstraints gc = new GridBagConstraints();

        gc.insets = new Insets(2,2,2,2);
        gc.weightx = 0;
        gc.weighty = 6;

        gc.anchor = GridBagConstraints.CENTER;

        // JLabel catégorie
        this.catPLabel = new JLabel("Catégorie: ");
        gc.gridx = 0;
        gc.gridy = 0;
        gc.gridwidth = 1;
        gc.gridheight = 1;
        gc.fill = GridBagConstraints.BOTH;
        this.add(catPLabel, gc);

        // JLabel nom
        this.nomPLabel = new JLabel("Nom: ");
        gc.gridx = 2;
        gc.gridy = 0;
        gc.gridwidth = 1;
        gc.gridheight = 1;
        gc.fill = GridBagConstraints.BOTH;
        this.add(nomPLabel, gc);

        // JLabel quantité
        this.qtePLabel = new JLabel("Quantité: ");
        gc.gridx = 4;
        gc.gridy = 0;
        gc.gridwidth = 1;
        gc.gridheight = 1;
        gc.fill = GridBagConstraints.BOTH;
        this.add(qtePLabel, gc);

        // Jcombo nom
        Object[] nom = {"Nom"};
        this.nomPListe = new JComboBox(nom);
        gc.gridx = 3;
        gc.gridy = 0;
        gc.gridwidth = 1;
        gc.gridheight = 1;
        gc.fill = GridBagConstraints.BOTH;
        this.add(nomPListe, gc);

        // Jcombo catégorie
        Object[] cat = {"Catégorie"};
        this.catPListe = new JComboBox(cat);
        gc.gridx = 1;
        gc.gridy = 0;
        gc.gridwidth = 1;
        gc.gridheight = 1;
        gc.fill = GridBagConstraints.BOTH;
        this.add(catPListe, gc);

        // JText quantité
        this.qtePText = new JTextField(4);
        gc.gridx = 5;
        gc.gridy = 0;
        gc.gridwidth = 1;
        gc.gridheight = 1;
        gc.fill = GridBagConstraints.HORIZONTAL;
        this.add(qtePText, gc);

        // Select bouton
        selectButton = new JButton("Ajouter");
        gc.gridx = 6;
        gc.gridy = 0;
        gc.gridwidth = 1;
        gc.gridheight = 1;
        gc.fill = GridBagConstraints.HORIZONTAL;
        this.add(selectButton, gc);
    }

    public void addNomPComboBox(Object row){
        this.nomPListe.addItem(row);
    }
    public void addCatPComboBox(Object row){
        this.catPListe.addItem(row);
    }

    public void clearNomPComboBox() {
        int count = this.nomPListe.getItemCount();
        for(int i=0; i<count; i++) {
            this.nomPListe.removeItemAt(i);
        }
    }
    public void clearCatPComboBox() {
        int count = this.catPListe.getItemCount();
        for(int i=0; i<count; i++) {
            this.catPListe.removeItemAt(i);
        }
    }

}
