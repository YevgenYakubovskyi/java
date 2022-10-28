/**
 * C2 = 331%2 = 1 = -  o1
 * C3 = 331$3 = 1 = 1
 * С5 = 331%5 = 1 = /  o2
 * С7 = 331%7 = 2 = int
 */

public class Lab1 {
    public static void main(String[] args) {
        int i, j;
        int C3 = 1, a = 2, b = 2, n = 2, m = 3;
        double S = 0;
        if (a > n) {
            int temp = n;
            n = a;
            a = temp;
        }
        if (b > m) {
            int temp = m;
            m = b;
            b = temp;
        }
        if ((a <= C3) && (C3 <= n)) {
            System.out.println("В одній із дій відбувається ділення на 0");
            return;
        }
        if ((a <= n) && (b <= m)) {
            for (i = a; i <= n; i++) {
                for (j = b; j <= m; j++) {
                    System.out.println(S);
                }
            }
            System.out.println("Результат = " + S);
        }
    }
}