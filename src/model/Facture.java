package model;

import java.util.ArrayList;

/**
 * Permet d'émettre une facture
 */
public class Facture {
    private int idFact;
    private Client clientFact;
    private ArrayList<Produit> produitsFact;
    private ArrayList<Integer> qteProdFact;
    private double montantFact;

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

    public double getMontantFact() {
        return montantFact;
    }

    public void setMontantFact(double montantFact) {
        this.montantFact = montantFact;
    }

    public ArrayList<Integer> getQteProdFact() {
        return qteProdFact;
    }

    public void setQteProdFact(ArrayList<Integer> qteProd) {
        this.qteProdFact = qteProd;
    }

}
