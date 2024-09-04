package exercicio_2;

import java.util.Scanner;

public class VerificarLetra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String continuar;

        do {
            System.out.print("Digite uma palavra: ");
            String palavra = sc.nextLine().trim(); 
            palavra=palavra.toUpperCase();
            
            if (palavra.isEmpty()) {
                System.out.println("Você não digitou nada! Por favor, escreva algo.");
            } else {
                int qtd = 0;
                for (int i = 0; i < palavra.length(); i++) {
                    char letra = palavra.charAt(i);
                    if ( letra == 'A') {
                        qtd+=1;
                    }
                }

                if (qtd > 0) {
                    System.out.println("A letra 'a' aparece " + qtd + " vez(es) na string.");
                } else {
                    System.out.println("A letra 'a' não aparece na string.");
                }
            }

            System.out.print("Deseja verificar outra palavra? (s/n): ");
            continuar = sc.nextLine().trim();

        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("Programa finalizado.");
       
    }
}
