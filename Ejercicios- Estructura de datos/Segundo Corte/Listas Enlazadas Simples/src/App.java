/* 1. El Tren de Carga (Logística Ferroviaria)
Diseña un sistema para gestionar los vagones de un tren de carga internacional.
La Clase Vagon (Nodo): Debe contener contenido (String), pesoToneladas (double), origen (String) y destino (String).
El Problema: El tren sale de una estación y se le van enganchando vagones al final.
Reto: Implementa un método que recorra el tren y calcule el peso total de toda la carga transportada. */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int Opcion;
        
        ColaTren Tren = new ColaTren();

        do{
             System.out.println("\n==============================================");
            System.out.println("   TREN DE CARGA - Menú Principal");
            System.out.println("==============================================");
            System.out.println("1. Nuevo vagon (Agregar al final del tren)");
            System.out.println("2. Calcular peso total de la carga");
            System.out.println();
            System.out.println("0. Salir");
            System.out.println("==============================================");
            System.out.print("Elige una opción: ");

            Opcion = scanner.nextInt();

            System.out.println();

            switch (Opcion) {
                case 1:
                    System.out.print("Ingrese el contenido del vagon: ");
                    scanner.nextLine();
                    String contenido = scanner.nextLine();
                    System.out.print("Ingrese el peso del vagon (en toneladas): ");
                    double pesoToneladas = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Ingrese el origen del vagon: ");
                    String origen = scanner.nextLine();
                    System.out.print("Ingrese el destino del vagon: ");
                    String destino = scanner.nextLine();

                    Vagon nuevoVagon = new Vagon(contenido, pesoToneladas, origen, destino);
                    Tren.agregarVagon(nuevoVagon);
                    break;
                    
                
                case 2:
                     double pesoTotal = Tren.calcularPesoTotal();
                    System.out.println("El peso total de la carga es: " + pesoTotal + " toneladas.");
                    break;
                case 0:
                    System.out.println("Saliendo del modulo de carga ");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    break;
            }
        }while (Opcion!=0);
            
        
        scanner.close();
        
    }
}
