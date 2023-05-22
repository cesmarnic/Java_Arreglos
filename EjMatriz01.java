import java.util.Scanner;
public class EjMatriz01{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        for(int f = 0; f < matriz.length; f++){
            for(int c = 0; c < matriz.length; c ++){
                System.out.printf("[%d, %d]:", f, c);
                matriz[f][c] = leer.nextInt();
            }
        }
        System.out.println();
        int[][] dobles = new int[3][3];
        System.out.println("La Matriz es:");
        for(int f = 0; f < matriz.length; f ++){
            for(int c = 0; c < matriz.length; c ++){
                System.out.printf("[%d]", matriz[f][c]);
                dobles[f][c] = matriz[f][c] * 2;
            }
            System.out.println();
        }
        System.out.println("\nLa Matriz doble es:");
        for(int f = 0; f < dobles.length; f ++){
            for(int c = 0; c < dobles.length; c ++){
                System.out.printf("[%d]", dobles[f][c]);
            }
            System.out.println();
        }
        leer.close();
    }
}