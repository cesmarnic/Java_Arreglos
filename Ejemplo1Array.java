import java.util.Scanner;
public class Ejemplo1Array{
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = leer.nextInt();
        int[] nums = new int[n];
        System.out.println("Ingrese los valores del arreglo:");
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("[%d]: ", i);
            nums[i] = leer.nextInt();
        }
        int suma = 0;
        for (int i : nums) {
            System.out.printf("[%d]", i);
            suma += i;
        }
        System.out.printf("= %d", suma);
    }
}