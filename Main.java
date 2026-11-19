import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Entrada[] entradas = new Entrada[3];

        System.out.println("=== SISTEMA DE GESTIÓN DE ENTRADAS DE CINE ===");


        for (int i = 0; i < 3; i++) {
            System.out.println("\n--- Datos para la Entrada " + (i + 1) + " ---");
            
            System.out.print("Ingrese el nombre de la película: ");
            String pelicula = scanner.nextLine();

            System.out.print("Ingrese el precio base: ");
            double precioBase = scanner.nextDouble();

            System.out.print("Ingrese la edad del espectador: ");
            int edad = scanner.nextInt();
            scanner.nextLine(); 

        
            entradas[i] = new Entrada(pelicula, precioBase, edad);
        }

       
       
        System.out.println("          RESUMEN DE ENTRADAS           ");

        
        for (int i = 0; i < 3; i++) {
            System.out.println("\nEntrada " + (i + 1) + ":");
            entradas[i].mostrarEntrada();
        }

        scanner.close();
    }
}