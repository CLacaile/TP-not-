package model;

import java.util.ArrayList;

public class TPModel {
    private ArrayList<Client> clients = new ArrayList<Client>();

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }
}
