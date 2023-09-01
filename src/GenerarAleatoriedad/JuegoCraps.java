package GenerarAleatoriedad;
import java.util.Random;
public class JuegoCraps {
    private static final Random numalea = new Random();

    private enum Estado {CONTINUA , GANO , PIERDE};

    private static final int DOS_UNOS = 2;
    private static final int TRES = 3;
    private static final int SIETE = 7;
    private static final int ONCE = 11;
    private static final int DOCE = 12;

    public void generarCraps() {
        int miPunto = 0;
        Estado estadoJuego;

        int sumaDeDados = tirarDados();

    //determina el estado del juego
        switch ( sumaDeDados ){
            case SIETE:
            case ONCE:
                estadoJuego = Estado.GANO;
                break;
            case DOS_UNOS:
            case TRES:
            case DOCE:
                estadoJuego = Estado.PIERDE;
                break;
            default:
                estadoJuego = Estado.CONTINUA;
                miPunto = sumaDeDados;
                System.out.printf("El punto es %d\n",miPunto);
                break;
        }// final switch

        // mientras el juego no termine
        while ( estadoJuego == Estado.CONTINUA){
            sumaDeDados = tirarDados();// tira los dados de nuevo

            if ( sumaDeDados == miPunto){
                estadoJuego = Estado.GANO;
            } else if ( sumaDeDados == SIETE){
                estadoJuego = Estado.PIERDE;
            }// final if
        }// final While

        if (estadoJuego == Estado.GANO) {
            System.out.print("El jugador gana");
        }else {
            System.out.println("El jugador pierde");
        }
    }// final metodo generarCraps
    public int tirarDados() {
        int dado1 = 1 + numalea.nextInt(6);
        int dado2 = 1 + numalea.nextInt(6);

        int suma = dado1 + dado2;

        System.out.printf("El jugador tiró %d + %d = %d\n", dado1, dado2, suma);
        return suma;
    }// final metodo tirarDados
}// final clase JuegoCraps