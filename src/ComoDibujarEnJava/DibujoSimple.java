package ComoDibujarEnJava;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;

public class DibujoSimple extends JFrame{
    public DibujoSimple() {
        setTitle("Dibujo Simple");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLUE);  // Establecer el color del círculo
        g.fillOval(150, 150, 100, 100);  // Dibujar un círculo en (150, 150) con ancho y alto de 100
    }

}
