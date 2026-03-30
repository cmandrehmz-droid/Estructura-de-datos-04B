import java.util.Scanner;

public class CompetenciaAtletismo {
    double Puntaje;

    public static void main(String[] args) {

        double[] Puntajes = new double[6];
        Scanner sc = new Scanner(System.in);

       
        for (int i = 0; i < Puntajes.length; i++) {

            System.out.println("\nBienvenido a la Competencia de Atletismo");
            System.out.println("Ingrese el puntaje del Competidor " + (i + 1) + ":");

            Puntajes[i] = sc.nextDouble();
        }

        
        System.out.println("\nPuntajes sin organizar:");
        for (double d : Puntajes) {
            System.out.println(d);
        }

        
        insertionSort(Puntajes);

        
        System.out.println("\nPuntajes ordenados:");
        for (double d : Puntajes) {
            System.out.println(d);
        }

        
        System.out.print("\nIngrese el puntaje a buscar: ");
        double buscar = sc.nextDouble();

        int posicion = busquedaLineal(Puntajes, buscar);

        if (posicion != -1) {
            System.out.println("Puntaje encontrado en la posición: " + posicion);
        } else {
            System.out.println("Puntaje no encontrado");
        }

        sc.close();
    }

    
    public static void insertionSort(double[] arr) {
        for (int i = 1; i < arr.length; i++) {
            double actual = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > actual) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = actual;
        }
    }

   
    public static int busquedaLineal(double[] arr, double valor) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    
    @Override
    public String toString() {
        return "Puntaje: " + Puntaje;
    }
}