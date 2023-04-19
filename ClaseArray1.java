import java.util.Scanner;
public class CalseArray1 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] numeros = new int[5];
        for  (int i = 0; i <  numeros.length; i ++){
            numeros[i] = leer.nextInt();
        }
        for(int i : numeros){
            System.out.printf("[%d]", i);
        }
    }
}