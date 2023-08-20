package EjerciciosDeFunciones;

import CasosDePrueba.FuncionesDeCasos;

public class PruebasDeClases {
    public static void main(String[] args) {

        //  Pruebas de LibroDeCalificaciones
        /*LibroCalificaciones miLibro = new LibroCalificaciones();

        miLibro.mostrarMensajeBienvenida();// mensaje de Bienvenida
        miLibro.establecerNombreDelCurso();// establece el nombre del curso
        miLibro.determinarPromedioClase();// calcula el promedio de las notas*/

        // Pruebas de Analisis
        /*Analisis instructor1 = new Analisis();
        instructor1.procesarEstudiantes();*/

        // Pruenas de ConvertirLetras
        /*ConvertirLetras prueba1 = new ConvertirLetras();
        prueba1.conversorDeLetras();*/

        testIntervalo1DentroDelRango();
        testIntervalo1FueraDelRango();
        testIntervalo1LimiteInferior();
        testIntervalo1LimiteSuperior();

    }// final del método Main

    public static void testIntervalo1DentroDelRango() {
        FuncionesDeCasos funciones = new FuncionesDeCasos();
        int num = 5;
        boolean resultado = funciones.intervalo1(num);
        assertTrue(resultado);
    }

    public static void testIntervalo1FueraDelRango() {
        FuncionesDeCasos funciones = new FuncionesDeCasos();
        int num = 8;
        boolean resultado = funciones.intervalo1(num);
        assertFalse(resultado);
    }

    public static void testIntervalo1LimiteInferior() {
        FuncionesDeCasos funciones = new FuncionesDeCasos();
        int num = 3;
        boolean resultado = funciones.intervalo1(num);
        assertFalse(resultado);
    }

    public static void testIntervalo1LimiteSuperior() {
        FuncionesDeCasos funciones = new FuncionesDeCasos();
        int num = 7;
        boolean resultado = funciones.intervalo1(num);
        assertTrue(resultado);
    }

    // Métodos auxiliares para las afirmaciones
    public static void assertTrue(boolean condition) {
        if (condition) {
            System.out.println("Test exitoso.");
        } else {
            System.out.println("Test fallido.");
        }
    }

    public static void assertFalse(boolean condition) {
        if (!condition) {
            System.out.println("Test exitoso.");
        } else {
            System.out.println("Test fallido.");
        }
    }

}// final de PruebasDeClases
