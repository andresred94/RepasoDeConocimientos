package GenerarAleatoriedad;
import java.util.Random;
public class NumerosAleatorios {

    //metodo que genera 4 filas de numeros aleatorios
    public void metodoUno () {
        Random numalea = new Random();
        int cara;

        for ( int i = 1; i <= 20; i++ ) {
            cara = 1 + numalea.nextInt(6);

            System.out.printf(" %d ", cara);

            if (i % 5 == 0)
                System.out.println();
        }// final for
    }// final numAleatorioM1

    public void metodoDos(){
        Random numalea = new Random();

        int frecuencia1 = 0;
        int frecuencia2 = 0;
        int frecuencia3 = 0;
        int frecuencia4 = 0;
        int frecuencia5 = 0;
        int frecuencia6 = 0;
        int cara;

        for (int i = 1; i < 11; i++) {
            cara = 1 + numalea.nextInt(6);

            switch (cara){
                case 1:
                    ++frecuencia1;
                    break;
                case 2:
                    ++frecuencia2;
                    break;
                case 3:
                    ++frecuencia3;
                    break;
                case 4:
                    ++frecuencia4;
                    break;
                case 5:
                    ++frecuencia5;
                    break;
                case 6:
                    ++frecuencia6;
                    break;
            }// final case
        }// final for

        System.out.println( "Cara\tFrecuencia");
        System.out.printf("1\t%d\n2\t%d\n3\t%d\n4\t%d\n5\t%d\n6\t%d\n", frecuencia1
        , frecuencia2 ,frecuencia3, frecuencia4, frecuencia5, frecuencia6 );
    }// final metodoDos

    public void metodoTres(){
        Random numalea = new Random();
        int num = 2 + 3 * numalea.nextInt(6);
        System.out.printf("Numero aleatorio escogido de la secuencia 2,5,8,11 y 14 es: %d",num);

    }
}// final clase NumerosAleatorios
