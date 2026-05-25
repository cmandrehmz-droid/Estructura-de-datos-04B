public class ColaDocumento {
    private Documento entrada;
    private Documento salida;
    private int tamanio;

    public ColaDocumento() {

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

    public void enqueue(Documento documento) {

        if(isEmpty()) {
            salida = documento;
            entrada = documento;
        } else {
            entrada.siguiente = documento;
            entrada = documento;
        }

        tamanio++;
    }

    public Documento dequeue() {

        if(isEmpty()) {
            System.out.println("La cola está vacía");
            return null;
        }

        Documento documento = salida;
        salida = salida.siguiente;

        if(salida == null) {
            entrada = null;
        }

        tamanio--;

        return documento;
    }

    public void imprimir() {

        if(isEmpty()) {
            System.out.println("(Cola vacia)");
            return;
        }

        System.out.print("Salida < ");

        Documento actual = salida;

        while(actual != null) {

            System.out.print("[" + actual.nombreArchivo + " - " + actual.usuario + " - " + actual.numeroPaginas + " páginas - " + (actual.esColor ? "Color" : "Blanco y negro") + "]");

            if(actual.siguiente != null) {
                System.out.print(" < ");
            }

            actual = actual.siguiente;
        }

        System.out.println(" < Entrada");
    }

    public int calcularPaginasTotales() {

        int total = 0;

        Documento actual = salida;

        while(actual != null) {

            total += actual.numeroPaginas;

            actual = actual.siguiente;
        }
        return total;
    }
}
