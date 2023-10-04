package EjerciciosDeFunciones;
public class FibonacciSpiral {
        public static void main(String[] args) {
            int n = 4; // Cambia este valor para controlar cuántos números de Fibonacci se generarán
            int[][] spiral = generateFibonacciSpiral(n);

            // Imprimir la espiral de Fibonacci
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(spiral[i][j] + "\t");
                }
                System.out.println();
            }
        }

        public static int[][] generateFibonacciSpiral(int n) {
            int[][] spiral = new int[n][n];
            int[] dx = {0, 1, 0, -1}; // Cambio en la coordenada x para moverse en la espiral
            int[] dy = {1, 0, -1, 0}; // Cambio en la coordenada y para moverse en la espiral

            int x = 0, y = 0, direction = 0; // Iniciar desde (0,0) y moverse hacia la derecha

            for (int i = 0; i < n * n; i++) {
                spiral[x][y] = fibonacci(i);

                int nx = x + dx[direction];
                int ny = y + dy[direction];

                if (nx >= 0 && nx < n && ny >= 0 && ny < n && spiral[nx][ny] == 0) {
                    x = nx;
                    y = ny;
                } else {
                    // Cambiar la dirección si llegamos al borde o a una celda ocupada
                    direction = (direction + 1) % 4;
                    x += dx[direction];
                    y += dy[direction];
                }
            }

            return spiral;
        }

        public static int fibonacci(int n) {
            if (n <= 1) {
                return n;
            }
            int a = 0, b = 1, c;
            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return b;
        }
}

