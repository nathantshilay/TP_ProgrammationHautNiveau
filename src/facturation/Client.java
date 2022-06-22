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
public class Client extends Personne {
    private String numero;
    
    public Client(String nom,String prenom,Adresse adresse,String numero){
        super(nom,prenom,adresse);
        this.numero = numero;
    }
    
    public Client(){
        super();
        this.numero = null;
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
    
    
}
