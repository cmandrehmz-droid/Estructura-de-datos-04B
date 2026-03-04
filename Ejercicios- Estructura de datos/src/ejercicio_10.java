import java.util.ArrayList;
import java.util.Arrays;
public class ejercicio_10 {
    //Una app tiene un objeto int[] configuracion = {1920, 1080, 60} (resolución y FPS).
    //Crea una copia real del arreglo (no una referencia) usando un nuevo arreglo y copiando elemento por elemento.
    //Modifica la copia y demuestra que el original no cambia.
    //Comenta la diferencia con la asignación directa.
    public static void main(String[] args) {
        int[] Configuracion = {1920, 1080, 60};
       int[] CopiaConfiguracion = Configuracion.clone();

        System.out.println("----------Antes del arreglo----------");
        System.out.println("");
        System.out.println("Arreglo Configuracion:"+ Arrays.toString(Configuracion));
        System.out.println("Arreglo de la COPIA de Configuracion:"+ Arrays.toString(CopiaConfiguracion));

        CopiaConfiguracion [0] = 3840;
        
        System.out.println();
        System.out.println("----------Despues del arreglo----------");
        System.out.println("");
        System.out.println("Arreglo Configuracion:"+ Arrays.toString(Configuracion));
        System.out.println("Arreglo de la COPIA de Configuracion:"+ Arrays.toString(CopiaConfiguracion));
    }
       //Asignar un arreglo directamente copia solo la referencia y ambos apuntan al mismo espacio de memoria;
       //en cambio, copiar o clonar el arreglo crea una nueva estructura independiente, 
       //de modo que modificar la copia no afecta al original.
}
