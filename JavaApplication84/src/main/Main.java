package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Arbol juego = new Arbol();
        juego.comenzarHistoria();

        Scanner scannerMain = new Scanner(System.in);

        int opcionMenu = 0;

        do {

            System.out.println("\n=================================================");
            System.out.println("       PROYECTO INTEGRADOR - SEGUNDO PARCIAL     ");
            System.out.println("=================================================");
            System.out.println("1.  Jugar Supervivencia en la Selva!");
            System.out.println("2.  Ver Integrantes del Grupo");
            System.out.println("3.  Salir del Programa");
            System.out.println("=================================================");
            System.out.print("Seleccione una opcion: ");

            if (scannerMain.hasNextInt()) {
                opcionMenu = scannerMain.nextInt();
                System.out.println();
            } else {
                System.out.println("\nPor favor, ingresa un numero valido.");
                scannerMain.next();
                continue;
            }

            switch (opcionMenu) {

                case 1:

                    System.out.println("Comienza el juego de Supervivencia!!");
                    System.out.println("COMO JUGAR?\n"
                            + "MIENTRAS SE DESARROLLA LA HISTORIA TIENE QUE ELEGIR EN 2 OPCIONES CON EL NUMERO 1 (para Izquierda) o 2 (para Derecha)\n"
                            + "DEPENDE LAS SITUACIONES QUE ELIJAS SERA TU FINAL, BUENA SUERTE!! \n");

                    Nodo actual = juego.getRaiz();

                    while (!actual.identificarHoja()) {

                        System.out.println(actual.opcion);
                        System.out.print("Tu eleccion (1 o 2): ");

                        int eleccion;

                        if (scannerMain.hasNextInt()) {

                            eleccion = scannerMain.nextInt();
                            System.out.println();

                            actual = juego.avanzar(actual, eleccion);

                        } else {

                            System.out.println("\nEntrada no valida. Debes ingresar el numero 1 o 2.\n");
                            scannerMain.next();
                        }
                    }

                    System.out.println("\n=================================================");
                    System.out.println("               *** FIN DEL JUEGO *** ");
                    System.out.println(actual.opcion);
                    System.out.println("=================================================");

                    break;

                case 2:

                    System.out.println("               INTEGRANTES DEL GRUPO             ");
                    System.out.println("=================================================");
                    System.out.println("- [Agustin Herrera]");
                    System.out.println("- [Guada Bustos]");
                    System.out.println("- [Juan A Clavero Marchioni]");

                    break;

                case 3:

                    System.out.println("¡Gracias por jugar! Cerrando el simulador...");
                    break;

                default:

                    System.out.println("Opcion invalida. Intente con 1, 2 o 3");
            }

        } while (opcionMenu != 3);

        scannerMain.close();
    }
}
