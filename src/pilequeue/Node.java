/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilequeue;

/**
 *
 * @author User
 */
public class Node {
    private Node nodoSgte;
    private int dato;
    
    public Node(int dato){
        this.dato = dato;
    }

    public Node getNodoSgte() {
        return nodoSgte;
    }

    public void setNodoSgte(Node nodoSgte) {
        this.nodoSgte = nodoSgte;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }
    
    
    
}
