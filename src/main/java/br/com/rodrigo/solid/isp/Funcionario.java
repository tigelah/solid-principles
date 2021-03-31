package br.com.rodrigo.solid.isp;
/***
 * 
 * Princípio da Segregação de Interfaces (ISP)
 * Diz que “muitas interfaces específicas são melhores do que uma interface geral”.
 * Esse princípio trata da coesão em interfaces, da construção de módulos enxutos, ou seja, com poucos comportamentos.
 * Interfaces que possuem muitos comportamentos são difíceis de manter e evoluir, e devem ser evitadas.
 * 
 ***/
public abstract class Funcionario {

private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public abstract double getSalario();
	
	public abstract double getComissao();
}
