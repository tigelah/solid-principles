package br.com.rodrigo.solid.dip;
/***
 * Princípio da Inversão de Dependências (DIP)
 * 
 * Diz que devemos “depender de abstrações e não de classes concretas”.
 * 
 * “Módulos de alto nível não devem depender de módulos de baixo nível.”
“As abstrações não devem depender de detalhes. Os detalhes devem depender das abstrações.”
 * 
 * **/
public class AddGroupController {

	private Validation validation;
	
	public AddGroupController(Validation validation) {
		this.validation = validation;
	}
	
	public void add() {
		this.validation.validate();
	}
	
}
