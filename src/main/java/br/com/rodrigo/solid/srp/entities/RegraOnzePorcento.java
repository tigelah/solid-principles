package br.com.rodrigo.solid.srp.entities;

public class RegraOnzePorcento implements RegraDeCalculo{

	@Override
	public double calcula(Employee employee) {
		// TODO Auto-generated method stub
		return employee.getSalario() - (employee.getSalario() * 0.11);
	}

}
