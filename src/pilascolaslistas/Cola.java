/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilascolaslistas;

/**
 *
 * @author User
 */
public class Cola {
    private Nodo cabeza;
    private int tamanio;
    private Nodo ultimo;
    
    public Cola(){
        cabeza = null;
        tamanio = 0;
    }

    public Nodo getCabeza() {
        return cabeza;
    }

    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
    
    public void encolar(int numero){
        Nodo nodo;
        nodo = new Nodo(numero);
        
        if(cabeza == null){
            cabeza = nodo; 
            ultimo = cabeza;
        }else{
            if(cabeza.getNodoSgte() == null){
                cabeza.setNodoSgte(nodo);
                ultimo = nodo;
            }else{
                ultimo.setNodoSgte(nodo);
                ultimo = nodo;
            }
        }
    }
    
    public int desencolar(){
        int numero = 0;
        
        if(cabeza != null){
            if(cabeza.getNodoSgte() != null){
                Nodo nodoAux;
                nodoAux = cabeza;
                numero = nodoAux.getDato();
                cabeza = nodoAux.getNodoSgte();
                nodoAux.setNodoSgte(null);
            }else{
                numero = cabeza.getDato();
                cabeza = null;
                ultimo = null;
            }
        }
        return numero;
    }
}
