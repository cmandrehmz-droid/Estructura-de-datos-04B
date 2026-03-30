import java.util.Scanner;

public class ControlNotas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[] notas = new double[5];

        
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Ingrese la nota #" + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

       
        System.out.println("\nNotas ingresadas:");
        for (double n : notas) {
            System.out.println(n);
        }

        
        double mayor = notas[0];
        double menor = notas[0];

        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > mayor) {
                mayor = notas[i];
            }
            if (notas[i] < menor) {
                menor = notas[i];
            }
        }

        System.out.println("\nNota más alta: " + mayor);
        System.out.println("Nota más baja: " + menor);

        
        selectionSort(notas);

        System.out.println("\nNotas ordenadas de menor a mayor:");
        for (double n : notas) {
            System.out.println(n);
        }

        sc.close();
    }

    
    public static void selectionSort(double[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int indiceMin = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[indiceMin]) {
                    indiceMin = j;
                }
            }

            
            double temp = arr[i];
            arr[i] = arr[indiceMin];
            arr[indiceMin] = temp;
        }
    }
}
