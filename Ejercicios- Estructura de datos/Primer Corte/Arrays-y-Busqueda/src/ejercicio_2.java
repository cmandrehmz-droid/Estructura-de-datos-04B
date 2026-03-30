import java.util.ArrayList;
import java.util.List;
public class ejercicio_2 {
    // Buscador de Cédulas (Base de Datos Bancaria)
    // banco tiene una lista de 1.000 clientes organizados de forma estricta y ascendente por su número de cédula o ID.
    // Problema: Un cliente llega a la ventanilla y da su número.
    // sistema debe encontrar sus datos de la manera más rápida posible (en pocos pasos).
    //goritmo a usar: Búsqueda Binaria. Como los datos ya están ordenados, 
    //te algoritmo permitirá encontrar al cliente dividiendo la lista a la mitad en cada paso.
    public static void main(String[] args) {
        ArrayList <String> cedulas = new ArrayList<>();
        cedulas.add("1065878276");
        cedulas.add("1065878277");
        cedulas.add("1065878278");
        cedulas.add("1065878279");
        cedulas.add("1065878280");

        
        String objetivo = "1065878279";
        int indice = busquedaBinaria(cedulas, objetivo);

        if (indice >= 0) {
            System.out.println("Encontrada en índice " + indice + ": " + cedulas.get(indice));
        } else {
            System.out.println("No encontrada");
        }

        

    }

    
    public static int busquedaBinaria(List<String> lista, String objetivo) {
        int inicio = 0;
        int fin = lista.size() - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2; 
            String valorMedio = lista.get(medio);

            int cmp = valorMedio.compareTo(objetivo); 

            if (cmp == 0) {
                return medio;            
            } else if (cmp < 0) {
                inicio = medio + 1;      
            } else {
                fin = medio - 1;         
            }
        }
        return -1; 
    }

}
