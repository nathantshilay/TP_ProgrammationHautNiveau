/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturation;

/**
 *
 * @author kakompe
 */
public class Adresse {
    private String avenue;
    private String numero;
    private String cellule;
    private String quartier;
    private String commune;
    private String ville;
    private String pays;
public Adresse(String avenue,String numero,String cellule,String quartier,String commune,String ville,String pays){
    
    this.avenue = avenue;
    this.numero = numero;
    this.cellule = cellule;
    this.quartier = quartier;
    this.commune = commune;
    this.ville = ville;
    this.pays = pays;
}
 public Adresse(){
     this.avenue = null;
    this.numero = null;
    this.cellule = null;
    this.quartier = null;
    this.commune = null;
    this.ville = null;
    this.pays = null;
 }
    /**
     * @return the avenue
     */
    public String getAvenue() {
        return avenue;
    }

    /**
     * @param avenue the avenue to set
     */
    public void setAvenue(String avenue) {
        this.avenue = avenue;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return the cellule
     */
    public String getCellule() {
        return cellule;
    }

    /**
     * @param cellule the cellule to set
     */
    public void setCellule(String cellule) {
        this.cellule = cellule;
    }

    /**
     * @return the quartier
     */
    public String getQuartier() {
        return quartier;
    }

    /**
     * @param quartier the quartier to set
     */
    public void setQuartier(String quartier) {
        this.quartier = quartier;
    }

    /**
     * @return the commune
     */
    public String getCommune() {
        return commune;
    }

    /**
     * @param commune the commune to set
     */
    public void setCommune(String commune) {
        this.commune = commune;
    }

    /**
     * @return the ville
     */
    public String getVille() {
        return ville;
    }

    /**
     * @param ville the ville to set
     */
    public void setVille(String ville) {
        this.ville = ville;
    }

    /**
     * @return the pays
     */
    public String getPays() {
        return pays;
    }

    /**
     * @param pays the pays to set
     */
    public void setPays(String pays) {
        this.pays = pays;
    }
    
    
}
