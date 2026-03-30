import java.util.Scanner;

public class Producto {
    int sku;
    String nombre;
    int stock;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Producto[] Productos = new Producto[2];

        for (int i = 0; i < Productos.length; i++) {
            System.out.println("\nProducto " + (i + 1));

            System.out.print("Ingrese el nombre: ");
            String nombre = scanner.next();

            System.out.print("Ingrese el sku: ");
            int sku = scanner.nextInt();

            System.out.print("Ingrese el stock: ");
            int stock = scanner.nextInt();

            Productos[i] = new Producto(sku, nombre, stock);
        }

        System.out.println("\n== Productos Ingresados ==");
        for (Producto p : Productos) {
            System.out.println(p);
        }

        shellSort(Productos);

        System.out.println("\n== Productos Ordenados por Sku ==");
        for (Producto p : Productos) {
            System.out.println(p);
        }

        System.out.print("\nIngrese el Sku a buscar: ");
        int SkuBuscar = scanner.nextInt();

        Producto encontrado = busquedaBinaria(Productos, SkuBuscar);

        if (encontrado != null) {
            System.out.println("Producto encontrado:");
            System.out.println(encontrado);
        } else {
            System.out.println("Producto no encontrado");
        }

        
        
    }

    public Producto(int sku, String nombre, int stock){
        this.nombre=nombre;
        this.sku =sku;
        this.stock=stock;
    }

    public static void shellSort(Producto[] Productos) {
        int n = Productos.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < n; i++) {
                Producto temp = Productos[i];
                int j = i;

                while (j >= gap && Productos[j - gap].sku > temp.sku) {
                    Productos[j] = Productos[j - gap];
                    j -= gap;
                }

                Productos[j] = temp;
            }
        }
    }

    public static Producto busquedaBinaria(Producto[] Productos, int skuBuscado) {
        int inicio = 0;
        int fin = Productos.length - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            if (Productos[medio].sku == skuBuscado) {
                return Productos[medio];
            }

            if (Productos[medio].sku < skuBuscado) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }

        return null;
    }

    

    @Override
    public String toString() {
        return "Producto {Sku=" + sku + ", Nombre=" + nombre + ", Stock=" + stock + "}";
    }
    
}
