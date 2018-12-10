package controller;

import model.Fournisseur;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAOFournisseur extends DAO<Fournisseur> {

    @Override
    public Fournisseur find(int id) {
        Fournisseur fournisseur = new Fournisseur();
        PreparedStatement pst;
        try {
            String sql = "SELECT * FROM fournisseur WHERE idF = " +id;
            pst = connect.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if(rs.next()) {
                fournisseur.setIdF(rs.getInt(1));
                fournisseur.setNomF(rs.getString(2));
                fournisseur.setPrenomF(rs.getString(3));
                fournisseur.setAdresseF(rs.getString(4));
                fournisseur.setVilleF(rs.getString(5));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return fournisseur;
    }

    @Override
    public ArrayList<Fournisseur> findAll() {
        return null;
    }

    @Override
    public Fournisseur create(Fournisseur obj) {
        return null;
    }

    @Override
    public Fournisseur update(Fournisseur obj) {
        return null;
    }

    @Override
    public void delete(Fournisseur obj) {
    }
}
