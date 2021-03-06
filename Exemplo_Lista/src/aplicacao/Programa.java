package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<String> lista = new ArrayList<>();
		
		lista.add("Jos�"); //add adiciona um item a lista
		lista.add("Jader");
		lista.add("Jo�o");
		lista.add("Marcelo");
		lista.add("Marco");
		lista.add("Leandro");
		lista.add("Almir");
		lista.add("Tiago");
		
		lista.add(2, "Ana"); // adiciona na posi��o indicada
		lista.add(3, "Marcia");
		
		
		
		System.out.println("Tamanho da lista: "+lista.size()); // size() retorna a quantidade de itens na lista
		System.out.println();
		
		for (String nome : lista) {
			System.out.println(nome);
		}
		System.out.println();
		System.out.println("O Jo�o esta na posi��o "+lista.indexOf("Jo�o")+" da lista."); // indexOf() Retorna indice orientado pelo item a ser localizado.
		
		String localizarPrimeiroNome = lista.stream().filter(nome -> nome.charAt(0) == 'L').findFirst().orElse(null);  // Retorna o primeiro item que atenda a condi��o.
		System.out.println("Primeiro nome com a letra L �: "+localizarPrimeiroNome );
		
		
		System.out.println();
		System.out.println("---------------------");
		System.out.println();
		
		lista.remove("Leandro"); // Revome item da lista orientado por compara��o.
		lista.remove(8); // Remove item da lista orientado pela posi��o.
		
		for (String nome : lista) {
			System.out.println(nome);
		}
		
		System.out.println();
		System.out.println("---------------------");
		System.out.println();
		
		lista.removeIf(nome -> nome.charAt(0) == 'J'); // Remove orientado por um filtro.
		
		for (String nome : lista) {
			System.out.println(nome);
		}
		
		System.out.println();
		System.out.println("---------------------");
		System.out.println();
		
		List<String> listaFiltrada = lista.stream().filter(nome -> nome.charAt(0) == 'M').collect(Collectors.toList());
		//E necessario criar uma nova lista esta recebendo o dados da lista anterior ja filtrado.
		//OBS o .collect(Collectors.toList()) - Deve ser IMPORTADO junto com o stream().
		
		for (String nome : listaFiltrada) {
			System.out.println(nome);
		}
		
		
		sc.close();
	}

}
