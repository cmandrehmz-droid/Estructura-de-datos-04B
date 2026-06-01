/* La biblioteca de la universidad organiza su colección de libros en un BST usando el ISBN como clave única. Cada vez que ingresa un libro nuevo, se inserta automáticamente en el árbol. 
El sistema debe poder confirmar si un ISBN ya existe antes de registrar un nuevo ejemplar y listar toda la colección ordenada por ISBN.
La Clase Libro (Nodo): Debe contener isbn (long, clave del BST), titulo (String), autor (String) y anioPublicacion (int).
El Problema: Al final del semestre, el bibliotecario necesita imprimir el inventario completo ordenado de menor a mayor por ISBN para enviarlo a la sede central. 
También debe verificar si un ISBN específico ya existe en el catálogo antes de registrar una donación.
Reto: Implementa el método imprimirCatalogo() usando el recorrido InOrden para listar todos los libros en orden ascendente de ISBN (imprime isbn - titulo - autor). 
Además, implementa existeISBN(long isbn) que retorne true si el libro ya está registrado y false en caso contrario. */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       BibliotecaBST biblioteca = new BibliotecaBST();
        Scanner scanner = new Scanner(System.in);

        // DATOS DE PRUEBA
        biblioteca.insertar(
                97801,
                "Java Basico",
                "Carlos Perez",
                2020
        );

        biblioteca.insertar(
                97810,
                "Estructuras de Datos",
                "Ana Torres",
                2019
        );

        biblioteca.insertar(
                97805,
                "POO en Java",
                "Luis Gomez",
                2021
        );

        biblioteca.insertar(
                97820,
                "Bases de Datos",
                "Maria Lopez",
                2018
        );

        int opcion;

        do {

            System.out.println("\n--- SISTEMA DE BIBLIOTECA (BST) ---");
            System.out.println("1. Ver catálogo ordenado (InOrden)");
            System.out.println("2. Insertar nuevo libro");
            System.out.println("3. Buscar ISBN");
            System.out.println("4. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                // IMPRIMIR CATÁLOGO
                case 1:

                    System.out.println("\nCATÁLOGO ORDENADO:\n");

                    biblioteca.imprimirCatalogo();

                    break;

                // INSERTAR LIBRO
                case 2:

                    System.out.print("ISBN: ");
                    long isbn = scanner.nextLong();
                    scanner.nextLine();

                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();

                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();

                    System.out.print("Año de publicación: ");
                    int anio = scanner.nextInt();
                    scanner.nextLine();

                    // Verificar si existe
                    if (biblioteca.existeISBN(isbn)) {

                        System.out.println(
                                "El ISBN ya está registrado."
                        );

                    } else {

                        biblioteca.insertar(
                                isbn,
                                titulo,
                                autor,
                                anio
                        );

                        System.out.println(
                                "Libro insertado correctamente."
                        );
                    }

                    break;

                // BUSCAR ISBN
                case 3:

                    System.out.print("Ingrese el ISBN a buscar: ");

                    long buscar = scanner.nextLong();
                    scanner.nextLine();

                    if (biblioteca.existeISBN(buscar)) {

                        System.out.println(
                                "El ISBN SI existe en el catálogo."
                        );

                    } else {

                        System.out.println(
                                "El ISBN NO existe."
                        );
                    }

                    break;

                // SALIR
                case 4:

                    System.out.println(
                            "Saliendo del sistema..."
                    );

                    break;

                default:

                    System.out.println(
                            "Opción no válida."
                    );
            }

        } while (opcion != 4);

        scanner.close();
    }
}
