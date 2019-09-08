package br.com.marcos.projetoweb.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import br.com.marcos.projetoweb.conexao.Conexao;
import br.com.marcos.projetoweb.model.Cliente;


public class ClienteDAO {
	private Connection conexao;
	private PreparedStatement stmt;
	
	public ClienteDAO() {
		Conexao conn = new Conexao();
		this.conexao = conn.getConexao();
	}
	
	public boolean inserirF(Cliente c) {
		String sql1 = "INSERT INTO cliente (nome, endereco, telefone) VALUES(?,?,?)";
		String sql2 = "INSERT INTO pessoaFisica(cpf, cliente) VALUES (?,?)";

		try {
			stmt = conexao.prepareStatement(sql1, Statement.RETURN_GENERATED_KEYS);
			stmt.setString(1, c.getNome());
			stmt.setString(2, c.getEndereco());
			stmt.setString(3, c.getTelefone());
			stmt.execute();
			
			//Buscar o ID inserido
			ResultSet rs = stmt.getGeneratedKeys();
			rs.next();
			stmt.close();
			stmt = conexao.prepareStatement(sql2);
			stmt.setString(1, c.getCpf());
			stmt.setInt(2, rs.getInt(1));
			stmt.execute();
			stmt.close();
			
			return true;
			
		}catch(Exception e) {
			throw new RuntimeException(e);
		}
	}
	
}
