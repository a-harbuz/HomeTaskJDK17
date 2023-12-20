package de.telran.collprogramm;

public class tapbicaUmnogenija {
    public static void main(String[] args) {
        for (int i=1; i<=9; i++){
            if (i==2) System.out.println("-".repeat(30));
            for (int j=1; j<=9; j++){
                System.out.printf(
                        //"%dx%d=%d%n", i, j, i*j
                        "%2d ", i*j
                );
                if (j==1) System.out.print("|");
            }
            System.out.println();

        }

    }
}
