package main;
import java.util.Scanner;

public class Arbol {

    Nodo raiz;

    public Arbol() {
        this.raiz = null;
    }

    //en esta clase creo que se hacen todos los constructores para llamarlos desde el main
    //despues de que analizaramos como ordenarlos decidimos hacerlo de forma arriba hacia abajo, porque se podia hacer tambien de abajo hacia arriba empezando desde las NodosHOJAS
    public void comenzarHistoria() {
        raiz = new Nodo("Te despiertas en la selva, no entendes nada, ves el cielo y esta por llover,\n"
                + "Que haces? \n" + "Buscar refugio/Buscar comida");
        //lo planteamos de forma que iremos creando las opciones, o los dialogos creando el arbol de a uno
        //NIVEL 1= 2 OPCIONES 
        //NODO IZQUIERDO 1 
        raiz.nodoIzquierdo = new Nodo("Buscaste refugio en una cueva! pero te encontraste con muchos murcielagos peligrosos!\n"
                + "Que haces? \n" + "No hacer ruido/Correr por tu vida");
        //NODO DERECHO 1
        raiz.nodoDerecho = new Nodo("buscaste comida, caminaste mucho tiempo y no encontraste nada y se esta por largar a llover\n"
                + "Que haces? \n" + "trepar un arbol y eperar/hacer refugio con ramas del suelo");

        //NIVEL 2 = Opciones 4 --------------------
        //NIVEL 2 = Opcion del lado izquierdo 
        //DEL LADO IZQUIERDO
        raiz.nodoIzquierdo.nodoIzquierdo = new Nodo("Los murcielagos no te detectan.Por el frio de la selva y la lluvia, se encuentran descansando.\n"
                + "Qué haces? \n" + "Quedarte en la cueva/Salir,cuando pare la lluvia");
        raiz.nodoIzquierdo.nodoDerecho = new Nodo("Los murcielagos salen de la cueva volando a atacarte\n"
                + "Que haces? \n" + "Te escondes detrás de unos árboles/sigues a un lugar seguro");
        //NIVEL 2 Opciones del lado derecho
        //DEL LADO DERECHO
        raiz.nodoDerecho.nodoIzquierdo = new Nodo("Trepaste un arbol con muchas hojas que te protegen de la lluvia! \n"
                + "pero escuchas un ruido raro\n" + "que haces?\n" + "decides mirar/no mirar y fingir demencia");

        raiz.nodoDerecho.nodoDerecho = new Nodo("Estas haciendo un refugio casi lo terminas y levantado las ultimas ramas, te sale una araña venenosa!\n"
                + "Que haces?\n" + "Buscas la forma de matarla/Decides abandonar el refugio y correr");

        //NIVEL 3 = 8 opciones--------------------------
        //NODOS DEL LADO IZQUIERDO
        raiz.nodoIzquierdo.nodoIzquierdo.nodoIzquierdo = new Nodo("Sales de la cueva, cuando para la lluvia  y encuentras agua filtrandose de una roca.\n"
                + "Qué haces?\n" + "Beber agua/Explorar más profundo");
        raiz.nodoIzquierdo.nodoIzquierdo.nodoDerecho = new Nodo("Decides salir cuando para la lluvia .. a explorar, hay un sendero lleno de ramas y serpientes camufladas entre ellas \n"
                + "Que haces?\n" + "Vas por ese sendero/Retrocedes a esperar en la cueva");

        //SEGUIMOS LADO IZQUIERDO PERO PASAMOS AL DERECHO
        raiz.nodoIzquierdo.nodoDerecho.nodoIzquierdo = new Nodo("Te escondes, los murcielagos se alejan y encuentras una mochila vieja con un cuchillo y una botella vacia lo tomas. Escuchas el rugido de un animal acercandose.\n"
                + "Que haces? \n"
                + "Atacas al animal/Te tiras al suelo.");
        raiz.nodoIzquierdo.nodoDerecho.nodoDerecho = new Nodo("esquivas los arboles y encuentras un pequeño pozo\n"
                + "Que haces?\n"
                + "Te metes al pozo/Lo esquivas y seguis de largo.");

        //NIVEL 3 DEL LADO DERECHO----------------------
        raiz.nodoDerecho.nodoDerecho.nodoIzquierdo = new Nodo("agarras una piedra del suelo y la matas! se aplasta tuviste mucha suerte! \n"
                + "de repente el lugar del suceso es un nido de arañas!!\n"
                + "que haces? \n"
                + "Correr por tu vida/ Agarrar un RAID del suelo y matarlas.");
        raiz.nodoDerecho.nodoDerecho.nodoDerecho = new Nodo("Corriendo desesperado, llegas a una parte elevada, donde ves un humo, como una fogata y del otro lado un rio\n"
                + "que haces? \n"
                + "Voy hacia el humo a investigar/bajo al rio y me hidrato.");

        //SEGUIMOS LADO DERECHO PERO USAMOS UN IZQUIERDO
        raiz.nodoDerecho.nodoIzquierdo.nodoIzquierdo = new Nodo("Si decides mirar, ves una pantera negra durmiendo en una de sus ramas!! pero por estar mojado por la lluvia no detecta tu olor \n"
                + "que haces?\n"
                + "Bajas del arbol a buscar otro lugar/Esperar que termine la lluvia y bajar.");
        raiz.nodoDerecho.nodoIzquierdo.nodoDerecho = new Nodo("No miraste, y habia una serpiente venenosa, cuando las ves es demasiado tarde, esta yendo hacia a ti y TE PICA!\n"
                + "Que haces?\n "
                + "succionas el veneno/Me quedo en el arbol.");

        //NIVEL 4 = OPCIONES 16 Y FINALES HOJAS 
        //LADO IZQUIERDO DESDE LA RAIZ
        raiz.nodoIzquierdo.nodoIzquierdo.nodoIzquierdo.nodoIzquierdo = new Nodo("Bebes el agua por unos dias mientras te refugias y vienen a rescatarte en un helicoptero.\n"
                + " SOBREVIVISTE!!");
        raiz.nodoIzquierdo.nodoIzquierdo.nodoIzquierdo.nodoDerecho = new Nodo("Exploras mas profundo te caes al agua, te ahogas y mueres. NO SOBREVIVISTE!!\n"
                + "Fin de la historia");

        raiz.nodoIzquierdo.nodoIzquierdo.nodoDerecho.nodoIzquierdo = new Nodo("Retrocedes a esperar en la cueva, refugiandote de la lluvia y los animales.. mientras esperas que te rescaten.\n"
                + "SOBREVIVISTE!!");
        raiz.nodoIzquierdo.nodoIzquierdo.nodoDerecho.nodoDerecho = new Nodo("Vas por el sendero, mientras avanzas las serpientes se van moviendo por las rama y te ataca una bamba negra.\n"
                + "NO SOBREVIVISTE!!\n"
                + "Fin de la historia");

        //NIVEL 4 LADO IZQUIERDO, SEGUIDO PARTE DERECHA
        raiz.nodoIzquierdo.nodoDerecho.nodoIzquierdo.nodoIzquierdo = new Nodo("Atacas al animal  con el cuchillo y te lastima tambien.\n"
                + "NO SOBREVIVISTE!!\n"
                + "Fin de la historia");
        raiz.nodoIzquierdo.nodoDerecho.nodoIzquierdo.nodoDerecho = new Nodo("los murciélagos te pasan por encima, el ruido alerta a unos senderistas ayudandote a salir de selva!\n "
                + "SOBREVIVISTE!! EXCELENTE");

        raiz.nodoIzquierdo.nodoDerecho.nodoDerecho.nodoIzquierdo = new Nodo("los murcielagos pasan de largo pero lo que no te das cuenta es que habia un pozo, este tiene agua mineral que te ayuda a resistir unos dias hasta que te encuentran\n" + " SOBREVIVISTE! FIN DE JUEGO");
        raiz.nodoIzquierdo.nodoDerecho.nodoDerecho.nodoDerecho = new Nodo("los murcielagos te empiezan a atacar y te pegan la rabia!\n" + " SOBREVIVISTE! FIN DE JUEGO");

        //NIVEL 4 LADO DERECHO, hacia la izquierda
        raiz.nodoDerecho.nodoIzquierdo.nodoIzquierdo.nodoIzquierdo = new Nodo("Bajas silenciosamente el arbol, y empiezas a caminar, deja de llover se despeja el cielo. ves a lo lejos humo y te diriges hacia el, es un campamento con mas sobrevivientes, sobreviven juntos hasta que los encuentra un helicoptero!\n"
                + " SOBREVIVISTE!! EXCELENTE");
        raiz.nodoDerecho.nodoIzquierdo.nodoIzquierdo.nodoDerecho = new Nodo("Esperaste que termine la lluvia, pero te secas y la pantera detecta tu olor! la pantera se lanza hacia a ti y te come!\n"
                + " NO SOBREVIVISTE!! FIN");

        raiz.nodoDerecho.nodoIzquierdo.nodoDerecho.nodoIzquierdo = new Nodo("Succionas el veneno y lo vas escupiendo con cuidado, gracias a eso te da mas tiempo para esperar a la ayuda que aparece a las horas sin querer!\n"
                + " SOBREVIVISTE!! EXCELENTE");
        raiz.nodoDerecho.nodoIzquierdo.nodoDerecho.nodoDerecho = new Nodo("Caes del arbol y al pasar de las horas mueres envenenado!\n"
                + " NO SOBREVIVISTE!! FIN");

        //NIVEL 4 LADO DERECHO, HACIA DERECHA
        raiz.nodoDerecho.nodoDerecho.nodoIzquierdo.nodoIzquierdo = new Nodo("Corriste por tu vida y te quedaste atrado por muchas pared de telarañas!!\n"
                + " TE MORISTE!! FIN DE JUEGO");
        raiz.nodoDerecho.nodoDerecho.nodoIzquierdo.nodoDerecho = new Nodo("El Raid hace efecto, puedes escapar!\n"
                + " SOBREVIVISTE ESTABAS SOÑANDO!!");

        raiz.nodoDerecho.nodoDerecho.nodoDerecho.nodoIzquierdo = new Nodo("Fuiste hacia el humo, te encontraste con una tribu incivilidzada de la region!! te desconocen y te comen!\n "
                + "MORISTE! FIN DE JUEGO");
        raiz.nodoDerecho.nodoDerecho.nodoDerecho.nodoDerecho = new Nodo("Bajaste al rio, te hidrataste y te sientes mucho mejor, decides ignorar el humo y seguir el camino del rio hacia arriba! GENIAL habia civilizacion y te llevaron en helicoptero!\n"
                + " SOBREVIVISTE! FIN DE JUEGO");

    }
public Nodo getRaiz() {
    return raiz;
}

public Nodo avanzar(Nodo actual, int eleccion) {

    if (eleccion == 1 && actual.nodoIzquierdo != null) {
        return actual.nodoIzquierdo;
    }

    if (eleccion == 2 && actual.nodoDerecho != null) {
        return actual.nodoDerecho;
    }

    return actual;
}
}
