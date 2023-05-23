import java.util.Scanner;

public class Matriz01_9A {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int[][] dobles = new int[3][3];

        //Rellenar la matriz:
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz.length; c++) {
                System.out.printf("[%d,%d]: ", f, c);
                matriz[f][c] = leer.nextInt();
                dobles[f][c] = matriz[f][c] * 2;
            }
        }
        

        //Mostrar la matriz
        System.out.println();
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz.length; c++) {
                System.out.printf("[%d]", matriz[f][c]);
            }
            System.out.println();
        }
        
        //Mostrar la matriz doble
        System.out.println();
        for (int f = 0; f < dobles.length; f++) {
            for (int c = 0; c < dobles.length; c++) {
                System.out.printf("[%d]", dobles[f][c]);
            }
            System.out.println();
        }
        leer.close();

    }
}
