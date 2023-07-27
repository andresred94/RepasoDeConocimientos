import java.util.Scanner;

/*
 * Compara enteros utilizando instrucciones if
 */

public class Comparacion {

    public static void main(String[] args) {
        // este es el objeto que lee por teclado
        Scanner entrada = new Scanner(System.in);

        int num1;
        int num2;

        // lectura del primer numero y la asginamos a la variable num1
        System.out.println("Escribe el primer numero");
        num1 = entrada.nextInt();

        // lectura del segundo numero y la asignamos a la varianle num2
        System.out.println("Escribe el segundo numero");
        num2 = entrada.nextInt();

        // comparaciones
        if ( num1 == num2 )
            System.out.printf("%d == %d\n", num1, num2 );

        if ( num1 != num2 )
            System.out.printf("%d != %d\n", num1, num2 );

        if ( num1 < num2 )
            System.out.printf("%d < %d\n", num1, num2 );

        if ( num1 > num2)
            System.out.printf("%d > %d\n", num1, num2 );

        if ( num1 <= num2 )
            System.out.printf("%d <= %d\n", num1, num2 );

        if ( num1 >= num2 )
            System.out.printf("%d >= %d\n", num1, num2 );

    }// final metodo main

}// fin de la clase comparacion
