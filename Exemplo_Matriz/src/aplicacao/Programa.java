package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int tamanhoMatriz = sc.nextInt();
		
		int[][] matriz = new int[tamanhoMatriz][tamanhoMatriz];
		
		for (int linha = 0; linha < tamanhoMatriz; linha++) {
			for (int coluna = 0; coluna < tamanhoMatriz; coluna++) {
				matriz[linha][coluna] = sc.nextInt();
			}
		}
		
		System.out.println("Diagonal principal: ");
		
		for (int diagonal = 0; diagonal<tamanhoMatriz; diagonal++) {
			System.out.print(matriz[diagonal][diagonal]+" ");
		}
		
		int numerosNegativos = 0;
		
		for (int linha = 0; linha < tamanhoMatriz; linha++) {
			for (int coluna = 0; coluna < tamanhoMatriz; coluna++) {
				if(matriz[linha][coluna]<0) {
					numerosNegativos++;
				}
			}
		}
		
		System.out.println();
		System.out.print("Numeros negativos: "+numerosNegativos);
		
		// OBS
		// matriz.length conta a quantidades de linhas da matriz
		// matriz[0].length conta a quantidade de colunas da matriz
		
		sc.close();	

	}

}
