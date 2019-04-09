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
public class Pile {
 
    private Node cabeza;
    private int tamanio;
    
    public Pile(){
        cabeza = null;
        tamanio = 0;
    }

    public Node getCabeza() {
        return cabeza;
    }

    public void setCabeza(Node cabeza) {
        this.cabeza = cabeza;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
    
    public void apilar(int numero){
        Node nodo;
        nodo = new Node(numero);
        
        if(cabeza == null){
            nodo.setNodoSgte(null);
            cabeza = nodo;
        }else{
            nodo.setNodoSgte(cabeza);
            cabeza = nodo;
        }
    }
    
    public int desapilar (){
        int numero = 0;
        if(cabeza != null){
            if(cabeza.getNodoSgte() != null){
                Node nodoAux;
                nodoAux = cabeza;
                cabeza = cabeza.getNodoSgte();
                nodoAux.setNodoSgte(null);
                numero = nodoAux.getDato();
            }else {
                numero = cabeza.getDato();
                cabeza = null;
            }
        }else {
            numero = 0;
        }
        return numero;
    }
}
