package model;

public class Client {
    private int idC;
    private String nomC;
    private String prenomC;
    private String adresseC;
    private String villeC;
    private double reductionC;

    public int getIdC() {
        return idC;
    }

    public void setIdC(int idC) {
        this.idC = idC;
    }

    public String getNomC() {
        return nomC;
    }

    public void setNomC(String nomC) {
        this.nomC = nomC;
    }

    public String getPrenomC() {
        return prenomC;
    }

    public void setPrenomC(String prenomC) {
        this.prenomC = prenomC;
    }

    public String getAdresseC() {
        return adresseC;
    }

    public void setAdresseC(String adresseC) {
        this.adresseC = adresseC;
    }

    public String getVilleC() {
        return villeC;
    }

    public void setVilleC(String villeC) {
        this.villeC = villeC;
    }

    public double getReductionC() {
        return reductionC;
    }

    public void setReductionC(double reductionC) {
        this.reductionC = reductionC;
    }

    public Object[] getClientInfo() {
        Object[] infos = new Object[6];
        infos[0] = Integer.toString(this.idC);
        infos[1] = this.getNomC();
        infos[2] = this.getPrenomC();
        infos[3] = this.getAdresseC();
        infos[4] = this.getVilleC();
        infos[5] = Double.toString(this.reductionC);
        return infos;
    }
}
