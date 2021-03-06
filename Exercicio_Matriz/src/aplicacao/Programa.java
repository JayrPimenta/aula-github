package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int quantidadeDeLinha = sc.nextInt();
		int quantidadeDeColuna = sc.nextInt();
		
		int[][] matriz = new int[quantidadeDeLinha][quantidadeDeColuna];
		
		for (int linha = 0; linha<matriz.length; linha++) {
			for (int coluna = 0; coluna<matriz[linha].length; coluna++) {
				matriz[linha][coluna] = sc.nextInt();
			}
		}
		
		int pesquisarNumero = sc.nextInt();
		
		for (int linha = 0; linha<matriz.length; linha++) {
			for (int coluna = 0; coluna<matriz[linha].length; coluna++) {
				
				if (matriz[linha][coluna] == pesquisarNumero) {
					System.out.println("Posi��o "+linha+","+coluna+":");
					
					if (coluna > 0) {
						System.out.println("Esquerda: "+matriz[linha][coluna-1]);
					}
					
					if (coluna < matriz[linha].length-1) {
						System.out.println("Direita: "+matriz[linha][coluna+1]);
					}
					
					if (linha > 0) {
						System.out.println("Cima: "+matriz[linha-1][coluna]);
					}
					
					if (linha < matriz.length-1) {
						System.out.println("Baixa: "+matriz[linha+1][coluna]);
					}
				}			
			}
		}
			
		sc.close();	

	}

}
