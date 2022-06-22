/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturation;
//

/**
 *======================================
 * NOM DES MEMBRES 
 * - LUMBALA TOMPWE HUSSEIN GL
 * - MWENDO KABASO HADRY GL
 * - MWAMBA TSHILAY NATHAN GL
 * MUNA MAKUWA ROLLINS GL
 * MBAV TSHIWEW BAVON GL
 * MUMBA KAFWILA DAVID GL
 * - LUNKUBE KATANGA DESTIN GL
 * - MUSENGE KAKOMPE REMY GL
 * KASONGO MPANGE BENI MSI
 * KASONGO MWAMBE NESTOR MSI
 * KAZADI ILUNGA RUTH MSI
 * 
 * 
 * @author kakompe
 */
public class Facturation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Adresse adresse = new Adresse("denotaire", "14","cellule" , "quartier", "commune","ville", "pays");
   
        
        Client destin = new Client("destin","kasai",adresse,"5");
    
    System.out.println(adresse.toString());
    
    
    }
    
}
