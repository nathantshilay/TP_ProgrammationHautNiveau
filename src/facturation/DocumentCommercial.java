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
public abstract class DocumentCommercial {
    private long numero;
    private Client client;
    private Detail detail;

    /**
     *
     * @param numero
     * @param client
     * @param detail
     */
    public DocumentCommercial(long numero,Client client,Detail detail){
    
}

    /**
     * @return the numero
     */
    public long getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(long numero) {
        this.numero = numero;
    }

    /**
     * @return the client
     */
    public Client getClient() {
        return client;
    }

    /**
     * @param client the client to set
     */
    public void setClient(Client client) {
        this.client = client;
    }

    /**
     * @return the detail
     */
    public Detail getDetail() {
        return detail;
    }

    /**
     * @param detail the detail to set
     */
    public void setDetail(Detail detail) {
        this.detail = detail;
    }
    
    public abstract double getTotal();
    public abstract double getTVA();
    
}
