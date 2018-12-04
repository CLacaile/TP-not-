package controller;

import model.Fournisseur;
import model.Fourniture;
import model.Produit;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAOFourniture extends DAO<Fourniture> {
    @Override
    public Fourniture find(int id) {
        Fourniture fourniture = new Fourniture();
        DAOFournisseur daofourn = new DAOFournisseur();

        PreparedStatement pst;
        try {
            String sql = "SELECT * FROM fourniture WHERE idFourniture = " +id;
            pst = connect.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            fourniture.setIdFourn(rs.getInt(1));
            fourniture.setFournisseurFourn(daofourn.find(rs.getInt(2)));
            fourniture.setMontantFourn(rs.getDouble(4));
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
        return fourniture;
    }

    @Override
    public Fourniture create(Fourniture obj) {
        return null;
    }
}
