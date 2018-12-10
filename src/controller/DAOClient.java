package controller;

import model.Client;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
    public ArrayList<Client> findAll() {
        ArrayList<Client> clients = new ArrayList<>();
        ArrayList<Integer> indexList = new ArrayList<>();
        try {
            // Récupérer la liste des index (non distincts)
            String sql = "SELECT idC FROM client";
            PreparedStatement pst = connect.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
                indexList.add(rs.getInt(1));
            }
            // Création produits
            for(int i=0; i<indexList.size(); i++) {
                Client client = find(indexList.get(i));
                if(!clients.contains(client))
                    clients.add(client);
            }
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
        return clients;
    }

    @Override
    public Client create(Client obj) {
        return null;
    }

    @Override
    public Client update(Client obj) {
        return null;
    }

    @Override
    public void delete(Client obj) {
        try {
            String sql = "DELETE FROM client WHERE idC="+obj.getIdC();
            PreparedStatement pst = connect.prepareStatement(sql);
            pst.executeUpdate();
            System.out.println("Client supprimé");
            pst.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
