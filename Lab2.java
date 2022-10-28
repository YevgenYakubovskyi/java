/**
 * С5 = 331%5 = 1 = C=Bт
 * С7 = 331%7 = 2 = short
 * C11 = 331%11 = Обчислити суму найменших елементів кожного стовпця матриці
 */

public class Lab2 {
    public static void main(String[] args) {

        short[][] B = {
                {1, 2, 4},
                {4, 5, 2},
                {7, 8, 2}
        };
        if (B.length != B[1].length){
            System.out.println("К-сть стовпців має бути рівною к-сті рядків");
            return;
        }
        short[][] C = new short[B.length][B.length];

        System.out.println("\nB matrix: ");
        for (short[] shorts : B) {
            for (int j = 0; j < B.length; j++) {
                System.out.print(shorts[j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nC matrix:");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C.length; j++) {
                C[i][j] = B[j][i]; //Транспонування
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }

        short temp;
        short sumMin = 0;
        for (short[] shorts : C) {
            temp = shorts[0];
            for (int j = 1; j < C.length; j++) {
                if (shorts[j] < temp) {
                    temp = shorts[j];
                }
            }
            sumMin += temp;
        }
        System.out.println();
        System.out.println("Сумма найменших елементів стовпців матриці С = " + sumMin);

    }
}
