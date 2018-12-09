package model;

import java.util.ArrayList;

public class TPModel {
    private ArrayList<Client> clients = new ArrayList<Client>();
    private ArrayList<Produit> produits = new ArrayList<Produit>();

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


}
