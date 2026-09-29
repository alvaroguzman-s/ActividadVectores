import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[15];

        System.out.println("Ingrese 15 numeros entre 10 y 100:");

        for (int i = 0; i < numeros.length; i++) {

            int numero;

            do {
                System.out.print("Ingrese el numero " + (i + 1) + ": ");
                numero = entrada.nextInt();

                if (numero < 10 || numero > 100) {
                    System.out.println("El numero esta fuera del rango.");
                }

            } while (numero < 10 || numero > 100);

            numeros[i] = numero;
        }

        System.out.println("\nValores del vector:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.print("\n\nIngrese un numero para buscar: ");
        int buscar = entrada.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] == buscar) {
                System.out.println("El numero " + buscar +
                        " esta en la posicion " + i);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("El numero no se encuentra en el vector.");
        }

        int mayor = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {

            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("\nEl numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);

        System.out.print("\nIngrese un numero para buscar sus multiplos: ");
        int x = entrada.nextInt();

        boolean hayMultiplos = false;

        System.out.println("Multiplos de " + x + " que estan en el vector:");

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] % x == 0) {
                System.out.print(numeros[i] + " ");
                hayMultiplos = true;
            }
        }

        if (!hayMultiplos) {
            System.out.println("No hay multiplos de " + x + " en el vector.");
        }

        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
        }

        System.out.println("\n\nLa suma de todos los valores es: " + suma);

        double promedio = (double) suma / numeros.length;

        System.out.println("El promedio es: " + promedio);

        int cantidad = 0;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] > promedio) {
                cantidad++;
            }
        }

        if (cantidad == 0) {

            System.out.println("No hay numeros por encima del promedio.");

        } else {

            int[] mayoresPromedio = new int[cantidad];
            int posicion = 0;

            for (int i = 0; i < numeros.length; i++) {

                if (numeros[i] > promedio) {
                    mayoresPromedio[posicion] = numeros[i];
                    posicion++;
                }
            }

            System.out.println("Numeros por encima del promedio:");

            for (int i = 0; i < mayoresPromedio.length; i++) {
                System.out.print(mayoresPromedio[i] + " ");
            }

            System.out.println("\nCantidad de numeros por encima del promedio: " + cantidad);
        }

        entrada.close();
    
    }

}

