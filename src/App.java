public class App {

static int array_numeros[][] = {
    {5, 3, 0, 0, 7, 0, 0, 0, 0},
    {6, 0, 0, 1, 9, 5, 0, 0, 0},
    {0, 9, 8, 0, 0, 0, 0, 6, 0},
    {8, 0, 0, 0, 6, 0, 0, 0, 3},
    {4, 0, 0, 8, 0, 3, 0, 0, 1},
    {7, 0, 0, 0, 2, 0, 0, 0, 6},
    {0, 6, 0, 0, 0, 0, 2, 8, 0},
    {0, 0, 0, 4, 1, 9, 0, 0, 5},
    {0, 0, 0, 0, 8, 0, 0, 7, 9}
};    

static int array_solucion[][] = new int[9][9];

    public static int cambiar_fila(int fila, int columna) {
        if (columna == 8) {
            fila++;
        }
        return fila;
    }

    public static int cambiar_columna(int fila, int columna) {

        if (columna == 8) {
            columna = 0;
        } else if (columna != 8) {
            columna++;
        }
        return columna;

    }

    public static boolean comprobar_fila(int fil, int nuevo) {
        boolean fila_comprobar = true;
        for (int col = 0; col < array_numeros.length; col++) {
            int num = array_numeros[fil][col];
            int numero2 = array_solucion[fil][col];
            if (num == nuevo || numero2 == nuevo) {
                fila_comprobar = false;
            }
        }

        return fila_comprobar;
    }

    public static boolean comprobar_columna(int col, int nuevo) {
        boolean columna_comprobar = true;
        for (int fil = 0; fil < array_numeros.length; fil++) {
            int num = array_numeros[fil][col];
            int numero2 = array_solucion[fil][col];

            if (num == nuevo || numero2 == nuevo) {
                columna_comprobar = false;
            }

        }
        return columna_comprobar;

    }

    public static boolean comprobar_cuadrado(int columna, int fila, int nuevo) {

        boolean cuadrado_comprobar = true;
        int fila_cuadrado = fila / 3;
        int columna_cuadrado = columna / 3;
        int fila_final = 0;
        int columna_final = 0;

        if (fila_cuadrado == 0) {
            fila_final = 0;
        } else if (fila_cuadrado == 1) {
            fila_final = 3;
        } else if (fila_cuadrado == 2) {
            fila_final = 6;
        }

        if (columna_cuadrado == 0) {
            columna_final = 0;
        } else if (columna_cuadrado == 1) {
            columna_final = 3;
        } else if (columna_cuadrado == 2) {
            columna_final = 6;
        }

        for (int i = fila_final; i < fila_final + 3; i++) {
            for (int j = columna_final; j < columna_final + 3; j++) {
                int num = array_numeros[i][j];
                int numero2 = array_solucion[i][j];
                if (num == nuevo || numero2 == nuevo) {
                    cuadrado_comprobar = false;
                }

            }
        }

        return cuadrado_comprobar;
    }

    public static void resolver_sudoku(int fila, int columna) {

        if (fila > 8) {
            System.out.println("----------------");
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    System.out.print(array_solucion[i][j] + " ");
                }
                System.out.println("");
            }
        } else {
            
            if (array_numeros[fila][columna] != 0) {
                array_solucion[fila][columna] = array_numeros[fila][columna];
                int fila_nueva = cambiar_fila(fila, columna);
                int columna_nueva = cambiar_columna(fila, columna);
                resolver_sudoku(fila_nueva, columna_nueva);
            } else {
                for (int num = 1; num <= 9; num++) {
                    boolean comprabacion_fila = comprobar_fila(fila, num);
                    boolean comprabacion_columna = comprobar_columna(columna, num);
                    boolean comprabacion_cuadrado = comprobar_cuadrado(columna, fila, num);

                    if (comprabacion_fila == true && comprabacion_columna == true && comprabacion_cuadrado == true) {
                        array_solucion[fila][columna] = num;
                        int fila_nueva = cambiar_fila(fila, columna);
                        int columna_nueva = cambiar_columna(fila, columna);
                        resolver_sudoku(fila_nueva, columna_nueva);
                        array_solucion[fila][columna] = 0;
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        int fila = 0;
        int columna = 0;
        resolver_sudoku(fila, columna);
    }
    
}
