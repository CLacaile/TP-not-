package model;

public class Produit {
    private int idP;
    private String nomP;
    private String catP;
    private String especeP;
    private double prixP;
    private int qteP;           // qté disponible en stock


    public int getIdP() {
        return idP;
    }

    public void setIdP(int idP) {
        this.idP = idP;
    }

    public String getNomP() {
        return nomP;
    }

    public void setNomP(String nomP) {
        this.nomP = nomP;
    }

    public String getCatP() {
        return catP;
    }

    public void setCatP(String catP) {
        this.catP = catP;
    }

    public String getEspeceP() {
        return especeP;
    }

    public void setEspeceP(String especeP) {
        this.especeP = especeP;
    }

    public double getPrixP() {
        return prixP;
    }

    public void setPrixP(double prixP) {
        this.prixP = prixP;
    }

    public int getQteP() {
        return qteP;
    }

    public void setQteP(int qteP) {
        this.qteP = qteP;
    }

    public Object getNomPObject() {
        return this.nomP;
    }

    public Object getCatPObject() {
        return this.catP;
    }

    public Object[] getProduitInfo() {
        Object[] infos = new Object[6];
        infos[0] = Integer.toString(this.idP);
        infos[1] = this.getNomP();
        infos[2] = this.getCatP();
        infos[3] = this.getEspeceP();
        infos[4] = Double.toString(this.prixP);
        infos[5] = Integer.toString(this.qteP);
        return infos;
    }
}
