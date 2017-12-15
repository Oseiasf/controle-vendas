package br.com.ifpe.vendas.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.ifpe.vendas.util.ConnectionFactory;

public class VendaDAO {
	private Connection connection;

	public VendaDAO() {

		try {
			this.connection = new ConnectionFactory().getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Venda> listar() {
		try {
			List<Venda> listaVenda = new ArrayList<Venda>();
			PreparedStatement stmt = this.connection.prepareStatement("SELECT * FROM venda ORDER BY codigo");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Venda venda = new Venda();
				venda.setCodigo(rs.getInt("codigo"));
				

				listaVenda.add(venda);
			}
			stmt.execute();
			connection.close();
			return listaVenda;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
