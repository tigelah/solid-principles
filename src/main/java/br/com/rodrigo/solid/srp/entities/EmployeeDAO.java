package br.com.rodrigo.solid.srp.entities;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDAO {

	public void save(Employee employee) throws SQLException{
		
		ConnectionDAO connectionDAO = new ConnectionDAO("root", "");
		connectionDAO.setDbms("mysql");
		connectionDAO.setServerName("localhost");
		connectionDAO.setPortNumber("8080");
		connectionDAO.setDbName("mock");
	   
		try (Connection connection = connectionDAO.createConnection();
			 Statement stmt = connection.createStatement();) {
			
			String sql = "insert into funcionario (id, nome, salario) values (" + employee.getId() + "," +
					employee.getNome() + "," + employee.getSalario() + ")";
			int rs = stmt.executeUpdate(sql);
			
			if (rs == 1){
			//	logger.info("Funcionario inserido com sucesso.");
			}
		} catch (SQLException e) {
			//logger.error("Nenhum funcionario inserido." + e);
		}
	}
}
