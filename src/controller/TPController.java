package controller;

import model.Client;
import model.Facture;
import model.Produit;
import model.TPModel;
import view.TPView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.ArrayList;

public class TPController {
    private TPModel model;
    private TPView view;
    private DAOClient DAOclient = new DAOClient();
    private DAOProduit DAOproduit = new DAOProduit();
    private DAOFacture DAOfacture = new DAOFacture();


    public TPController(TPModel m, TPView v) {
        this.model = m;
        this.view = v;

        // Récupération des données des clients au lancement de l'app
        this.model.setClients(DAOclient.findAll());
        displayClientsDataFromModel();

        // Récupération des données produits au lancement de l'app
        this.model.setProduits(DAOproduit.findAll());
        displayProduitsDataFromModel();

        // Récupération des données factures au lancement de l'app
        this.model.setFactures(DAOfacture.findAll());
        displayFacturesDataFromModel();

        //
        this.view.getClientPanel().addSupprimerClientListener(new SupprimerClientListener());
    }

    /**
     * Affiche les données des factures
     */
    private void displayFacturesDataFromModel() {
        int nbOfFactures = this.model.getFactures().size();
        for (int i=0; i<nbOfFactures; i++) {
            this.view.getFacturePanel().addRow(this.model.getFactures().get(i).getFacturesInfo());
        }
    }

    /**
     * Affiche les données des produits
     */
    private void displayProduitsDataFromModel() {
        int nbOfProduits = this.model.getProduits().size();
        for (int i=0; i<nbOfProduits; i++) {
            this.view.getProduitPanel().addRow(this.model.getProduits().get(i).getProduitInfo());
            this.view.getEditFactPanel().getProduitGroupBox().addCatPComboBox(this.model.getProduits().get(i).getCatPObject());
            this.view.getEditFactPanel().getProduitGroupBox().addNomPComboBox(this.model.getProduits().get(i).getNomPObject());
        }
    }

    /**
     * Afficher les données client
     */
    public void displayClientsDataFromModel() {
        int nbOfClients = this.model.getClients().size();
        for (int i=0; i<nbOfClients; i++) {
            this.view.getClientPanel().addRow(this.model.getClients().get(i).getClientInfo());
            this.view.getEditFactPanel().getClientGroupBox().addNomCComboBox(this.model.getClients().get(i).getNomCObject());
            this.view.getEditFactPanel().getClientGroupBox().addPrenomCComboBox(this.model.getClients().get(i).getPrenomCObject());
        }
    }


    private class SupprimerClientListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Suppression client?");
            // Vérifier qu'un client est sélectionné
            if(view.getClientPanel().getSelectedRow() == -1) {
                view.displayErrorMessage("Sélectionner un client pour le supprimer !");
                return;
            }
            // Avertissement avant suppression
            if(view.displayWarningMessage("Voulez-vous vraiment supprimer ce client ?") != JOptionPane.OK_OPTION) {
                return;
            }
            // Suppression Base de Données
            int selectRowIndex = view.getClientPanel().getSelectedRow();
            int selectClientID = Integer.parseInt((String) view.getClientPanel().getClientTable().getValueAt(selectRowIndex, 0));
            Client clientASupp = model.getClients().get(selectClientID-1);
            DAOclient.delete(clientASupp);
            // Mises à jour des vues
            ///supp client
            view.getClientPanel().clearTable();
            ///supp combobox "editer facture"
            view.getEditFactPanel().getProduitGroupBox().clearCatPComboBox();
            view.getEditFactPanel().getProduitGroupBox().clearNomPComboBox();
            ///ajout données
            displayClientsDataFromModel();
            ///factures
            view.getFacturePanel().clearTable();
            displayFacturesDataFromModel();
            ///editer facture
            view.getEditFactPanel().getProduitGroupBox().clearCatPComboBox();
            view.getEditFactPanel().getProduitGroupBox().clearNomPComboBox();
        }
    }
}
