package entidades;

public class Funcionario {
	
	private Integer idDoFuncionario;
	private String nomeDoFuncionario;
	private Double salarioDoFuncionario;
	
	public Funcionario(Integer idDoFuncionario, String nomeDoFuncionario, Double salarioDoFuncioario) {
		this.idDoFuncionario = idDoFuncionario;
		this.nomeDoFuncionario = nomeDoFuncionario;
		this.salarioDoFuncionario = salarioDoFuncioario;
	}

	public Integer getIdDoFuncionario() {
		return idDoFuncionario;
	}
	
	public void setIdDoFuncionario(Integer idDoFuncionario) {
		this.idDoFuncionario = idDoFuncionario;
	}
	
	public String getNomeDoFuncionario() {
		return nomeDoFuncionario;
	}
	
	public void setNomeDoFuncionario(String nomeDoFuncionario) {
		this.nomeDoFuncionario = nomeDoFuncionario;
	}
	
	public Double getSalarioDoFuncionario() {
		return salarioDoFuncionario;
	}
	
	public void aumentoDeSalario(Double porcentagemDeAumento) {
		salarioDoFuncionario += salarioDoFuncionario * (porcentagemDeAumento * 0.01);  
	}
	
	public String toString() {
		return idDoFuncionario+",  "+nomeDoFuncionario+", "+String.format("R$ %.2f", salarioDoFuncionario);
	}
	
}
