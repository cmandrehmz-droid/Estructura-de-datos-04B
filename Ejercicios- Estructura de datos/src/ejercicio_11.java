import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;
public class ejercicio_11 {
    //Una aerolínea registra los nombres de los pasajeros de un vuelo en un arreglo de String con capacidad para 6 personas.
    //Llena el arreglo con nombres.
    //Recórrelo con un for e imprime el número de asiento y el nombre.
    //Muestra cuántos asientos están ocupados.
    
    public static void main(String[] args) {
        String[] asientos = new String[6];
        Scanner Scanner = new Scanner(System.in);
        for(int i=0;i<asientos.length;i++){
            System.out.println("Ingresa el Nombre del pasajero para el asiento A-"+i);
            String nombre = Scanner.nextLine();
            asientos[i] = nombre;
            System.out.println(Arrays.toString(asientos));
        }
    }
}
