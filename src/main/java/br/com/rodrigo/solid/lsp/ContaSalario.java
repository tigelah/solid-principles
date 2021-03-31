package br.com.rodrigo.solid.lsp;

public class ContaSalario extends ContaCorrenteComum {
	
	public void rende() throws Exception {
        throw new Exception("Essa conta não possui rendimento");
  }
  
}