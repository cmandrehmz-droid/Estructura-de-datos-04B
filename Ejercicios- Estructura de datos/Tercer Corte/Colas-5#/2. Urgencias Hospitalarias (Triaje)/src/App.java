import java.util.Scanner;

public class App {
    /* 2. Urgencias Hospitalarias (Triaje)
    En la sala de urgencias de un hospital, los pacientes que llegan son registrados y colocados en una fila de atención. 
    Dado el volumen de pacientes, el médico de guardia atiende en estricto orden de llegada. Al momento de llamar a un paciente, el sistema debe mostrar su información completa.
    La Clase Paciente (Nodo): Debe contener cedula (String), nombreCompleto (String), edad (int) y sintomaPrincipal (String).
    El Problema: Al finalizar el turno, el hospital necesita un reporte del total de pacientes atendidos y la lista completa en orden de atención.
    Reto: Implementa un método atenderTodos() que extraiga (dequeue) a cada paciente uno a uno, imprima su información al momento de ser atendido e imprima al final el total de pacientes procesados. */
    public static void main(String[] args) throws Exception {
        ColaPacientes colaPacientes = new ColaPacientes();
        Scanner datos = new Scanner(System.in);

        colaPacientes.enqueue(new Paciente("101","Juan",32,"Dolor de cabeza"));
        colaPacientes.enqueue(new Paciente("102","Maria",21,"Fiebre"));
        colaPacientes.enqueue(new Paciente("103","Carlos",50,"Dolor abdominal"));

        int opcion;

        do {

            System.out.println("\n--- URGENCIAS HOSPITALARIAS ---");
            System.out.println("1. Ver pacientes");
            System.out.println("2. Registrar paciente");
            System.out.println("3. Atender siguiente");
            System.out.println("4. Atender todos");
            System.out.println("5. Salir");

            opcion = datos.nextInt();
            datos.nextLine();

            switch(opcion) {

                case 1:
                    colaPacientes.imprimir();
                    break;

                case 2:

                    System.out.print("Cedula: ");
                    String cedula = datos.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = datos.nextLine();

                    System.out.print("Edad: ");
                    int edad = datos.nextInt();
                    datos.nextLine();

                    System.out.print("Sintoma: ");
                    String sintoma = datos.nextLine();

                    colaPacientes.enqueue(new Paciente(cedula,nombre,edad,sintoma));

                    break;

                case 3:

                    Paciente atendido = colaPacientes.dequeue();

                    if(atendido != null) {
                        System.out.println("Paciente atendido: " + atendido.nombreCompleto);
                    }

                    break;

                case 4:
                    colaPacientes.atenderTodos();
                    break;

                case 5:
                    System.out.println("fin");
                    break;

                default:
                    System.out.println("Opción incorrecta, intente de nuevo");
            }

        } while(opcion != 5);

        datos.close();
    }
}
