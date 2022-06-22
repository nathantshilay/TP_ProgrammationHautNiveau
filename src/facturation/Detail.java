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
class Detail {
   private List<Ligne> ligne;

    /**
     * @return the ligne
     */
    public List<Ligne> getLigne() {
        return ligne;
    }

    /**
     * @param ligne the ligne to set
     */
    public void setLigne(List<Ligne> ligne) {
        this.ligne = ligne;
    }
    
}
