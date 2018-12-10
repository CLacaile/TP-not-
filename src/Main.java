import controller.*;
import model.*;
import view.TPView;

import java.util.ArrayList;

public class Main {

    public static void main(final String[] args) {
        TPModel theModel = new TPModel();
        TPView theView = new TPView();
        TPController theController = new TPController(theModel, theView);

        System.out.println("************* Liste des produits *************");
        DAO<Produit> daoprod = new DAOProduit();
        for(int i=1; i<3; i++) {
            System.out.println("---------- Produit #"+i+" ----------");
            System.out.println("Nom: "+ daoprod.find(i).getNomP());
            System.out.println("Catégorie: "+ daoprod.find(i).getCatP());
            System.out.println("Espèce: "+ daoprod.find(i).getEspeceP());
            System.out.println("Prix: "+ daoprod.find(i).getPrixP() +"€");
            System.out.println("Qté stock: "+ daoprod.find(i).getQteP());
        }

        System.out.println("************* Liste des clients *************");
        DAO<Client> daoclient = new DAOClient();
        System.out.println("Nombre de clients: "+((DAOClient) daoclient).getNbOfClients());
        for(int i=1; i<3; i++) {
            System.out.println("---------- Client #"+i+" ----------");
            System.out.println("Nom: "+ daoclient.find(i).getNomC());
            System.out.println("Prenom: "+ daoclient.find(i).getPrenomC());
            System.out.println("Ville: "+ daoclient.find(i).getVilleC());
            System.out.println("Adresse: "+ daoclient.find(i).getAdresseC());
            System.out.println("Reduc: "+ daoclient.find(i).getReductionC());
        }

        System.out.println("************* Liste des fournisseurs *************");
        DAO<Fournisseur> daofournisseur = new DAOFournisseur();
        for(int i=1; i<3; i++) {
            System.out.println("---------- Fournisseur #"+i+" ----------");
            System.out.println("Nom: "+ daofournisseur.find(i).getNomF());
            System.out.println("Prenom: "+ daofournisseur.find(i).getPrenomF());
            System.out.println("Ville: "+ daofournisseur.find(i).getVilleF());
            System.out.println("Adresse: "+ daofournisseur.find(i).getAdresseF());
        }

        System.out.println("************* Liste des factures *************");
        DAO<Facture> daofacture = new DAOFacture();
        ArrayList<Facture> factures = daofacture.findAll();
        for(int i=0; i<factures.size(); i++) {
            System.out.println("---------- Facture #"+i+" ----------");
            System.out.println("N°: "+ factures.get(i).getIdFact());
            System.out.println("Client: "+ factures.get(i).getClientFact().getPrenomC() + " " + factures.get(i).getClientFact().getPrenomC());
            for(int j=0; j<factures.get(i).getProduitsFact().size(); j++) {
                Produit p = factures.get(i).getProduitsFact().get(j);
                System.out.println("Produit #"+p.getIdP()+":\t"+p.getNomP()+"\t"+p.getPrixP()+"€\t"+factures.get(i).getQteProdFact().get(j));
            }
            System.out.println("Montant total: "+factures.get(i).getMontantFact()+"€");
        }

        System.out.println("************* Liste des bons de commandes *************");
        DAO<Fourniture> daofourniture = new DAOFourniture();
        for(int i=1; i<=2; i++) {
            Fournisseur f = daofourniture.find(i).getFournisseurFourn();
            System.out.println("---------- BdC #"+i+" ----------");
            System.out.println("N°: "+ daofourniture.find(i).getIdFourn());
            System.out.println("Fournisseur: "+ f.getNomF() + " " + f.getPrenomF());
            //System.out.println(daofourniture.find(i).getProduitsFourn());
            for(int j=0; j<daofourniture.find(i).getProduitsFourn().size(); j++) {
                Produit p = daofourniture.find(i).getProduitsFourn().get(j);
                System.out.println("Produit #"+p.getIdP()+":\t"+p.getNomP()+"\t"+p.getPrixP()+"€\t"+daofourniture.find(i).getQteProdFourn().get(j));
            }
            System.out.println("Montant total: "+daofourniture.find(i).getMontantFourn()+"€");
        }



    }
}
