package br.com.rodrigo.solid.isp;

public abstract class FuncionarioCorrect  implements Convensional{
	
	private String nome;
	private double salario;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public double getSalario() {
		return this.salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}