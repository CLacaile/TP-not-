package controller;

import model.Client;
import model.TPModel;
import view.TPView;

import java.util.ArrayList;

public class TPController {
    private TPModel model;
    private TPView view;
    private DAOClient DAOclient = new DAOClient();


    public TPController(TPModel m, TPView v) {
        this.model = m;
        this.view = v;

        // Récupération des données des clients au lancement de l'app
        ArrayList<Client> clients = new ArrayList<Client>();
        int nbOfClients = this.DAOclient.getNbOfClients();
        for(int i=0; i<nbOfClients; i++) {
            clients.add(this.DAOclient.find(i+1));
        }
        this.model.setClients(clients);
        displayClientsDataFromModel();
    }

    /**
     * Afficher les données dans le tableau
     */
    public void displayClientsDataFromModel() {
        int nbOfClients = this.model.getClients().size();
        for (int i=0; i<nbOfClients; i++) {
            this.view.getClientPanel().addRow(this.model.getClients().get(i).getClientInfo());
        }
    }
}
