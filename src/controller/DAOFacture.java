package controller;

import model.Facture;
import model.Produit;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAOFacture extends DAO<Facture> {

    public int getNbOfFactures() {
        int count = 0;
        PreparedStatement pst;
        try {
            String sql = "SELECT COUNT(DISTINCT idFact) FROM facture";
            pst = connect.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                count = rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return count;
    }

    @Override
    public Facture find(int id) {
        Facture facture = new Facture();
        DAOClient daoclient = new DAOClient();

        PreparedStatement pst;
        try {
            String sql = "SELECT * FROM facture WHERE idFact = " +id;
            pst = connect.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if(rs.next()) {
                facture.setIdFact(rs.getInt(1));
                facture.setClientFact(daoclient.find(rs.getInt(2)));
                facture.setMontantFact(rs.getDouble(5));
            }
            if (rs.first()) {
                DAOProduit daoprod = new DAOProduit();
                ArrayList<Produit> listProduit = new ArrayList<Produit>();
                ArrayList<Integer> qteProduit = new ArrayList<Integer>();
                rs.beforeFirst();
                while(rs.next()) {
                    listProduit.add(daoprod.find(rs.getInt(3)));
                    qteProduit.add(rs.getInt(4));
                }
                rs.first();
                facture.setProduitsFact(listProduit);
                facture.setQteProdFact(qteProduit);
            }
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
        return facture;
    }

    @Override
    public Facture create(Facture obj) {
        return null;
    }

    @Override
    public Facture update(Facture obj) {
        return null;
    }

    @Override
    public Facture delete(Facture obj) {
        return null;
    }
}
