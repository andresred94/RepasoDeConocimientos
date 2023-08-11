package EjerciciosDeFunciones;
import java.util.Scanner;

public class ComprobarPar {

    public static String esPar () {
        // Atributos
        String resultado = "";
        int numIngresado;
        Scanner input = new Scanner(System.in);

        // metodos
        System.out.println("Ingresa un numero");
        numIngresado = input.nextInt();

        if (numIngresado % 2 == 0)
            resultado = "El numero ingresado es par";

        if (numIngresado % 2 != 0)
            resultado = "El numero ingresado NO es par";

        return resultado;
    }

    public static void main(String[] args) {
        String resp = esPar();
        System.out.println(resp);


    }// final Main

}// final ComprobarPar


