package EjerciciosDeFunciones;
import java.util.Scanner;
public class Analisis {
    // atributos
    Scanner input = new Scanner(System.in);

    // fase de inicializacion de variables
    int aprobados = 0;
    int reprobados = 0;
    int resultado;

    // metodo contructor
    public void Analisis (){}


    // metodo que imprime un mensaje de bienvenida y recibe el primer valor
    public void procesarEstudiantes () {
        System.out.println("Bienvenido al analizador de Instructores ");

        while ( resultado != -1 ) {
            System.out.print("Escriba el resultado (1 = aprobado, 2 = suspenso, -1 = salir): ");
            resultado = input.nextInt();
            if ( resultado == 1 ) {
                aprobados = aprobados + 1;
            } else if ( reprobados == 2 ){
              reprobados = reprobados + 1;
            }
        }// final while

        // fase de termiancion
        System.out.printf( "Aprobados: %d\nSuspensos: %d\n" , aprobados , reprobados );
        if ( aprobados > 8 )
            System.out.println( "¡Bono para el instructor!" );
    }// final metodo procesarEstudiantes

}// final clase Analisis
