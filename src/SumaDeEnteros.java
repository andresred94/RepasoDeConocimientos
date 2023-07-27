// Programa que suma dos numeros
import java.util.Scanner;
public class SumaDeEnteros {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        //declaramos las variable sin inicializar
        int num1, num2, suma;

        System.out.println("Escribe el primer numero");
        num1 = entrada.nextInt();
        System.out.println("Escribe el segundo numero");
        num2 = entrada.nextInt();

        System.out.printf("La suma de ambos numeros es %d\n",(num1 + num2));

    }// final clase main
}// final de Suma de Enteros

