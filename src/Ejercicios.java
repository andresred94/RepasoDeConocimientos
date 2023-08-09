import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Ejercicio 1
        /*int x = 2;
        int y = 3;

        System.out.printf( "x = %d\n", x );
        System.out.printf( "El valor de %d + %d es %d\n", x, y, ( x + y ) );
        System.out.printf( "x = %d\n",  );
        System.out.printf( "%d = %d\n", ( y - x ), ( x + y ));*/

        // Ejercicio 2
        /**
         * Escribe una aplicacion que pida al usuario que escriba dos enteros,
         * que obtenga los numeros del usuario e imprima la suma, producto,
         * diferencia y cociente de los numeros
         */
        /*int num1, num2, suma, multi, resta, cociente;
        System.out.println( "Ingresa dos numeros enteros" );
        System.out.println( "Escribe el primer numero y presiona enter" );
        num1 = entrada.nextInt();
        System.out.println( "Escribe el segundo numero y presiona enter" );
        num2 = entrada.nextInt();
        suma = num1 + num2;
        System.out.printf( "La suma es %d\n" , suma );
        multi = num1 * num2;
        System.out.printf( "El producto de ambos numeros es %d\n" , multi );
        resta = num1 - num2;
        cociente = num2 % num2;
        System.out.printf( "La resta entre ambos numeros es %d\n" , resta);
        System.out.printf( "El cociente de ambos numeros es %d\n" , cociente);*/

        // Ejercicio 3

        /*System.out.print("*********"+"\t ***"+"\t   *"+"\t    *");
        System.out.print("\n*\t\t*"+"  *\t *"+"\t  ***"+"\t   * *");
        System.out.print("\n*\t\t*"+" *\t\t  *"+"\t *****"+"\t  *\t  *");
        System.out.print("\n*\t\t*"+" *\t\t  *"+"\t   *"+"\t *\t   *");
        System.out.print("\n*\t\t*"+" *\t\t  *"+"\t   *"+"\t*\t    *");
        System.out.print("\n*\t\t*"+" *\t\t  *"+"\t   *"+"\t *\t   *");
        System.out.print("\n*\t\t*"+" *\t\t  *"+"\t   *"+"\t  *\t  *");
        System.out.print("\n*\t\t*"+"  *\t *"+"\t   *"+"\t   * *");
        System.out.print("\n*********"+"\t ***"+"\t   *"+"\t    *");*/

        // Ejercicio 4
        /**
         * Escribe una aplicacion que pida al usuario oque escriba dos enteros, que obtenga los numeros
         * del usuario y muestre el más grande, seguido de las palabras "es más grande". Si son iguales
         * imprima el mensaje "Estos números son iguales"
         */
        /*int num1, num2;
        System.out.println( "Ingresa el primer número y presiona enter" );
        num1 = entrada.nextInt();
        System.out.println( "Ingresa el segundo número y presiona enter" );
        num2 = entrada.nextInt();

        if ( num1 == num2 )
        System.out.printf("Los dos numeros son iguales\n");

        if ( num1 > num2 )
        System.out.printf("%d es más grande que %d\n" , num1 , num2);

        if ( num2 > num1 )
        System.out.printf("%d es más grande que %d\n" , num2 , num1);*/

        // Ejercicio 5
        /**
         * Escribe unaa aplicacion que recuba tres enteros del usuario y muestre la suma,
         * promedio, producto, el menor y el mayor de esos numeros.
         */

        /*int num1, num2, num3, sum, prom, prod, comp;

        System.out.println( "Ingresa el primer numero y presiona enter" );
        num1 = entrada.nextInt();

        System.out.println( "Ingresa el segundo numero y presiona enter" );
        num2 = entrada.nextInt();

        System.out.println( "Ingresa el tercer numero y presiona enter" );
        num3 = entrada.nextInt();

        sum = num1 + num2 + num3;
        prom = (num1 + num2 + num3) / 3;
        prod = num1 * num2 * num3;
        System.out.printf( "La suma de los tres numero es %d\n" , sum );
        System.out.printf( "El promedio de los tres numeros es %d\n" , prom );
        System.out.printf( "El producto de los tres numeros es %d\n" , prod );

        if ( num1 > num2 & num1 > num3 & num2 > num3)
            System.out.printf( "El numero mayor es %d y el numero menor es %d" , num1 , num3 );

        if ( num1 > num2 & num1 > num3 & num3 > num2)
            System.out.printf( "El numero mayor es %d y el numero menor es %d" , num1 , num2 );

        if ( num2 > num1 & num2 > num3 & num1 > num3 )
            System.out.printf( "El numero mayor es %d y el numero menor es %d" , num2 , num3 );

        if ( num2 > num1 & num2 > num3 & num3 > num1 )
            System.out.printf( "El numero mayor es %d y el numero menor es %d" , num2 , num1 );

        if ( num3 > num2 & num3 > num1 & num1 > num2)
            System.out.printf( "El numero mayor es %d y el numero menor es %d" , num3 , num2 );

        if ( num3 > num2 & num3 > num1 & num2 > num1)
            System.out.printf( "El numero mayor es %d y el numero menor es %d" , num3 , num1 );*/


    }// final del metodo main

}// final de la clase ejercicios

