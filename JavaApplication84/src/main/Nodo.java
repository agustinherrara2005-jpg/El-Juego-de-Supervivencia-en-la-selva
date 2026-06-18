package main;

public class Nodo {

    Nodo nodoDerecho;
    Nodo nodoIzquierdo;
    String opcion;

    public Nodo(Nodo nodoDerecho, Nodo nodoIzquierdo, String opcion) {
        this.nodoDerecho = nodoDerecho;
        this.nodoIzquierdo = nodoIzquierdo;
        this.opcion = opcion;
    }
    //esto hace que el programa se de cuenta que es una hoja osea el final. 
    //usamos null para ver que no tenga hijos

    public Nodo(String opcion) {
        this.nodoDerecho = null;
        this.nodoIzquierdo = null;
        this.opcion = opcion;
    }
    //identifica el final
    public boolean identificarHoja() {
        return (nodoDerecho == null && nodoIzquierdo == null);
    }
}
