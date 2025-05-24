package starbu;

import java.util.Scanner;

public class Starbu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecciona tu bebida:");
        System.out.println("1. Espresso");
        System.out.println("2. Café Descafeinado");
        System.out.println("3. Té Chai");
        System.out.println("4. Matcha");
        int beverageChoice = scanner.nextInt();
        Bebidas bebidas = null;

        switch (beverageChoice) {
            case 1:
                bebidas = new Espresso();
                break;
            case 2:
                bebidas = new Decaf();
                break;
            case 3:
                bebidas = new TeChai();
                break;
            case 4:
                bebidas = new Matcha();
                break;
            default:
                System.out.println("Opción no válida.");
                System.exit(1);
        }
        System.out.println("Selecciona tus condimentos:");
        System.out.println("1. Azúcar");
        System.out.println("2. Canela");
        System.out.println("3. Leche");
        System.out.println("4. Soya");
        System.out.println("Introduce los números de los condimentos que deseas:");
        String[] condiments = scanner.next().split(",");

        for (String condimento : condiments) {
            switch (condimento.trim()) {
                case "1":
                    bebidas = new Azucar(bebidas);
                    break;
                case "2":
                    bebidas = new Canela(bebidas);
                    break;
                case "3":
                    bebidas = new Leche(bebidas);
                    break;
                case "4":
                    bebidas = new Soya(bebidas);
                    break;
                default:
                    System.out.println("Condimento no válido: " + condimento);
                    break;
            }
        }

        System.out.println("Tu bebida: " + bebidas.getDescripcion());
        System.out.println("Costo total: $" + bebidas.costo());
    }

}
