package lv.accenture.preboot.sudokuKrista;

import java.util.ArrayList;
import java.util.Collections;

public class SudokuNullesUnPaDiognaliPareizasVertibas {

    public static void main(String args[]) {

        //mazo kubu definesana, tris kubi pa diognali
        ArrayList<Integer> cube = new ArrayList<Integer>();
        cube.add(1);
        cube.add(2);
        cube.add(3);
        cube.add(4);
        cube.add(5);
        cube.add(6);
        cube.add(7);
        cube.add(8);
        cube.add(9);
        Collections.shuffle(cube);

        int[][] a = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = cube.get(j + (3 * i));
            }
        }

        Collections.shuffle(cube);
        int[][] b = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = cube.get(j + (3 * i));
            }
        }
        Collections.shuffle(cube);
        int[][] c = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = cube.get(j + (3 * i));
            }
        }


//laukuma vertibas izdruka ar visiem mazajiem kubiem

        int laukums[][] = new int[9][9];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                laukums[i][j] = a[i][j];
        for (int i = 3; i > 2 && i < 6; i++)
            for (int j = 3; j > 2 && j < 6; j++)
                laukums[i][j] = b[i - 3][j - 3];
        for (int i = 6; i > 5 && i < 9; i++)
            for (int j = 6; j > 5 && j < 9; j++)
                laukums[i][j] = c[i - 6][j - 6];

//laukuma izdruka
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print((laukums[i][j]));
            }
            System.out.println(" ");
        }
    }

}
