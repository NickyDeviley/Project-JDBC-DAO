package model.dao;

import java.util.List;

import model.entities.Department;

public interface DeparmentDao {
	
	void insert(Department obj);	// Método que vai adicionar um department ao banco de dados
	void update(Department obj);	// Método que atualiza um department do banco de dados
	void deleteById(int id);		// Método que deleta um department do banco de dados baseado no ID
	Department findById(int id);	// Método que retorna um department do banco de dados baseado no ID
	List<Department> findAll();		// Retorna uma lista com todos os department
	
}
