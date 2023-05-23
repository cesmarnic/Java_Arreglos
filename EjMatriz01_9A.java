import java.util.Scanner;
public class EjMatriz01_9A {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz1 = {{8, 4, 12}, {9, 10, 9}};
        int[][] matriz2 = {{4, 2, 1}, {9, 3, 7}};
        int[][] matriz3 = new int[2][3];

        for (int f = 0; f < 2; f++) {
            for (int c = 0; c < 3; c++) {
                matriz3[f][c] = matriz1[f][c] + matriz2[f][c];
            }
        }

        for (int f = 0; f < 2; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.printf("[%d]", matriz3[f][c]);
            }
            System.out.println();
        }
        leer.close();
    }
}
