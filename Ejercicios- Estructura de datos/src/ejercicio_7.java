import java.util.Arrays;
public class ejercicio_7 {
//Ejercicio 7 — Inventario compartido
//Un almacén tiene un arreglo con el stock de 5 productos. El sistema de ventas y el sistema de reportes apuntan al mismo arreglo.
//Crea el arreglo stockAlmacen con valores iniciales.
//Asigna stockReportes = stockAlmacen.
//Simula una venta reduciendo el stock de un producto desde stockReportes.
//Muestra que stockAlmacen también cambió y explica en comentarios por qué.
    public static void main(String[] args) {
        int[] StockAlmacen = {10,20,13,15,12};
        int[] Reportes = StockAlmacen;

        System.out.println("----------Antes de la venta----------");
        System.out.println("");
        System.out.println("Stock Almacen =" + Arrays.toString(StockAlmacen));
        System.out.println("Stock Almacen =" + Arrays.toString(Reportes));

        Reportes[2] -= 2;

        System.out.println("----------Despues de la venta----------");
        System.out.println("");
        System.out.println("Stock Almacen =" + Arrays.toString(StockAlmacen));
        System.out.println("Stock Reportes =" + Arrays.toString(Reportes));

    }
    //¿Porque cambiaron los dos arreglos?
    //Al ser arreglos de referencia son los mismo, que quiero decir, que no existen dos arreglos
    //solo existen dos nombres que señalan al mismo objeto, por esa razon que al hacer
    //Reportes[2] -= 2;
    //aunque pensemos que solo cambiara solo 1, cambiaran los 2 ya que son un mismo arreglo
    //y por ultimo terminan cambiando los 2 y se muestra el resultado como se ve al iniciar el programa.
}
