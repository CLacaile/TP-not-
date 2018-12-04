import controller.*;
import model.*;
import view.TPView;

public class Main {

    public static void main(final String[] args) {
        TPModel theModel = new TPModel();
        TPView theView = new TPView();
        TPController theController = new TPController(theModel, theView);

        System.out.println("************* Liste des clients *************");
        DAO<Client> daoclient = new DAOClient();
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
        for(int i=1; i<=3; i++) {
            Client c = daofacture.find(i).getClientFact();
            System.out.println("---------- Facture #"+i+" ----------");
            System.out.println("N°: "+ daofacture.find(i).getIdFact());
            System.out.println("Client: "+ c.getPrenomC() + " " + c.getNomC());
            for(int j=0; j<daofacture.find(i).getProduitsFact().size(); j++) {
                Produit p = daofacture.find(i).getProduitsFact().get(j);
                System.out.println("Produit #"+p.getIdP()+":\t"+p.getNomP()+"\t"+p.getPrixP()+"\t"+daofacture.find(i).getQteProdFact().get(j));
            }
            System.out.println("Montant total: "+daofacture.find(i).getMontantFact());
        }

    }
}
