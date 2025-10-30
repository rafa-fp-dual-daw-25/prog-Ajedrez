// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }


    public static int[][] movimientoCaballo(int fila, int columna) {
        int[][] tablero = new int[8][8];
        int[][] movimientos = {
                {2, 1},
                {2, -1},
                {-2, 1},
                {-2, -1},
                {1, 2},
                {1, -2},
                {-1, 2},
                {-1, -2}
        };

        for (int[] movimiento : movimientos) {
            int nuevaFila = fila + movimiento[0];
            int nuevaColumna = columna + movimiento[1];

            if ((nuevaFila >= 0 && nuevaFila < 8) && (nuevaColumna >= 0 && nuevaColumna < 8)) {
                tablero[nuevaFila][nuevaColumna] = 1;
            }
        }
        return tablero;
    }

    public static int[][] movimientoAlfil(int fila, int columna) {
        int[][] tablero = new int[8][8];
        return tablero;
    }

    public static int[][] movimientoTorre(int fila, int columna) {
        int[][] tablero = new int[8][8];
        int[][] movimientos = {
                {1, 0},
                {-1, 0},
                {0, 1},
                {0, -1}
        };

        for (int[] movimiento : movimientos) {
            int nuevaFila = fila + movimiento[0];
            int nuevaColumna = columna + movimiento[1];

            if (nuevaFila >= 0 && nuevaFila < 8) {
                for (int i = 0; i < tablero.length - 1; i++) {
                }
            }
            (nuevaColumna >= 0 && nuevaColumna < 8)
            tablero[nuevaFila][nuevaColumna] = 1;
            tablero[nuevaFila][nuevaColumna] = 1;
        }
        return tablero;
    }
}


}