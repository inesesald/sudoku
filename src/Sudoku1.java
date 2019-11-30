public class Sudoku1 {
         public static void printBoard() {

            //private char[][] laukums;

            // public SudokuResult() {
            char[][] laukums = new char[9][9];
            int row;
            int col;
            int number;
            // palaistSpelesLaukumu();

            //public void printBoard () {
            System.out.println("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");

            for (int i = 0; i < 9; i++) {


                for (int j = 0; j < 9; j++) {
                    if (j == 2 || j == 5 || j == 8) {
                        System.out.print(laukums[i][j] + "  ▌  ");
                    } else if (j == 0) {
                        System.out.print("▌  " + laukums[i][j] + "  ⁞  ");
                    } else {
                        System.out.print(laukums[i][j] + "  ⁞  ");
                    }
                }
                if (i == 2 || i == 5 || i == 8) {
                    System.out.println();
                    System.out.println("▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬▬");
                } else {
                    System.out.println();
                    System.out.println("…………………………………………………………………………………………………………………………………………………");
                }

            }
        }
    }
