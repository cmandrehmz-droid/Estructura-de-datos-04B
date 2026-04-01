/* 2. Inventario de Alimentos (Control de Caducidad)
Un supermercado necesita gestionar su estante de lácteos. Los productos que vencen más pronto deben colocarse al principio para ser vendidos primero.
La Clase Producto (Nodo): Debe contener nombre (String), cantidad (int) y diasParaVencer (int).
El Problema: Si llega un producto que vence en menos de 3 días, debe insertarse al inicio de la lista (prioridad de venta). Si vence en más tiempo, se pone al final.
Reto: Crea un método que imprima solo los productos que tienen menos de 5 días para vencer. */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        int Opcion;

        Inventario Inventario = new Inventario();

        do{
             System.out.println("\n==============================================");
            System.out.println("   supermercado - Menú Principal");
            System.out.println("==============================================");
            System.out.println("1. Nuevo Producto");
            System.out.println();
            System.out.println("2. Imprimir Productos");
            System.out.println();
            System.out.println("3. Imprimir Productos prontos a vencer");
            System.out.println();
            System.out.println("0. Salir");
            System.out.println("==============================================");
            System.out.print("Elige una opción: ");

            Opcion = scanner.nextInt();

            System.out.println();

            switch (Opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del producto: ");
                    scanner.nextLine();
                    String Nombre = scanner.nextLine();
                    System.out.print("Ingrese la cantidad del producto: ");
                    int Cantidad = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese los dias para vencer: ");
                    int DiasParaVencer = scanner.nextInt();

                    Inventario.InsertarProducto(Nombre, Cantidad, DiasParaVencer);
                    break;
                    
                
                case 2:
                     Inventario.imprimirProductos();
                    break;
                
                case 3:
                    Inventario.imprimirProximosAVencer();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
                    break;
            }
        }while (Opcion!=0);
    }
}
