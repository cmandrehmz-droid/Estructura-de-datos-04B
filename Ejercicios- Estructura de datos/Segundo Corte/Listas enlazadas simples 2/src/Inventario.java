public class Inventario {
    Producto Cabeza;

    public Inventario(){
        this.Cabeza = null;
    }

    public void InsertarProducto(String Nombre, int Cantidad, int DiasParaVencer){
        Producto Nuevo = new Producto(Nombre, Cantidad, DiasParaVencer);

        if (DiasParaVencer < 3) {
            Nuevo.Siguiente = Cabeza;
            Cabeza = Nuevo;
        }
        else {
            if (Cabeza == null) {
                Cabeza = Nuevo;
            } else {
                Producto actual = Cabeza;
                while (actual.Siguiente != null) {
                    actual = actual.Siguiente;
                }
                actual.Siguiente = Nuevo;
            }
        }
    }

    
    public void imprimirProductos() {
        if (Cabeza == null) {
            System.out.println("No hay productos en el inventario.");
            return;
        }

        Producto actual = Cabeza;

        System.out.println(" Lista de productos:");

        while (actual != null) {
            System.out.println(
                "Nombre: " + actual.Nombre +
                " | Cantidad: " + actual.Cantidad +
                " | Días para vencer: " + actual.DiasParaVencer
            );
            actual = actual.Siguiente;
        }
    }

    
    public void imprimirProximosAVencer() {
            Producto actual = Cabeza;
            System.out.println("Productos con menos de 5 días para vencer:");

            while (actual != null) {
                if (actual.DiasParaVencer < 5) {
                    System.out.println(
                        "Nombre: " + actual.Nombre +
                        ", Cantidad: " + actual.Cantidad +
                        ", Días para vencer: " + actual.DiasParaVencer
                    );
                }
                actual = actual.Siguiente;
        }
    }


}