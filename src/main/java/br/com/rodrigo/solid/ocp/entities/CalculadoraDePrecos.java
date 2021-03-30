package br.com.rodrigo.solid.ocp.entities;

import br.com.rodrigo.solid.ocp.correct.Produto;

/**
 * 
 * [O]pen/Closed Principle (Princípio do Aberto/Fechado)
 * as entidades de software (classes, módulos, funções etc.) devem ser abertas para ampliação, mas fechadas para modificação”.
 * Neste case o principio esta sendo violado, pois a classe de Calculadora esta dependendo cada vez de outras classes, 
 * alem de aclopamento, para resolver isto basta ver no package ocp.correct
 * 
 * */
public class CalculadoraDePrecos {
	public double calcula(Produto produto) {

        Frete frete = new Frete();
        double desconto = 0d;
        
        int regra = produto.getMeioPagamento();
        
        switch(regra) {
	        case 1:
	        	System.out.println("Venda à vista");
	        	TabelaDePrecoAVista tabela1 = new TabelaDePrecoAVista();
	        	desconto = tabela1.calculaDesconto(produto.getValor());
	        	break;
	        case 2:
	        	System.out.println("Venda à prazo");
	        	TabelaDePrecoAPrazo tabela2 = new TabelaDePrecoAPrazo();
	        	desconto = tabela2.calculaDesconto(produto.getValor());
	        	break;
        }
        
        double valorFrete = frete.calculaFrete(produto.getEstado());
        return produto.getValor() * (1 - desconto) + valorFrete;
    }

}
