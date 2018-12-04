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

}
