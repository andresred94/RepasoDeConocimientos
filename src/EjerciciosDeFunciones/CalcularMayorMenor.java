package EjerciciosDeFunciones;

public class CalcularMayorMenor {
    /**
     *
     * @param n primer numero
     * @param m segundo numero
     * @return retorna el valor más bajo
     */
    public static int numeroMenor (int n, int m){
        return (m + n - Math.abs (m - n))/2;
    }

    /**
     *
     * @param a un numero entero
     * @param b un numero entero
     * @return El resultado es el valor mas alto
     */
    public static int numeroMayor (int a, int b){
        return (a + b + Math.abs (a - b))/2;
    }



}
