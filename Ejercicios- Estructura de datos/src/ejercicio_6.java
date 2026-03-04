import java.util.concurrent.ThreadLocalRandom;
public class ejercicio_6 {
    //Ejercicio 6 — Turno en un banco
    //Un cajero de banco trabaja con el número del turno actual. Se crea una variable turnoActual y se asigna a turnoEnPantalla.
    //Demuestra con código que cambiar turnoEnPantalla no afecta a turnoActual (comportamiento por valor).
    //Explica en un comentario por qué ocurre esto.
    public static void main(String[] args) {
        int Turno;
        int TurnoMax = 100;
        int TurnoPantalla = 1;

        Turno = ThreadLocalRandom.current().nextInt(1, TurnoMax + 1 );

        System.out.println("Tu turno asignado es: N-" + Turno);
        System.out.println("Estamos en el turno N-"+TurnoPantalla);

        //Aunque este ejercicio puede ser mas complejo lo dejaremos asi.
        //La pregunta es ¿Porque la variabe TurnoPantalla no afecta a turno?
        //Al ser variables independientes cada una puede guardar un valor unico y ya que son variables con numero asignados
        //o que se le pueden asignar, son valores independientes que se usan sin afectar a la otra, dependiendo si queremos que
        //eso no pase.

    }
}
