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
public class Queue {
    private Node cabeza;
    private int tamanio;
    private Node ultimo;
    
    public Queue(){
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
    
    public void encolar(int numero){
        Node nodo;
        nodo = new Node(numero);
        
        if(cabeza == null){
            cabeza = nodo; 
            ultimo = cabeza;
            tamanio++;
        }else{
            if(cabeza.getNodoSgte() == null){
                cabeza.setNodoSgte(nodo);
                ultimo = nodo;
                tamanio++;
            }else{
                ultimo.setNodoSgte(nodo);
                ultimo = nodo;
                tamanio++;
            }
        }
    }
    
    public int desencolar(){
        int numero = 0;
        
        if(cabeza != null){
            if(cabeza.getNodoSgte() != null){
                Node nodoAux;
                nodoAux = cabeza;
                numero = nodoAux.getDato();
                cabeza = nodoAux.getNodoSgte();
                nodoAux.setNodoSgte(null);
                tamanio--;
            }else{
                numero = cabeza.getDato();
                cabeza = null;
                ultimo = null;
                tamanio--;
            }
        }
        return numero;
    }
}
