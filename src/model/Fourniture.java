package model;

import java.util.ArrayList;

/**
 * Permet d'émettre un bon de commande d'une liste de produit auprès d'un fournisseur
 */
public class Fourniture {
    private int idFourn;
    private Fournisseur fournisseurFourn;
    private ArrayList<Produit> produitsFourn;
    private double montantFourn;

    public int getIdFourn() {
        return idFourn;
    }

    public void setIdFourn(int idFourn) {
        this.idFourn = idFourn;
    }

    public Fournisseur getFournisseurFourn() {
        return fournisseurFourn;
    }

    public void setFournisseurFourn(Fournisseur fournisseurFourn) {
        this.fournisseurFourn = fournisseurFourn;
    }

    public ArrayList<Produit> getProduitsFourn() {
        return produitsFourn;
    }

    public void setProduitsFourn(ArrayList<Produit> produitsFourn) {
        this.produitsFourn = produitsFourn;
    }

    public double getMontantFourn() {
        return montantFourn;
    }

    public void setMontantFourn(double montantFourn) {
        this.montantFourn = montantFourn;
    }
}
