package model;

import java.util.ArrayList;

public class Facture {
    private int idFact;
    private Client clientFact;
    private ArrayList<Produit> produitsFact;
    private int montantFact;

    public int getIdFact() {
        return idFact;
    }

    public void setIdFact(int idFact) {
        this.idFact = idFact;
    }

    public Client getClientFact() {
        return clientFact;
    }

    public void setClientFact(Client clientFact) {
        this.clientFact = clientFact;
    }

    public ArrayList<Produit> getProduitsFact() {
        return produitsFact;
    }

    public void setProduitsFact(ArrayList<Produit> produitsFact) {
        this.produitsFact = produitsFact;
    }

    public int getMontantFact() {
        return montantFact;
    }

    public void setMontantFact(int montantFact) {
        this.montantFact = montantFact;
    }
}
