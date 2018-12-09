package model;

import java.util.ArrayList;

public class TPModel {
    private ArrayList<Client> clients = new ArrayList<Client>();
    private ArrayList<Produit> produits = new ArrayList<Produit>();
    private ArrayList<Facture> factures = new ArrayList<Facture>();

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public ArrayList<Produit> getProduits() {
        return produits;
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
