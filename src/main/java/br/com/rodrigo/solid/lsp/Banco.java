package br.com.rodrigo.solid.lsp;

import java.util.ArrayList;
import java.util.List;


/*
 * 
 * Princípio da Substituição de Liskov (LSP)
 * 
 * Diz que “Os subtipos devem ser substituíveis pelos seus tipos base”, 
 * e que as classes/tipos base podem ser substituídas por qualquer uma das suas subclasses,
 *  ponderando sobre os cuidados para usar a herança no seu projeto de software.
 * */
public class Banco {
	public void principal() throws Exception {
		List<ContaCorrenteComum> listaDeContas = new ArrayList<>();
		listaDeContas.add(new ContaCorrenteComum());
		listaDeContas.add(new ContaSalario());
			
		for (ContaCorrenteComum conta : listaDeContas) {
	            conta.rende();

	            System.out.println("Novo Saldo:");
	            System.out.println(conta.getSaldo());
	        }
	    }
}

