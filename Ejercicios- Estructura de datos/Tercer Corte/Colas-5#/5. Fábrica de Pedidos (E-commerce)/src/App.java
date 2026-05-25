// 5. Fábrica de Pedidos (E-commerce)
// Una tienda en línea recibe pedidos de manera continua. Cada pedido ingresa a una cola central de procesamiento.
//  El sistema de bodega toma los pedidos en orden de llegada para preparar el envío. Si un pedido ya fue cancelado por el cliente,
//   debe ser descartado automáticamente al momento de ser procesado.

// La Clase Pedido (Nodo): Debe contener numeroPedido (String), cliente (String), totalPagar (double) y cancelado (boolean).
// El Problema: La bodega necesita procesar solo los pedidos vigentes.
//  Los cancelados deben ser eliminados sin ser despachados, pero registrados en un conteo.
// Reto: Implementa un método procesarPedidos() que recorra y vacíe la cola.
//  Para cada pedido: si cancelado = true, lo descarta e incrementa un contador de cancelados;
//   si cancelado = false, lo "despacha" imprimiendo sus datos. Al finalizar, muestra el total despachado y el total cancelado.

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ColaPedido colaPedidos = new ColaPedido();
        Scanner datos = new Scanner(System.in);

        colaPedidos.enqueue(new Pedido("P01","Andres",150000,false));
        colaPedidos.enqueue(new Pedido("P02","Daniela",200000,true));
        colaPedidos.enqueue(new Pedido("P03","Michael",350000,false));

        int opcion;

        do {

            System.out.println("\n--- FÁBRICA DE PEDIDOS ---");
            System.out.println("1. Ver pedidos");
            System.out.println("2. Registrar pedido");
            System.out.println("3. Procesar siguiente");
            System.out.println("4. Procesar todos");
            System.out.println("5. Salir");

            opcion = datos.nextInt();
            datos.nextLine();

            switch(opcion) {

                case 1:
                    colaPedidos.imprimir();
                    break;

                case 2:

                    System.out.print("Número pedido: ");
                    String numero = datos.nextLine();

                    System.out.print("Cliente: ");
                    String cliente = datos.nextLine();

                    System.out.print("Total pagar: ");
                    double total = datos.nextDouble();

                    System.out.print("¿Cancelado? (true/false): ");
                    boolean cancelado = datos.nextBoolean();

                    colaPedidos.enqueue(new Pedido(numero,cliente,total,cancelado));

                    break;

                case 3:

                    Pedido pedido = colaPedidos.dequeue();

                    if(pedido != null) {
                        System.out.println("Procesando pedido: " + pedido.numeroPedido);
                    }

                    break;

                case 4:
                    colaPedidos.procesarPedidos();
                    break;

                case 5:
                    System.out.println("fin");
                    break;

                default:
                    System.out.println("Opción incorrecta, intente de nuevo");
            }
        } while(opcion != 5);
    }
}
