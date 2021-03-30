package br.com.rodrigo.solid.srp.entities;

public class RegraVinteDoisEMeioPorcento implements RegraDeCalculo{


	@Override
	public double calcula(Employee employee) {

		return employee.getSalario() - (employee.getSalario() * 0.225);
	}

}