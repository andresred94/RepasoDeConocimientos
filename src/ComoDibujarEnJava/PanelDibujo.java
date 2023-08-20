package ComoDibujarEnJava;
import java.awt.Graphics;
import javax.swing.JPanel;

public class PanelDibujo extends JPanel{
    // método que dibuja una x desde las esquinas del panel
    public void paintComponent( Graphics g ){
        // llama a paintComponent paara asegurar de que el panel se muestra correctamente
        super.paintComponent( g );

        int ancho = getWidth();// ancho total
        int alto = getHeight();// alto total

        // dibuja una diagonal de derecha a izq
        g.drawLine( 0 , 0 , ancho , alto );

        // dibuja una diagonal de izq a derecha
        g.drawLine( 0, alto , ancho ,0 );

    }// final metodo paintComponent

}// final clase PanelDibuja
