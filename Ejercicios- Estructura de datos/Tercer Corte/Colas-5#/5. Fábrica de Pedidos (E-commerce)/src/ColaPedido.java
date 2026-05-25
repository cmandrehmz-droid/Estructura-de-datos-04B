public class ColaPedido {
    private Pedido entrada;
    private Pedido salida;
    private int tamanio;

    public ColaPedido() {

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

    public void enqueue(Pedido pedido) {

        if(isEmpty()) {
            salida = pedido;
            entrada = pedido;
        } else {
            entrada.siguiente = pedido;
            entrada = pedido;
        }

        tamanio++;
    }

    public Pedido dequeue() {

        if(isEmpty()) {
            System.out.println("La cola está vacía");
            return null;
        }

        Pedido pedido = salida;

        salida = salida.siguiente;

        if(salida == null) {
            entrada = null;
        }

        tamanio--;

        return pedido;
    }

    public void imprimir() {

        if(isEmpty()) {
            System.out.println("[ Cola vacía ]");
            return;
        }

        System.out.print("Salida < ");

        Pedido actual = salida;

        while(actual != null) {

            System.out.print("[" + actual.numeroPedido + " - " + actual.cliente + " - $" + actual.totalPagar + " - " + (actual.cancelado ? "Cancelado" : "Activo") + "]");

            if(actual.siguiente != null) {
                System.out.print(" < ");
            }

            actual = actual.siguiente;
        }

        System.out.println(" < Entrada");
    }

    public void procesarPedidos() {

        int despachados = 0;
        int cancelados = 0;

        while(!isEmpty()) {

            Pedido pedido = dequeue();

            if(pedido.cancelado) {

                System.out.println("Pedido descartado: " + pedido.numeroPedido);
                cancelados++;

            } else {

                System.out.println("\nDespachando pedido:");
                System.out.println("Número: " + pedido.numeroPedido);
                System.out.println("Cliente: " + pedido.cliente);
                System.out.println("Total: $" + pedido.totalPagar);

                despachados++;
            }
        }

        System.out.println("\nTotal despachados: " + despachados);
        System.out.println("Total cancelados: " + cancelados);
    }
}
