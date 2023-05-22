import java.util.Scanner;

public class Matriz01{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        // System.out.println(matriz.length);
        for(int fila = 0; fila < matriz.length; fila ++){
            for(int columna = 0; columna < matriz.length; columna ++){
                System.out.printf("[%d][%d]: ", fila, columna);
                matriz[fila][columna] = leer.nextInt();
            }
        }

        //Mostrar
        System.out.println("");
        for(int fila = 0; fila < matriz.length; fila ++){
            for(int columna = 0; columna < matriz.length; columna ++){
                System.out.printf("[%d]", matriz[fila][columna]);
            }
            System.out.println("");
        }
        
    }
}