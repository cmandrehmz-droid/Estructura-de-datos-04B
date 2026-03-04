import java.util.Scanner;
//Ejercicio 1 — Ficha de un estudiante
//Un sistema universitario necesita registrar la información básica de un estudiante: 
// nombre completo, código (número entero), semestre actual, promedio acumulado y si está matriculado o no.
//Declara las variables con los tipos de datos apropiados.
//Asigna valores de ejemplo.
//Imprime un reporte por consola con el siguiente formato:
public class ejercicio_1 {
public static void main(String[] args) {

        System.out.print(" Ingresa tu nombre completo ");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        System.out.println("Ingresa tu I.D");
        String cedula = sc.nextLine();
        System.out.println("Ingresa tu semestre actual");
        String semestre = sc.nextLine();
        System.out.println("Ingresa tu promedio acumulado");
        String promedio = sc.nextLine();
        System.out.println("¿Usted esta matriculado?");
        String matriculado = sc.nextLine();

        System.out.println();

        System.out.println(" hola " + nombre);
        System.out.println("ID:" + cedula);
        System.out.println("Semestre:" + semestre);
        System.out.println("Promedio:" + promedio);
        System.out.println("Matriculado:" + matriculado);
    }
}
