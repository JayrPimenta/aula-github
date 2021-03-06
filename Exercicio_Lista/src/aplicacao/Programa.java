package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		
		List<Funcionario> listaDeFuncionarios = new ArrayList<>();
		
		System.out.print("Quantos funcio�rios deseja registrar? ");
		int numeroDeFuncionarios = sc.nextInt();
		System.out.println();
				
		for (int i = 1; i <= numeroDeFuncionarios; i++) {
			System.out.println("Funcion�rio #"+ i +":");
			System.out.print("Id: ");
			Integer idDoFuncionario = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome: ");
			String nomeDoFuncionario = sc.nextLine();
			System.out.print("Sal�rio: ");
			Double salarioDoFuncionario = sc.nextDouble();
			System.out.println();
			listaDeFuncionarios.add(new Funcionario(idDoFuncionario, nomeDoFuncionario, salarioDoFuncionario));
			
		}
		
		System.out.print("Informe o codigo do funcion�rio que receber� o almento de sal�rio: ");
		Integer id = sc.nextInt();
		
		Funcionario beneficiarioDoAumento = listaDeFuncionarios.stream().filter(idBeneficiario -> idBeneficiario.getIdDoFuncionario().equals(id)).findFirst().orElse(null);
		
		if (null != beneficiarioDoAumento) {
			System.out.print("Informe o porcentual do aumento: ");
			Double porcentagemDeAumento = sc.nextDouble();
			beneficiarioDoAumento.aumentoDeSalario(porcentagemDeAumento);
		} else {
			System.out.println("Id n�o informado, n�o corresponde a um id valido.");
		}		
		
		System.out.println();
		System.out.println("Lista de funcion�rios cadastrados:");
		
		for (Funcionario listaDeFuncionariosCadastrados : listaDeFuncionarios) {
			System.out.println(listaDeFuncionariosCadastrados);
		}
		
		sc.close();
	}

}
