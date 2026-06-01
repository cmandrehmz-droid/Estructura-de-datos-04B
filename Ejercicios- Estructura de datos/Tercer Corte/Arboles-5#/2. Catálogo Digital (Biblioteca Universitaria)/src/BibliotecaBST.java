public class BibliotecaBST {
    private Libro raiz;

    
    public void insertar(long isbn, String titulo, String autor, int anioPublicacion) {

        raiz = insertarRecursivo(
                raiz,
                isbn,
                titulo,
                autor,
                anioPublicacion
        );
    }

    private Libro insertarRecursivo(
            Libro actual,
            long isbn,
            String titulo,
            String autor,
            int anioPublicacion
    ) {

        
        if (actual == null) {
            return new Libro(
                    isbn,
                    titulo,
                    autor,
                    anioPublicacion
            );
        }

        
        if (isbn < actual.isbn) {

            actual.izquierda = insertarRecursivo(
                    actual.izquierda,
                    isbn,
                    titulo,
                    autor,
                    anioPublicacion
            );
        }

        
        else if (isbn > actual.isbn) {

            actual.derecha = insertarRecursivo(
                    actual.derecha,
                    isbn,
                    titulo,
                    autor,
                    anioPublicacion
            );
        }

        
        else {
            System.out.println("El ISBN ya existe.");
        }

        return actual;
    }

    
    public boolean existeISBN(long isbn) {
        return buscarISBN(raiz, isbn);
    }

    private boolean buscarISBN(Libro actual, long isbn) {

        
        if (actual == null) {
            return false;
        }

        
        if (actual.isbn == isbn) {
            return true;
        }

        
        if (isbn < actual.isbn) {
            return buscarISBN(actual.izquierda, isbn);
        }

        // Buscar derecha
        return buscarISBN(actual.derecha, isbn);
    }

    
    public void imprimirCatalogo() {
        inOrden(raiz);
    }

    private void inOrden(Libro actual) {

        if (actual != null) {

            // Izquierda
            inOrden(actual.izquierda);

            // Nodo actual
            System.out.println(
                    actual.isbn + " - " +
                    actual.titulo + " - " +
                    actual.autor
            );

            // Derecha
            inOrden(actual.derecha);
        }
    }
}