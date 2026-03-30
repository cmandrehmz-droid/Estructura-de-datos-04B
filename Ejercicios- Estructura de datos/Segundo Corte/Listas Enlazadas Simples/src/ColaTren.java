public class ColaTren {
    Vagon Cabeza;

    public ColaTren(){
        this.Cabeza = null;
    }

    public void agregarVagon(Vagon nuevoVagon) {

        if (Cabeza == null) {
        Cabeza = nuevoVagon;
        } else {
        Vagon actual = Cabeza;
        while (actual.Siguiente != null) {
            actual = actual.Siguiente;
        }
        actual.Siguiente = nuevoVagon;
        }
    }

    public double calcularPesoTotal() {
        double pesoTotal = 0.0;
        Vagon actual = Cabeza;

        while (actual != null) {
        pesoTotal += actual.PesoToneladas;
        actual = actual.Siguiente;
        }

        return pesoTotal;
    }
}
