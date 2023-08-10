package EjerciciosDeFunciones;

public class CalcularVolumenTriangulo {

    /**
     *
     * @param radio
     * @return calcula el area de un circulo
     */
    public static double areaCirculo (double radio){
        final double pi = Math.PI;
        return pi * Math.pow(radio,2);
    }

    /**
     *
     * @param radio es el radio del cono
     * @param generatriz es la generatriz del cono
     * @return resultado la altura de un triangulo
     */
    public static double calcularAltura (double radio, double generatriz){
        return Math.sqrt( Math.pow(generatriz,2) - Math.pow(radio,2) );
    }

    /**
     *
     * @param radio del cono
     * @param generatriz del cono
     * @return resultado es el volumen de un cilindro equivalente
     */
    public static double volumenCirculo (double radio, double generatriz){
        return areaCirculo(radio) * calcularAltura(radio,generatriz);
    }

    public static double volumenCono (double radio, double generatriz){
        return (volumenCirculo(radio,generatriz))/3;
    }


    public static void main(String[] args) {
        double resultado = volumenCono(5,10);
        System.out.printf("%.2f\n" , resultado);

    }// final metodo main

}// final Calcular Volumen Triangulo


