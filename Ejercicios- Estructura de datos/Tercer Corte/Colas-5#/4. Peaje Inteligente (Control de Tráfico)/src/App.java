/* 4. Peaje Inteligente (Control de Tráfico)
En una autopista de peaje, los vehículos ingresan a un carril y avanzan en fila hasta la cabina de cobro. 
El sistema registra automáticamente cada vehículo al entrar al carril. 
El cajero cobra en el orden estricto de llegada.
La Clase Vehiculo (Nodo): Debe contener placa (String), tipoVehiculo (String), tarifa (double) y esExento (boolean).
El Problema: Al cerrar el turno, el sistema debe calcular el total recaudado, ignorando los vehículos exentos de pago.
Reto: Implementa un método cerrarTurno() que extraiga (dequeue) todos los vehículos de la cola, acumule la tarifa solo de los que tengan esExento = false e imprima el total recaudado al finalizar. */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ColaVehiculo colaVehiculos = new ColaVehiculo();
        Scanner datos = new Scanner(System.in);

        colaVehiculos.enqueue(new Vehiculo("XDD233","Automóvil",12000,false));
        colaVehiculos.enqueue(new Vehiculo("PRO987","Ambulancia",0,true));
        colaVehiculos.enqueue(new Vehiculo("KKJ456","Camión",25000,false));

        int opcion;

        do {

            System.out.println("\n--- PEAJE INTELIGENTE ---");
            System.out.println("1. Ver cola");
            System.out.println("2. Registrar vehículo");
            System.out.println("3. Cobrar siguiente");
            System.out.println("4. Cerrar turno");
            System.out.println("5. Salir");

            opcion = datos.nextInt();
            datos.nextLine();

            switch(opcion) {

                case 1:
                    colaVehiculos.imprimir();
                    break;

                case 2:

                    System.out.print("Placa: ");
                    String placa = datos.nextLine();

                    System.out.print("Tipo vehículo: ");
                    String tipo = datos.nextLine();

                    System.out.print("Tarifa: ");
                    double tarifa = datos.nextDouble();

                    System.out.print("¿Es exento? (true/false): ");
                    boolean exento = datos.nextBoolean();

                    colaVehiculos.enqueue(new Vehiculo(placa,tipo,tarifa,exento));

                    break;

                case 3:

                    Vehiculo vehiculo = colaVehiculos.dequeue();

                    if(vehiculo != null) {
                        System.out.println("Cobrando vehículo: " + vehiculo.placa);
                    }

                    break;

                case 4:
                    colaVehiculos.cerrarTurno();
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
