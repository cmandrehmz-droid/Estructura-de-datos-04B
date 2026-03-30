import java.util.ArrayList;
import java.util.List;
public class Ejercicio_1 {
        // 1. El Cajero del Supermercado (Inventario)
        //Un cajero escanea un producto con el código de barras 770123. 
        //El sistema tiene un arreglo desordenado con los códigos de los productos disponibles en la estantería actual.
       // El Problema: Debes recorrer la lista para verificar si el producto existe y en qué posición de la estantería se encuentra.
        //Algoritmo a usar: Búsqueda Lineal. Es el ideal porque los productos en la estantería no tienen un orden numérico específico. 
    
    public static void main(String[] args) throws Exception 
    {
       List<String> Inventario = new ArrayList<>();
        
       Inventario.add("B06123G");
       Inventario.add("B16123G");
       Inventario.add("B26123G");
       Inventario.add("B36123G");

       String codigo = "B16123G";
       boolean Encontrado = false;
       int posicion = -1;
       for (int i = 0 ; i<Inventario.size(); i++){
        if (Inventario.get(i).equals(codigo)){
            posicion=i;
            break;
        }

       }
       
       for (String string : Inventario) {
        if (string.equals(codigo)) {
            Encontrado = true;
            
            break; 
        }
       }

        if ( Encontrado == true) {
            System.out.println("El dato: " +codigo+ ". ha sido encontrado con exito en la Estanteria, posicion:"+posicion);
        }
        else{
            System.out.println("El dato: " +codigo+ ". no ha sido encontrado:"+Encontrado);
        }
    }
        
}
