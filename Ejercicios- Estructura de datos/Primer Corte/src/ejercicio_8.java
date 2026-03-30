public class ejercicio_8 {
    //Ejercicio 8 — Historial de mensajes
    //Un chat guarda el último mensaje enviado. Se usan dos variables String:
    //ultimoMensaje = "Hola"
    //copiaTexto = ultimoMensaje
    //Luego copiaTexto se cambia a "¿Cómo estás?"
    //Muestra ambas variables y explica en un comentario por qué ultimoMensaje no cambió (inmutabilidad de String).
    public static void main(String[] args) {
        String UltimoMensaje = "Hola";
        String CopiaTexto = UltimoMensaje;
        CopiaTexto = "¿Como estas?";

        System.out.println(CopiaTexto);
        System.out.println(UltimoMensaje);
    }
    //Los Strings no cambian nunca.
    //Cada vez que intentas modificarlos, Java crea uno nuevo.
    //Por eso, aunque dos variables apunten al mismo String al inicio,cuando modificas una, 
    // esta pasa a apuntar a un nuevo objeto y la otra sigue igual.
}
