/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturation;

import java.util.Date;

/**
 *
 * @author kakompe
 */
class Produit<T> {
    private String code;
    private String designation;
    private double prix;
    private T uniteMesure;
    private Date dateExpiration;
    
public Produit(String code,String designation,double prix,T uniteMesure,Date dateExpiration){
    this.code = code ;
    this.designation = designation;
    this.prix = prix;
    this.uniteMesure = uniteMesure;
    this.dateExpiration =  dateExpiration;
}

public Produit(){
    this.code = null ;
    this.designation = null;
    this.prix = 0.0;
    this.uniteMesure = null;
    this.dateExpiration =  null;
}

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the designation
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * @param designation the designation to set
     */
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    /**
     * @return the prix
     */
    public double getPrix() {
        return prix;
    }

    /**
     * @param prix the prix to set
     */
    public void setPrix(double prix) {
        this.prix = prix;
    }

    /**
     * @return the uniteMesure
     */
    public T getUniteMesure() {
        return uniteMesure;
    }

    /**
     * @param uniteMesure the uniteMesure to set
     */
    public void setUniteMesure(T uniteMesure) {
        this.uniteMesure = uniteMesure;
    }

    /**
     * @return the dateExpiration
     */
    public Date getDateExpiration() {
        return dateExpiration;
    }

    /**
     * @param dateExpiration the dateExpiration to set
     */
    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }
    
}
