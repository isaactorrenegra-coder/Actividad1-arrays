package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Definir los arreglos unidimensionales
        int[] arreglo1 = new int[7];
        int[] arreglo2 = new int[7];
        int[] arreglo3 = new int[7];

        // Variables para calcular el promedio
        double sumaTotalDatos = 0;
        int totalElementos = 7; // Usaremos 7 si el promedio es del tercer arreglo

        System.out.println("INGRESO DE DATOS");

        System.out.println("Ingrese 7 números para el primer arreglo:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Posición [" + i + "]: ");
            arreglo1[i] = scanner.nextInt();
        }

        // Llenar el segundo arreglo
        System.out.println("\nIngrese 7 números para el SEGUNDO arreglo:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Posición [" + i + "]: ");
            arreglo2[i] = scanner.nextInt();
        }

        // 2. Llenar el tercer arreglo con la diferencia y preparar el promedio
        for (int i = 0; i < 7; i++) {
            arreglo3[i] = arreglo1[i] - arreglo2[i];
            sumaTotalDatos += arreglo3[i]; // Sumamos los datos del 3er arreglo
        }

        // Calcular el promedio de los datos del tercer arreglo
        double promedio = sumaTotalDatos / totalElementos;

        // 3. Mostrar todos y cada uno de los datos del tercer arreglo
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Datos del TERCER arreglo (Diferencia: Arreglo 1 - Arreglo 2):");
        for (int i = 0; i < 7; i++) {
            System.out.println("Posición [" + i + "]: " + arreglo3[i]);
        }

        System.out.println("\nEl promedio de los datos del tercer arreglo es: " + promedio);

        scanner.close();
    }
}