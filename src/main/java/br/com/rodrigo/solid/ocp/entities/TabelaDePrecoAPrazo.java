package br.com.rodrigo.solid.ocp.entities;

public class TabelaDePrecoAPrazo {

	public double calculaDesconto(double valor) {
		if(valor > 100.0) {
			return 0.01;
		}else if(valor > 500.0) {
			return 0.02;
		}else if(valor > 1000.0) {
			return 0.05;
		}else {
			return 0d;
		}
	}
}
