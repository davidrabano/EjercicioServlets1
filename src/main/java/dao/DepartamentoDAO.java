package dao;

import org.hibernate.Session;

import entity.Departamento;

public class DepartamentoDAO {
	
	// Create
	public static void insertDepartamento(Session s, Departamento departamento) {
		s.save(departamento);
	}
	
	// Read
	public static Departamento getDepartamento(Session s, int id) {
		return s.get(Departamento.class, id);
	}
	
	// Update
	public static void updateDepartamento(Session s, Departamento departamento) {
		s.update(departamento);
	}
	
	// Delete
	public static void deleteDepartamento(Session s, Departamento departamento) {
		s.delete(departamento);
	}

}
