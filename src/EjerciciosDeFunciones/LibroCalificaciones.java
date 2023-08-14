package EjerciciosDeFunciones;
import java.util.Scanner;

public class LibroCalificaciones {
    // atributos
    private String nombreDelCurso;

    // Constructor por defrecto
    public LibroCalificaciones(){}

    // Constructor que inicializa nombreDelCurso
    public LibroCalificaciones ( String nombre ) {
        nombreDelCurso = nombre;
    }// fin del constructor

    // método para establecer el nombre del curso
    public void establecerNombreDelCurso(){
        System.out.println("Introduce el nombre del curso");
        // objeto de la clase Scanner
        Scanner input = new Scanner(System.in);
        nombreDelCurso = input.nextLine();
    }// fin metodo establecerNombreDelCurso

    // método para obtener el nombre del curso
    public String obtenerNombreDelCurso(){
        return nombreDelCurso;
    }// fin del método obtenerNombreDelCurso

    public void mostrarMensajeBienvenida(){
        System.out.println( "Bienvenido al libro de calificaciones por cursos.");
    }// final método monstrarMensaje

    // mensaje de bienvenida
    public void mostrarMensaje(){
        System.out.printf( "Bienvenido al libro de calificaciones para\n%s!\n\n" ,
                obtenerNombreDelCurso() );
    }// final método monstrarMensaje

    // determina el promedio de un numero arbitrario de calificaciones
    public void determinarPromedioClase(){
        // objeto de la clase Scanner
        Scanner input = new Scanner(System.in);

        // variables locales del metodo
        int total;
        int contadorCalif;
        int calificacion;
        double promedio;

        // fase de inicializacion
        total = 0;
        contadorCalif = 0;

        // fase de procesamiento
        // pide la entrada por teclado y lee calificacion del usuario
        System.out.print( "Escriba calificacion o -1 para terminar: " );
        calificacion = input.nextInt();

        // itera hasta que lee el valor centinela (-1)
        while ( calificacion != -1 ){
            total = total + calificacion;
            contadorCalif = contadorCalif + 1;

            System.out.print( "Escriba calificacion o -1 para terminar: " );
            calificacion = input.nextInt();

        } // fin del while

        // fase de terminacion
        if (contadorCalif != 0){
            promedio = (double) total / contadorCalif;

        System.out.printf( "\nEl total de las %d calificaciones introducidas es %d\n",
                contadorCalif , total);
        System.out.printf( "El promedio de la clase es %.2f\n", promedio );
        }
        else System.out.println( "No se introdujeron calificaciones" );

    }// final metodo determinarPromedioClase

}// final LibroCalificaciones
