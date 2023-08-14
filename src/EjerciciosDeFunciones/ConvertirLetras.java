package EjerciciosDeFunciones;
import java.util.Scanner;

public class ConvertirLetras {
    // atributos
    String frase ="";
    Scanner input = new Scanner( System.in );
    // metodos constructores
    public void ConvertirLetras(){}

    // metodo para convertir las letras
    public void conversorDeLetras(){
        // atributos del metodo
        int opcion = 0;
        String frase="";// inicializamos el String para que no de errores

        // mensajes bienvenida
        System.out.println("Bienvenido al conversor de letras");
        System.out.println("Ingresa la frase que quieras convertir");

        // Primero leemos la frase que quiere modificar
        frase = input.nextLine();

        // iteración que con centinela en este caso (-1)
        while( opcion != -1 ){
            System.out.println("Para convertir en mayúscula = 1");
            System.out.println("Para convertir en minuscula = 2");
            System.out.println("Para salir presiona = -1");
            opcion = input.nextInt();// lee la opciones cogida

            // condificon if de doble seleccion, con dos condiciones
            if( opcion == 1 ){
                frase = frase.toUpperCase();
                System.out.println(frase);
            } else if( opcion == 2 ){
                frase = frase.toLowerCase();
                System.out.println(frase);
            }
        }// final while
    }// final conversorDeLetras
}// final clase ConvertirLetras
