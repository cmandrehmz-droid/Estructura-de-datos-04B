public class ColaPacientes {
    private Paciente entrada;
    private Paciente salida;
    private int tamanio;

    public ColaPacientes() {

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

    public void enqueue(Paciente paciente) {

        if(isEmpty()) {
            salida = paciente;
            entrada = paciente;
        } else {
            entrada.siguiente = paciente;
            entrada = paciente;
        }

        tamanio++;
    }

    public Paciente dequeue() {

        if(isEmpty()) {
            System.out.println("La cola está vacía");
            return null;
        }

        Paciente paciente = salida;
        salida = salida.siguiente;

        if(salida == null) {
            entrada = null;
        }

        tamanio--;

        return paciente;
    }

    public void imprimir() {

        if(isEmpty()) {
            System.out.println("[ Cola vacía ]");
            return;
        }

        System.out.print("Salida < ");

        Paciente actual = salida;

        while(actual != null) {

            System.out.print("[" + actual.cedula + ": " + actual.nombreCompleto + " - " + actual.edad + " años - " + actual.sintomaPrincipal + "]");

            if(actual.siguiente != null) {
                System.out.print(" < ");
            }

            actual = actual.siguiente;
        }

        System.out.println(" < Entrada");
    }

    public void atenderTodos() {

        int atendidos = 0;

        while(!isEmpty()) {

            Paciente paciente = dequeue();

            System.out.println("\nAtendiendo paciente:");
            System.out.println("Cedula: " + paciente.cedula);
            System.out.println("Nombre: " + paciente.nombreCompleto);
            System.out.println("Edad: " + paciente.edad);
            System.out.println("Sintoma: " + paciente.sintomaPrincipal);

            atendidos++;
        }

        System.out.println("\nTotal de pacientes atendidos: " + atendidos);
    }
}
