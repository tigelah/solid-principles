package br.com.rodrigo.solid.lsp;

public class ContaCorrenteComumCorrect {
	
	private GerenciadorContas gerenciador;

    public ContaCorrenteComumCorrect() {
        this.gerenciador = new GerenciadorContas();
    }

    public void deposita(double valor) {
        this.gerenciador.deposita(valor);
    }
    
    public void saca(double valor) {
    	this.gerenciador.saca(valor);
    }

    public double getSaldo() {
        return this.gerenciador.getSaldo();
    }

    public void rende() {
        this.gerenciador.rende(0.02);
    }
	
    @Override
    public String toString() {
    	return "Saldo conta corrente-> " + this.getSaldo();
    }	
}

