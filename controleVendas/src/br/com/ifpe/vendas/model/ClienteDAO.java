package br.com.ifpe.vendas.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.ifpe.vendas.util.ConnectionFactory;



public class ClienteDAO {

	private Connection connection;

	public ClienteDAO() {

		try {
			this.connection = new ConnectionFactory().getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}


	public List<Cliente> listar() {
		try {
			List<Cliente> listaCliente = new ArrayList<Cliente>();
			PreparedStatement stmt = this.connection.prepareStatement("SELECT * FROM cliente ORDER BY nome");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Cliente cliente = new Cliente();
				cliente.setNome(rs.getString("nome"));
				

				listaCliente.add(cliente);
			}
			stmt.execute();
			connection.close();
			return listaCliente;
			
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}
	
	public Cliente pegarId(Integer codigo) {
		
		try {
			PreparedStatement stmt = this.connection.prepareStatement("SELECT * FROM cliente WHERE id = ?");
			ResultSet rs = stmt.executeQuery();
			if(rs.next()){
				Cliente cliente = new Cliente();
			stmt.setInt(1, codigo);
			}

			stmt.execute();
			connection.close();
			
			stmt.execute();
			connection.close();
			
			return cliente;
		
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

		
	}

}