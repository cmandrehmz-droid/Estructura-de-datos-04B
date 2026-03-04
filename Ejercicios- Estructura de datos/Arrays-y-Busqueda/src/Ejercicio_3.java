import java.util.ArrayList;

public class Ejercicio_3 {
    /* 3. Sensor de Temperatura (Control de Calidad)
    Una máquina industrial registra la temperatura cada 10 minutos y guarda los datos en un arreglo.
    El Problema: Al final del día, el supervisor quiere saber cuál fue la temperatura más alta registrada para asegurarse de que la máquina no se recalentó.
    Algoritmo a usar: Búsqueda Lineal de Máximo. Debes recorrer todo el arreglo comparando cada valor para encontrar el mayor de todos. */
    public static void main(String[] args) {
        double[] Temperatura = {60.5,69.3,66.3,57.3,67.3,30,70};

        double mayor = Temperatura[0];
       
        for(int i=0; i< Temperatura.length; i ++)
        {
            if (Temperatura[i]> mayor) {
                mayor =  Temperatura[i];
            }
        }
        System.out.println("La temperatura mas alta fue "+mayor);
    }
}
