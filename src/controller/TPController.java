package controller;

import model.Client;
import model.Produit;
import model.TPModel;
import view.TPView;

import java.util.ArrayList;

public class TPController {
    private TPModel model;
    private TPView view;
    private DAOClient DAOclient = new DAOClient();
    private DAOProduit DAOproduit = new DAOProduit();


    public TPController(TPModel m, TPView v) {
        this.model = m;
        this.view = v;

        // Récupération des données des clients au lancement de l'app
        ArrayList<Client> clients = new ArrayList<Client>();
        int nbOfClients = this.DAOclient.getNbOfClients();
        for(int i=0; i<nbOfClients; i++) {
            clients.add(this.DAOclient.find(i+1));
        }
        this.model.setClients(clients);
        displayClientsDataFromModel();

        // Récupération des données produits au lancement de l'app
        ArrayList<Produit> produits = new ArrayList<Produit>();
        int nbOfProduits = this.DAOproduit.getNbOfProduits();
        for(int i=0; i<nbOfProduits; i++) {
            produits.add(this.DAOproduit.find(i+1));
        }
        this.model.setProduits(produits);
        displayProduitsDataFromModel();
    }

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
}
