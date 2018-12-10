package controller;

import model.Produit;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAOProduit extends DAO<Produit> {
    public int getNbOfProduits() {
        int count = 0;
        PreparedStatement pst;
        try {
            String sql = "SELECT COUNT(*) FROM produit";
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
    public Produit find(int id) {
        Produit produit = new Produit();
        PreparedStatement pst;
        try {
            String sql = "SELECT * FROM produit WHERE idP = " +id;
            pst = connect.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if(rs.next()) {
                produit.setIdP(rs.getInt(1));
                produit.setNomP(rs.getString(2));
                produit.setCatP(rs.getString(3));
                produit.setEspeceP(rs.getString(4));
                produit.setPrixP(rs.getDouble(5));
                produit.setQteP(rs.getInt(6));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return produit;
    }

    @Override
    public ArrayList<Produit> findAll() {
        ArrayList<Produit> produits = new ArrayList<>();
        ArrayList<Integer> indexList = new ArrayList<>();
        try {
            // Récupérer la liste des index (non distincts)
            String sql = "SELECT idP FROM produit";
            PreparedStatement pst = connect.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
                indexList.add(rs.getInt(1));
            }
            // Création produits
            for(int i=0; i<indexList.size(); i++) {
                Produit produit = find(indexList.get(i));
                if(!produits.contains(produit))
                    produits.add(produit);
            }
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
        return produits;
    }

    @Override
    public Produit create(Produit obj) {
        return null;
    }

    @Override
    public Produit update(Produit obj) {
        return null;
    }

    @Override
    public void delete(Produit obj) {
    }

}
