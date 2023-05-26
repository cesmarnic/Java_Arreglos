import java.util.Scanner;

public class EjMatriz02_9B {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cantEstudiantes = 0;
        int cantNotas = 0;
        System.out.println("Ingrese la cantidad de estudiantes: ");
        cantEstudiantes = leer.nextInt();
        System.out.println("Ingrese la cantidad de notas: ");
        cantNotas = leer.nextInt();
        int[][] notas = new int[cantEstudiantes][cantNotas];
        String[] nombres = new String[cantEstudiantes];

        // Ingresar los nombres de los estudiantes
        for (int i = 0; i < cantEstudiantes; i++) {
            System.out.println("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            nombres[i] = leer.next();
        }

        // Ingresar las notas de los estudiantes
        for (int i = 0; i < cantEstudiantes; i++) {
            for (int j = 0; j < cantNotas; j++) {
                System.out.println("Ingrese la nota " + (j + 1) + " del estudiante " + nombres[i] + ": ");
                notas[i][j] = leer.nextInt();
            }
        }

        float[] promedios = new float[cantEstudiantes];
        // Calcular los promedios de los estudiantes
        for (int i = 0; i < cantEstudiantes; i++) {
            float suma = 0;
            for (int j = 0; j < cantNotas; j++) {
                suma += notas[i][j];
            }
            promedios[i] = suma / cantNotas;
        }

        // Mostrar Estudiante: Nota1, Nota2, ..., NotaN: Promedio
        for (int i = 0; i < cantEstudiantes; i++) {
            System.out.print(nombres[i] + ": ");
            for (int j = 0; j < cantNotas; j++) {
                System.out.print(notas[i][j] + " ");
            }
            System.out.println(": " + promedios[i]);
        }
    }
}
