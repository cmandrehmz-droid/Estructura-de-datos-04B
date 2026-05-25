public class ColaVehiculo {
    private Vehiculo entrada;
    private Vehiculo salida;
    private int tamanio;

    public ColaVehiculo() {

        this.entrada = null;
        this.salida = null;
        this.tamanio = 0;
    }

    public boolean isEmpty() {
        return salida == null;
    }

    public int size() {
        return tamanio;
    }

    public void enqueue(Vehiculo vehiculo) {

        if(isEmpty()) {
            salida = vehiculo;
            entrada = vehiculo;
        } else {
            entrada.siguiente = vehiculo;
            entrada = vehiculo;
        }

        tamanio++;
    }

    public Vehiculo dequeue() {

        if(isEmpty()) {
            System.out.println("La cola está vacía");
            return null;
        }

        Vehiculo vehiculo = salida;
        salida = salida.siguiente;

        if(salida == null) {
            entrada = null;
        }

        tamanio--;

        return vehiculo;
    }

    public void imprimir() {

        if(isEmpty()) {
            System.out.println("(Cola vacía)");
            return;
        }

        System.out.print("Salida < ");

        Vehiculo actual = salida;

        while(actual != null) {

            System.out.print("[" + actual.placa + " - " + actual.tipoVehiculo + " - $" + actual.tarifa + " - " + (actual.esExento ? "Exento" : "Paga") + "]");

            if(actual.siguiente != null) {
                System.out.print(" < ");
            }

            actual = actual.siguiente;
        }

        System.out.println(" < Entrada");
    }

    public void cerrarTurno() {

        double total = 0;

        while(!isEmpty()) {

            Vehiculo vehiculo = dequeue();

            System.out.println("Procesando vehículo: " + vehiculo.placa);

            if(!vehiculo.esExento) {
                total += vehiculo.tarifa;
            }
        }
        System.out.println("\nTotal recaudado: $" + total);
    }
}
