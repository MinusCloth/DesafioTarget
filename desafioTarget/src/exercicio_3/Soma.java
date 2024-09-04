package exercicio_3;

public class Soma {
	public static void main(String[] args) {
		// int INDICE = 12, SOMA = 0, K = 1; enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA);
		int INDICE = 12;
		int SOMA = 0;
		int k=1;
		while(k<INDICE) {
			k+= 1; 
			SOMA = SOMA + k;
		}System.out.println("Soma: "+SOMA);//   77
	}

}
