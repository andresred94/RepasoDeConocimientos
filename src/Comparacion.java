import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

/*
 * Compara enteros utilizando instrucciones if
 */

public class Comparacion {

    public static void main(String[] args) {
        // este es el objeto que lee por teclado
        /*Scanner entrada = new Scanner(System.in);

        int num1;
        int num2;*/

        // lectura del primer numero y la asginamos a la variable num1
        /*System.out.println("Escribe el primer numero");
        num1 = entrada.nextInt();*/

        // lectura del segundo numero y la asignamos a la varianle num2
        /*System.out.println("Escribe el segundo numero");
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
            System.out.printf("%d >= %d\n", num1, num2 );*/


        //  Lectura de expresiones Boolean
        /*final boolean cierto = false;
        final boolean falso = true;

        boolean prueba11 = cierto && true;
        boolean prueba12 = cierto || falso;
        boolean prueba13 = cierto && ! falso;
        boolean prueba14 = falso && cierto || falso;
        boolean prueba15 = ! cierto && ! falso;
        boolean prueba16 = !(cierto && ! falso);

        System.out.println(prueba11);
        System.out.println(prueba12);
        System.out.println(prueba13);
        System.out.println(prueba14);
        System.out.println(prueba15);
        System.out.println(prueba16);*/

        // Lectura de expresiones Double
        /*final double pi = 3.141493;
        double m = 30.0;
        double n = 7.0;
        double ñ = 0.07e+3;

        double prueba21 = Math.abs (-m);
        double prueba22 = Math.pow (n,2);
        double prueba23 = Math.pow (2,-2);
        double prueba24 = Math.sqrt (m);
        double prueba25 = Math.sin (0);
        double prueba26 = Math.cos (pi);
        double prueba27 = Math.tan (pi/4);
        double prueba28 = ñ / n;
        double prueba29 = Math.PI;

        System.out.println(prueba21);
        System.out.println(prueba22);
        System.out.println(prueba23);
        System.out.println(prueba24);
        System.out.println(prueba25);
        System.out.println(prueba26);
        System.out.println(prueba27);
        System.out.println(prueba28);
        System.out.println(prueba29);*/

        // Lectura de expresiones Char
        /*final char cero = '0';
        final char a = 'a';
        char letra = 'E';
        char numero = '4';

        char prueba31 = cero + 1;
        char prueba32 = '4' - 1;
        char prueba33 = a + 'E' - 'A';
        char prueba34 = 'A' + a - 'a';

        System.out.println(prueba31);
        System.out.println(prueba32);
        System.out.println(prueba33);
        System.out.println(prueba34); */

        // lectura expresiones con char double int
        /*final double pi = 3.141593;
        final char cero = '0';
        final char  a = 'a';
        char letra = 'E';
        char numero = '4';
        int x = 365;
        int z = 7;

        double prueba41 = (double) x;
        int prueba42 = (int) pi;
        int prueba43 = (int) ( 3.86 );
        int prueba44 = (int) ( pi + 0.5 );
        int prueba45 = (int) ( 3.86 + 0.5 );
        int prueba46 = (int) cero;
        char prueba48 = (char) ( (int) numero - 1 );
        char prueba49 = (char) ( a + letra - 'A');
        int prueba410 = (int) Math.pow (z,2);

        System.out.println(prueba41);// 365.0
        System.out.println(prueba42);// 3
        System.out.println(prueba43);// 3
        System.out.println(prueba44);// 3
        System.out.println(prueba45);// 4
        System.out.println(prueba46);// 48
        System.out.println(prueba48);// 3
        System.out.println(prueba49);// e
        System.out.println(prueba410);// 49*/












    }// final metodo main

}// fin de la clase comparacion
