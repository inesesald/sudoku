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


//laukuma vertibu papildinasana ar diognales mazajiem kubiem

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
//parbaude vai laukuma ir tukshas vertibas "0", lai turpinatu speli.

        int rinda = 0;
        int kolona = 0;


        boolean matrixIsntFixed = true;
        //  dimensija, kas nav nofikseta tiek piepildita, audzejot vai samazinot vertibu.
        int indexChange = 1;
        // piepildam array
        int number;

        while (matrixIsntFixed) {
            /*shis while cikls der, vinu var kopet ari user inputam, tur zem if (laukums[rinda][kolona] == 0; 
            sadalas liek user input nosacijumus
                if (laukums[rinda][kolona] == 0) {
                   ////////// number = user input ->>>visi if statementi, kas jaizpilda, ja izpilditi, tad nakama rindina.
                  ///////////  laukums[rinda][kolona] = number;//gala statement, ja visas prasibas ir izpilditas
                } else {
                    kolona += 1;
                }
                parejo patur tadu pasu, ka saja dala, kur tiek veidots laukums./////garo vieta var likt jebkurus nosacijumus pa starpai.
                */
            
            
            // numuram jabut mazakam par arry robezam
            try {
                // pipilda tikai tad, jA tuks, preteja gadijuma pienem iznakumu

                if (laukums[rinda][kolona] == 0) {
                    
                    number = (int) (Math.random() * (9 + 1 - 1) + 1);//tagad vinsh piepilda ar visiem skaitliem no 1-9(tas neder)

                            laukums[rinda][kolona] = number;//gala statement, ja visas prasibas ir izpilditas



                } else {
                    kolona += 1;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                if (kolona == 9) {
                    rinda++;
                    kolona = 0;
                } else {
                    matrixIsntFixed = !matrixIsntFixed;
                    System.out.println("Spele pabeigta!");

                }
            }
        }


//Pats pedejais gala rezultats
        System.out.println("Izveidota matrica:");
        for (rinda = 0; rinda < 9; rinda++) {

            for (kolona = 0; kolona < 9; kolona++) {

                System.out.print(laukums[rinda][kolona]);
            }
            System.out.println(" ");
        }


    }


}
