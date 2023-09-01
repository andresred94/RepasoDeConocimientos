package AlcanceDeclaraciones;

public class Alcance {

    private static int x = 1;

    public static void main(String[] args) {
        int x = 5;

        System.out.printf( "La x local en main es %d\n", x );

        usarVariablelocal();
        usarCampo();
        usarVariablelocal();
        usarCampo();

        System.out.printf("\nla x local en main es %d\n",x);


    }// final metodo main

    private static void usarCampo() {
        System.out.printf( "\nel campo x al entrar en el metodo usarCampo es %d\n",x );
        x*=10;

        System.out.printf( "el campo antes de salir del metodo usarCampo es %d\n",x );

    }// final metodo usarCampo

    private static void usarVariablelocal() {
        int x = 25;

        System.out.printf( "\nla x local al entrar al metodo usarVariablelocal es %d\n",x );
        ++x;

        System.out.printf("la x local antes de salir del metodo usarVariablelocal es %d\n", x);
    }// final metodo usarVariablelocal


}// final clase Alcance
