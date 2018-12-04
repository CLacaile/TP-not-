package controller;

import model.Produit;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOProduit extends DAO<Produit> {
    @Override
    public Produit find(int id) {
        Produit produit = new Produit();
        PreparedStatement pst;
        try {
            String sql = "SELECT * FROM produit WHERE idP = " +id;
            pst = connect.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            produit.setIdP(rs.getInt(1));
            produit.setNomP(rs.getString(2));
            produit.setEspeceP(rs.getString(3));
            produit.setPrixP(rs.getDouble(4));
            produit.setQteP(rs.getInt(5));
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return produit;
    }

    @Override
    public Produit create(Produit obj) {
        return null;
    }
}
