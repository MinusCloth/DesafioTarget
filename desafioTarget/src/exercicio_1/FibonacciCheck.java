package exercicio_1;

import java.util.Scanner;

public class FibonacciCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcao;

        do {
            System.out.print("Digite um número: ");
            String input = sc.nextLine().trim();

            while (!input.matches("\\d+")) {  
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
                System.out.print("Digite um número: ");
                input = sc.nextLine().trim();
            }

            int numero = Integer.parseInt(input);
            if (isFibonacci(numero)) {
                System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println("O número " + numero +" não pertence à sequência de Fibonacci.");
            }

            System.out.print("Deseja verificar outro número? (s/n): ");
            opcao = sc.nextLine().trim().toLowerCase();
        } while (opcao.equals("s"));

        sc.close();
        System.out.println("Programa encerrado.");
    }

    public static boolean isFibonacci(int n) {
        int a = 0, b = 1, c;
        if (n == a || n == b) {
            return true;
        }
        while (b <= n) {
            c = a + b;
            if (c == n) {
                return true;
            }
            a = b;
            b = c;
        }
        return false;
    }
}
