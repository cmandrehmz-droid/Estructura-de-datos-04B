public class Producto {
    String Nombre;
    int Cantidad;
    int DiasParaVencer;
    Producto Siguiente;
    
    public Producto(String Nombre, int Cantidad, int DiasParaVencer){
        this.Nombre= Nombre;
        this.Cantidad = Cantidad;
        this.DiasParaVencer = DiasParaVencer;
        this.Siguiente = null;
    }
}
