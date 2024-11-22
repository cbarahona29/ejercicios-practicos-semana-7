package cafeexpressuni;

import java.util.Scanner;

public class CafeExpressUNI {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int clientes = 0;
        int pequenos = 0;
        int medianos = 0;
        int grandes = 0;
        double caja = 0;

        while (true) {
            System.out.println("MENU");
            System.out.println("1. Ordenar cafe");
            System.out.println("2. Cerrar caja y salir");

            int opcion = entrada.nextInt();

            if (opcion == 1) {
                System.out.println("Seleccione el tamano de cafe:");
                System.out.println("1. Pequeno (Lps. 45)");
                System.out.println("2. Mediano (Lps. 56)");
                System.out.println("3. Grande (Lps. 65)");

                int cafe = entrada.nextInt();
                double pcafe = 0;

                switch (cafe) {
                    case 1:
                        pcafe = 45;
                        pequenos++;
                        break;
                    case 2:
                        pcafe = 56;
                        medianos++;
                        break;
                    case 3:
                        pcafe = 65;
                        grandes++;
                        break;
                    default:
                        System.out.println("Opción inválida. Intente de nuevo.");
                        continue;
                }

                System.out.println("Seleccione un agregado:");
                System.out.println("1. Leche (Lps. 5)");
                System.out.println("2. Cremora (Lps. 8)");
                System.out.println("3. Sencillo (Lps. 0)");

                int agregado = entrada.nextInt();
                double pagregado = 0;

                switch (agregado) {
                    case 1:
                        pagregado = 5;
                        break;
                    case 2:
                        pagregado = 8;
                        break;
                    case 3:
                        pagregado = 0;
                        break;
                    default:
                        System.out.println("Opcion invalida. Intente de nuevo.");
                        continue;
                }

                System.out.println("Ingrese su edad:");
                int edad = entrada.nextInt();

                double descuento = (edad >= 18) ? 0.10 : 0; // 10% de descuento
                double total = (pcafe + pagregado) * (1 - descuento);

                System.out.printf("El costo total de su cafe es: Lps. ", total);

                clientes++;
                caja += total;
            } else if (opcion == 2) {
        
                System.out.println("Cierre de caja:");
                System.out.println("Total de clientes atendidos: " + clientes);
                System.out.println("Total de cafes pequeños vendidos: " + pequenos);
                System.out.println("Total de cafes medianos vendidos: " + medianos);
                System.out.println("Total de cafés grandes vendidos: " + grandes);
                System.out.printf("Total recaudado en caja: Lps. ", caja);
                break;
            } else {
                System.out.println("Opción inválida. Intente de nuevo.");
            }
        }

        System.exit(0);
    }
}
