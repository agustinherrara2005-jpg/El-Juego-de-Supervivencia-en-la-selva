package main;


public class Arbol {
Nodo raiz;

    public Arbol(Nodo raiz) {
        this.raiz = null;
    }

    //en esta clase creo que se hacen todos los constructores para llamarlos desde el main
    //despues de que analizaramos como ordenarlos decidimos hacerlo de forma arriba hacia abajo, porque se podia hacer tambien de abajo hacia arriba empezando desde las NodosHOJAS
    public void comenzarHistoria() {
        raiz = new Nodo("Te despiertas en la selva, no entendes nada, ves el cielo y esta por llover,\n"
                + "¿que haces?" + "Buscar refugio/Buscar comida");
        //lo planteamos de forma que iremos creando las opciones, o los dialogos creando el arbol de a uno
        //NIVEL 1= 2 OPCIONES 
        //NODO IZQUIERDO 1 
        raiz.nodoIzquierdo = new Nodo("Buscaste refugio en una cueva! pero te encontraste con muchos murcielagos peligrosos!\n"
                + "¿Que haces?" + "No hacer ruido/Correr por tu vida");
        raiz.nodoDerecho = new Nodo("buscaste comida, caminaste mucho tiempo y no encontraste nada y se esta por largar a llover\n"
                + "que haces?" + "trepar un arbol y eperar/hacer refugio con ramas del suelo");

        //NIVEL 2 = Opcion nodoIzquierdo, Buscas comida
        raiz.nodoIzquierdo.nodoIzquierdo = new Nodo("Los murciélagos no te detectan.Por el frio de la selva y la lluvia, se encuentran descansando.\n"
                + "¿Qué haces?" + "Quedarte en la cueva/Salir,cuando pare la lluvia");
        //NIVEL 2 = opcion nodoDerecho, 
        raiz.nodoDerecho.nodoDerecho = new Nodo("Los murciélagos salen de la cueva volando a atacarte\n"
                + "Que haces?" + "Te escondes detrás de unos árboles/sigues a un lugar seguro");
    }


}
