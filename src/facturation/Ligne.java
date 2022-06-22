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
class Ligne {
    private int numero;
    private int quatite;
    private Produit produit;
    
public Ligne(int numero , int quantite, Produit produit){
    this.numero = numero;
    this.quatite = quantite;
    this.produit = produit;
}
public Ligne(){
    this.numero = 0;
    this.quatite = 0;
    this.produit = null;
}

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the quatite
     */
    public int getQuatite() {
        return quatite;
    }

    /**
     * @param quatite the quatite to set
     */
    public void setQuatite(int quatite) {
        this.quatite = quatite;
    }

    /**
     * @return the produit
     */
    public Produit getProduit() {
        return produit;
    }

    /**
     * @param produit the produit to set
     */
    public void setProduit(Produit produit) {
        this.produit = produit;
    }
    
    public double getPrixTotal(){
        return this.quatite * this.produit.getPrix();
    }
    
}
