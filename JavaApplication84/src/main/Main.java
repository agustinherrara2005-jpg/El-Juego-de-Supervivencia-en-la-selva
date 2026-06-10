package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new java.util.Scanner(System.in);

        Arbol juego = new Arbol();
        juego.comenzarHistoria();

        // Scanner principal para controlar el menú de inicio
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

            // Controlamos que el usuario ingrese un número
            if (scannerMain.hasNextInt()) {
                opcionMenu = scannerMain.nextInt();
                System.out.println();
            } else {
                System.out.println("\n Por favor, ingresa un numero valido.");
                scannerMain.next(); // Limpia la entrada incorrecta
                continue;
            }

            switch (opcionMenu) {
                case 1:
                    // Pasamos el Scanner activo por parametro para no crear multiples instancias
                    juego.comienzaElJuego(scannerMain);
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
                    System.out.println("Opcion invalida. Intente con 1, 2");
            }

        } while (opcionMenu != 3);

        // cerramos el Scanner definitivamente al apagar el programa completo
        scannerMain.close();
    }

}
