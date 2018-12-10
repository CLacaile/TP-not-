package model;

import java.util.ArrayList;

public class TPModel {
    private ArrayList<Client> clients = new ArrayList<Client>();
    private ArrayList<Produit> produits = new ArrayList<Produit>();
    private ArrayList<Facture> factures = new ArrayList<Facture>();

    public ArrayList<Client> getClients() {
        return clients;
    }

    public Client getClientById(int id) {
        int nbClients = this.clients.size();
        for(int i=0; i<nbClients; i++) {
            if(this.clients.get(i).getIdC() == id) {
                return this.clients.get(i);
            }
        }
        return null;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public ArrayList<Produit> getProduits() {
        return produits;
    }

    public Produit getProduitById(int id) {
        int nbProduits = this.produits.size();
        for(int i=0; i<nbProduits; i++) {
            if(this.produits.get(i).getIdP() == id) {
                return this.produits.get(i);
            }
        }
        return null;
    }

    public void setProduits(ArrayList<Produit> produits) {
        this.produits = produits;
    }

    public ArrayList<Facture> getFactures() {
        return factures;
    }

    public void setFactures(ArrayList<Facture> factures) {
        this.factures = factures;
    }
}
