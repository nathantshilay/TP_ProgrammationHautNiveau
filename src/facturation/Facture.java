/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturation;

import java.util.List;

/**
 *
 * @author kakompe
 */
public class Facture extends DocumentCommercial{
    
    /**
     *
     * @param numero
     * @param client
     * @param detail
     */
    public Facture(long numero, Client client, Detail detail) {
        super(numero, client, detail);
    }

    @Override
    public double getTotal() {
       double prixTotal = 0;
       Detail detail = getDetail();
       List<Ligne> list = detail.getLigne();
       for(Ligne ligne: list){
           
           prixTotal += ligne.getPrixTotal();
       }
       return prixTotal;
       
    }

    @Override
    public double getTVA() {
        return (getTotal()*16)/100;
        
    }
    
}
