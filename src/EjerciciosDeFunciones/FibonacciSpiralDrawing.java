package EjerciciosDeFunciones;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

public class FibonacciSpiralDrawing extends JPanel {
    private int n;
    private int[] fibonacciNumbers;

    public FibonacciSpiralDrawing(int n) {
        this.n = n;
        fibonacciNumbers = new int[n];
        generateFibonacciNumbers();
    }

    private void generateFibonacciNumbers() {
        fibonacciNumbers[0] = 0;
        fibonacciNumbers[1] = 1;
        for (int i = 2; i < n; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;

        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.BLACK);

        int x = centerX;
        int y = centerY;

        int direction = 0; // 0: derecha, 1: abajo, 2: izquierda, 3: arriba

        for (int i = 0; i < n; i++) {
            int sideLength = fibonacciNumbers[i];

            switch (direction) {
                case 0:
                    x += sideLength;
                    break;
                case 1:
                    y += sideLength;
                    break;
                case 2:
                    x -= sideLength;
                    break;
                case 3:
                    y -= sideLength;
                    break;
            }

            g2d.draw(new Line2D.Double(centerX, centerY, x, y));

            direction = (direction + 1) % 4;
        }
    }

    public static void main(String[] args) {
        int n = 20; // Cambia este valor para ajustar el número de líneas en la espiral
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Fibonacci Spiral");
            FibonacciSpiralDrawing spiral = new FibonacciSpiralDrawing(n);
            frame.add(spiral);
            frame.setSize(800, 800);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

