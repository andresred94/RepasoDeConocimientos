import java.sql.SQLOutput;
import java.util.Scanner;

public class MostraElTiempo {
    public static void main(String[] args) {

        int segundosIngresados;
        Scanner teclado = new Scanner(System.in);

        System.out.println( "Ingresa una cierta cantidad de segundos" );
        segundosIngresados = teclado.nextInt();

        int horas = segundosIngresados / 3600;
        int segundosRestantes = segundosIngresados % 3600;
        int minutos = segundosRestantes / 60;
        int segundos = segundosRestantes % 60;

        System.out.printf("%d segundos son %d horas, %d minutos y %d segundos", segundosIngresados, horas , minutos , segundos );
        teclado.close();

    }
}
