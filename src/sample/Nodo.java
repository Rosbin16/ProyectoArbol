package sample;

/**
 * Created by George on 03/12/2017.
 */
public class Nodo {
    private int dato;
    private Nodo izq; // punter hacia el siguiente nodo
    private Nodo der;

    //constructor, inicializa el nodo
    public Nodo(int dato){
        this.dato =dato;
    }
    //Los getters
    public Nodo getNodoIzquierdo(){
        return izq;
    }

    public Nodo getNodoDerecho(){
        return der;
    }
    // setters
    public void setNodoIzquierdo(Nodo nodo){
        izq = nodo;
    }

    public void setNodoDerecho(Nodo nodo){
        der = nodo;
    }

    public int getDato(){
        return dato;
    }

}
