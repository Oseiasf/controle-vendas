package util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entidades.Contato;

/**
 * @author Roberto Alencar
 */
public class ProdutoDao {

	private Connection connection;

	public ProdutoDao() {

		try {
			this.connection = new ConnectionFactory().getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void inserir(Produto produto) {

		String sql = "INSERT INTO produto (codigo_produto, unidade, descricao_produto,val_unit, ) VALUES (?,?,?,?)";
		PreparedStatement stmt;
		try {
			stmt = connection.prepareStatement(sql);

			stmt.setInt(1, produto.getCodigoProduto());
			stmt.setInt(2, produto.getUnidade());
			stmt.setString(3, produto.getDescricaoProduto());
			stmt.setDouble(4, produto.getValUnit());

			stmt.execute();
			connection.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public List<Produto> listar() {

		try {
			List<Produto> listaProduto = new ArrayList<Produto>();
			PreparedStatement stmt = this.connection.prepareStatement("SELECT * FROM produto ORDER BY codigo_produto");

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {

				Produto produto = new Produto();
				produto.setCodigoProduto(rs.getInt("getcodigo_produto"));
				produto.setUnidade(rs.getInt("unidade"));
				produto.setDescricaoProduto(rs.getString("descricao_produto"));
				produto.setValUnit(rs.getDouble("val_unit"));


				listaProduto.add(produto);
			}

			rs.close();
			stmt.close();
			connection.close();

			return listaProduto;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}