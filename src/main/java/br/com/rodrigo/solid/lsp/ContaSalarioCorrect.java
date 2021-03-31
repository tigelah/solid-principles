package br.com.rodrigo.solid.lsp;

public class ContaSalarioCorrect {
private GerenciadorContas gerenciador;
	
    public ContaSalarioCorrect() {
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
    
    @Override
    public String toString() {
    	return "Saldo conta salario-> " + this.getSaldo();
    }
}
