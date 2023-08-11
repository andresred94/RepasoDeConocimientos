package EjerciciosDeFunciones;

public class ComprobarMultiplo {


    // funciones

    /**
     * Funcion que comprueba si ambos numeros ingresados por parametros son multiplos
     * @param num1
     * @param num2
     * @return String resultado
     */
    public static String esMultiplo (int num1 , int num2 ){
    String resultado = "";
    if ( (num1 % num2) == 0 )
        resultado = "El numero " + num1 + " es multiplo de " + num2;

    if ( (num1 % num2) != 0)
        resultado = "El numero " + num1 + " NO es multiplo de " + num2;
        return resultado;
    }

    public static void main(String[] args) {
        String resp = "";
        resp = esMultiplo(55550,55);
        System.out.println(resp);

    }// final Main

}// final ComprobarMultiplo
