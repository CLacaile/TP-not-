package controller;

import model.Client;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOClient extends DAO<Client> {
    public int getNbOfClients() {
        int count = 0;
        PreparedStatement pst;
        try {
            String sql = "SELECT COUNT(*) FROM client";
            pst = connect.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if(rs.next()) {
                count = rs.getInt(1);
            }
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
        return count;
    }
    @Override
    public Client find(int id) {
        Client client = new Client();
        PreparedStatement pst;
        try {
            String sql = "SELECT * FROM client WHERE idC = " +id;
            pst = connect.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                client.setIdC(rs.getInt(1));
                client.setNomC(rs.getString(2));
                client.setPrenomC(rs.getString(3));
                client.setAdresseC(rs.getString(4));
                client.setVilleC(rs.getString(5));
                client.setReductionC(rs.getDouble(6));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return client;
    }

    @Override
    public Client create(Client obj) {
        return null;
    }
}
