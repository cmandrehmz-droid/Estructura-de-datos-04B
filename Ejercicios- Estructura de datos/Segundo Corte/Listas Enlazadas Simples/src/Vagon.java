public class Vagon {
 String Contenido; 
 double PesoToneladas;
 String Origen;
 String Destino;

 Vagon Siguiente;

 public Vagon(String Contenido, double PesoToneladas, String Origen, String Destino){
    this.Contenido = Contenido;
    this.PesoToneladas = PesoToneladas;
    this.Origen = Origen;
    this.Destino = Destino;
    this.Siguiente = null;
 }
}
