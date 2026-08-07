package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {
	
	void insert(Seller obj);	// Método que vai adicionar um department ao banco de dados
	void update(Seller obj);	// Método que atualiza um department do banco de dados
	void deleteById(int id);	// Método que deleta um department do banco de dados baseado no ID
	Seller findById(int id);	// Método que retorna um department do banco de dados baseado no ID
	List<Seller> findAll();		// Retorna uma lista com todos os department
	
}
