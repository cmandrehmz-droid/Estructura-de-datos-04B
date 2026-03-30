import java.util.Scanner;

public class Producto {
    String Nombre;
    double Precio;
    int Stock;
    int id;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Producto[] productos = new Producto[3];

        
        for (int i = 0; i < productos.length; i++) {
            System.out.println("\nProducto " + (i + 1));

            System.out.print("Ingrese el nombre: ");
            String nombre = scanner.next();

            System.out.print("Ingrese el precio: ");
            double precio = scanner.nextDouble();

            System.out.print("Ingrese el stock: ");
            int stock = scanner.nextInt();

            System.out.print("Ingrese el ID: ");
            int id = scanner.nextInt();

            productos[i] = new Producto(nombre, precio, stock, id);
        }

        
        System.out.println("\n== Productos Ingresados ==");
        for (Producto p : productos) {
            System.out.println(p);
        }

        
        shellSort(productos);

        System.out.println("\n== Productos Ordenados por ID ==");
        for (Producto p : productos) {
            System.out.println(p);
        }

        System.out.print("\nIngrese el ID a buscar: ");
        int idBuscar = scanner.nextInt();

        Producto encontrado = busquedaBinaria(productos, idBuscar);

        if (encontrado != null) {
            System.out.println("Producto encontrado:");
            System.out.println(encontrado);
        } else {
            System.out.println("Producto no encontrado");
        }

        scanner.close();
    }

    
    public Producto(String Nombre, double Precio, int Stock, int id) {
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.Stock = Stock;
        this.id = id;
    }

    
    public static void shellSort(Producto[] productos) {
        int n = productos.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < n; i++) {
                Producto temp = productos[i];
                int j = i;

                while (j >= gap && productos[j - gap].id > temp.id) {
                    productos[j] = productos[j - gap];
                    j -= gap;
                }

                productos[j] = temp;
            }
        }
    }

    
    public static Producto busquedaBinaria(Producto[] productos, int idBuscado) {
        int inicio = 0;
        int fin = productos.length - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            if (productos[medio].id == idBuscado) {
                return productos[medio];
            }

            if (productos[medio].id < idBuscado) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }

        return null;
    }

    
    @Override
    public String toString() {
        return "Producto {id=" + id + ", Nombre=" + Nombre + ", Precio=" + Precio + ", Stock=" + Stock + "}";
    }
}