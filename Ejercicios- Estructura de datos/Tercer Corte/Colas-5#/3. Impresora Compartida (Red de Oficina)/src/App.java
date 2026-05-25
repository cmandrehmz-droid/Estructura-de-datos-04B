import java.util.Scanner;
/* 3. Impresora Compartida (Red de Oficina)
En una oficina de arquitectura, varias computadoras comparten una única impresora de gran formato. Cada vez que alguien envía un documento, este se agrega al final de la cola de impresión. 
La impresora procesa los trabajos en el orden exacto en que fueron recibidos.
La Clase Documento (Nodo): Debe contener nombreArchivo (String), usuario (String), numeroPaginas (int) y esColor (boolean).
El Problema: Antes de imprimir, el jefe de oficina quiere saber cuántas páginas en total tiene la cola de impresión pendiente.
Reto: Implementa un método calcularPaginasTotales() que recorra la cola y retorne la suma de numeroPaginas de todos los documentos en espera, sin alterar la cola. */
public class App {
    public static void main(String[] args) throws Exception {
        ColaDocumento colaDocumentos = new ColaDocumento();
        Scanner datos = new Scanner(System.in);

        colaDocumentos.enqueue(new Documento("proyectoIntegrador.pdf","Juan",18,true));
        colaDocumentos.enqueue(new Documento("Maquetacion.pdf","Pepe",10,false));
        colaDocumentos.enqueue(new Documento("Macroeconomia.pdf","Camilo",25,true));

        int opcion;

        do {

            System.out.println("\n--- IMPRESORA COMPARTIDA ---");
            System.out.println("1. Ver cola");
            System.out.println("2. Agregar documento");
            System.out.println("3. Imprimir documento");
            System.out.println("4. Calcular páginas totales");
            System.out.println("5. Salir");

            opcion = datos.nextInt();
            datos.nextLine();

            switch(opcion) {

                case 1:
                    colaDocumentos.imprimir();
                    break;

                case 2:

                    System.out.print("Nombre archivo: ");
                    String nombre = datos.nextLine();

                    System.out.print("Usuario: ");
                    String usuario = datos.nextLine();

                    System.out.print("Número páginas: ");
                    int paginas = datos.nextInt();

                    System.out.print("¿Es a color? (true/false): ");
                    boolean color = datos.nextBoolean();

                    colaDocumentos.enqueue(new Documento(nombre,usuario,paginas,color));

                    break;

                case 3:

                    Documento impreso = colaDocumentos.dequeue();

                    if(impreso != null) {
                        System.out.println("Imprimiendo: " + impreso.nombreArchivo);
                    }

                    break;

                case 4:

                    int total = colaDocumentos.calcularPaginasTotales();

                    System.out.println("Total páginas pendientes: " + total);

                    break;

                case 5:
                    System.out.println("fin");
                    break;

                default:
                    System.out.println("Opcion incorrecta, intente de nuevo");
            }
        } while(opcion != 5);
    }
}
