public class ManerasDeImprimirEnPantalla {
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_RESET = "\u001B[0m";
    /**
     * Exsplicando los distintos tipos de impresion en pantalla que hay
     * @param args
     */
    public static void main(String[] args) {

        //Distintas maneras de imprimir texto

        // imprime sin cambiar de linea
        System.out.print("Bienvenido a ");

        //coloca el cursor de sallida al inicio de la siguiente linea
        System.out.println("la programacion en Java");

        //La secuencua de escape \n indica que se imprime en la siguiente linea
        System.out.println(ANSI_RED+"Esta \nSecuencia \nimprime en la siguiente linea");

        //La secuencia de escape \t desplaza el cursor hasta la siguiente posicion de tabulacion
        System.out.println(ANSI_BLUE+"\tEsto se imprime en la sigueinte posicion de tabulacion");

        //La secuencia de escape \r coloca el cursor de la pantalla al inicio de la linea actual
        System.out.println(ANSI_YELLOW+"Este texto se sustituye por la siguiente \ry se muestra este texto al incio" +
                " de la linea"+ANSI_RESET);

        //Cuando utilizamos \\ imprimimos el caracter \ o cualquier otro
        System.out.println("\"entre comillas\""+"Tambien podemos imprimir \\ usando doble "+"\\");

        //Si queremos indicar el formato de la impresion usamos printf, en este caso dos String
        System.out.printf(ANSI_PURPLE+"%s%s", "Este es el primer String", " Este es el segundo String");//

    }// final del metodo main
}// fin de la clase Main