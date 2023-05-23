import java.util.Scanner;
/**
 * EjMatriz02_9A
 */
public class EjMatriz02_9A {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int[] inversa = new int[5];

        // Llenar matriz
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                System.out.printf("[%d, %d]: ", f, c);
                matriz[f][c] = leer.nextInt();
                if (f == c) {
                    inversa[f] = matriz[f][c];
                }
            }
        }

        // Mostrar matriz
        System.out.println("\nMatriz:");
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                System.out.printf("[%d]", matriz[f][c]);
            }
            System.out.println();
        }

        // Mostrar inversa
        System.out.println("\nInversa:");
        for(int i : inversa) {
            System.out.printf("[%d]", i);
        }
        
    }
}