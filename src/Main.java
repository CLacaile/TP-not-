import controller.DAO;
import controller.DAOClient;
import controller.TPController;
import model.Client;
import model.TPModel;
import view.TPView;

public class Main {

    public static void main(final String[] args) {
        TPModel theModel = new TPModel();
        TPView theView = new TPView();
        TPController theController = new TPController(theModel, theView);

        DAO<Client> daoclient = new DAOClient();

        for(int i=1; i<3; i++) {
            System.out.println("---------- Client #"+i+" ----------");
            System.out.println("Nom: "+ daoclient.find(i).getNomC());
            System.out.println("Prenom: "+ daoclient.find(i).getPrenomC());
            System.out.println("Nom: "+ daoclient.find(i).getNomC());
            System.out.println("Adresse: "+ daoclient.find(i).getAdresseC());
            System.out.println("Reduc: "+ daoclient.find(i).getReductionC());
        }
    }
}
