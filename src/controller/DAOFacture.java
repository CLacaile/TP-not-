package controller;

import model.Facture;
import model.Produit;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAOFacture extends DAO<Facture> {
    @Override
    public Facture find(int id) {
        Facture facture = new Facture();
        DAOClient daoclient = new DAOClient();

        PreparedStatement pst;
        try {
            String sql = "SELECT * FROM facture WHERE idFacture = " +id;
            pst = connect.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            facture.setIdFact(rs.getInt(1));
            facture.setClientFact(daoclient.find(rs.getInt(2)));
            facture.setMontantFact(rs.getDouble(4));
            if (rs.first()) {
                DAOProduit daoprod = new DAOProduit();
                ArrayList<Produit> listProduit = new ArrayList<Produit>();
                rs.beforeFirst();
                while(rs.next()) {
                    listProduit.add(daoprod.find(rs.getInt(3)));
                }
                rs.first();
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
}
