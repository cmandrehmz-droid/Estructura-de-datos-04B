import java.util.Arrays;
public class ejercicio_9 {
//Ejercicio 9 — Notas de un curso
//Un profesor tiene las notas de 4 estudiantes en un arreglo. El coordinador recibe una referencia al mismo arreglo para revisarlas.
//El coordinador corrige la nota del estudiante 2 (índice 1) de 2.5 a 3.0.
//Muestra que el arreglo del profesor también refleja el cambio.
//Añade comentarios explicando el concepto de referencia en memoria.
    public static void main(String[] args) {
        double[] Notas = {3.0, 4.0, 5.0};

        double[]CoordinadorNotas = Notas;

        System.out.println("Notas antes de la correccion");
        System.out.println("Notas (profesor): "+ Arrays.toString(Notas));
        System.out.println("Notas (coordinador):"+ Arrays.toString(CoordinadorNotas));

        CoordinadorNotas[2] = 3.0;

        System.out.println("Notas despues de la correccion");
        System.out.println("Notas (profesor): "+ Arrays.toString(Notas));
        System.out.println("Notas (coordinador):"+ Arrays.toString(CoordinadorNotas));

        
    }
    
    // Como el profesor y el coordinador comparten la misma referencia al mismo arreglo,
    // al corregir la nota desde la referencia del coordinador, el arreglo del profesor
    // también muestra el cambio porque ambos apuntan al mismo objeto en memoria.

}
