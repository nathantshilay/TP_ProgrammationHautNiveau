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
public class BonDeCommande  extends DocumentCommercial {
    
    public BonDeCommande(long numero, Client client, Detail detail) {
        super(numero, client, detail);
    }
    
    
}
