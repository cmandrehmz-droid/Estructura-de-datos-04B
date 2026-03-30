import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        int[] Pesos = new int[7];
        int peso;
        Scanner sc = new Scanner(System.in);
        int Opcion;
        int mayor = Pesos [0];
        System.out.println("Bienvenido al Gimnasio");
        System.out.println("\n Ingrese los pesos que desea ingresar");

        for(int i=0; i< Pesos.length;i++){

            System.out.println("Ingrese el peso #"+(i+1));
            peso = sc.nextInt();
            Pesos[i]=peso;
        }

        System.out.println("\n Puntajes sin Organizar");
        for (int i : Pesos) {
            System.out.println(i);
        }

        insertionSort(Pesos);

        System.out.println("\n Puntajes Ordenados");
        for (int i : Pesos) {
            System.out.println(i);
        }

        System.out.println("\n Ingrese el peso que desea buscar");
        int busqueda = sc.nextInt();
        int posicion =busquedaLineal(Pesos, busqueda);
        
        if (posicion != -1) {
            System.out.println("El peso ha sido encontrado con exito en la posicion: "+posicion);
        }
        else{
            System.out.println("El peso que esta buscando no ha sido levantado");
        }

        for(int i=0; i< Pesos.length; i ++)
        {
            if (Pesos[i]> mayor) {
                mayor =  Pesos[i];
            }
        }
        System.out.println("El peso mas alto levantado fue "+mayor);
    }

    public static int busquedaLineal(int[] arr, int valor) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valor) {
                return i;
            }

        }
        return -1;
    }

     public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int actual = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] < actual) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = actual;
        }
    }
    
}
