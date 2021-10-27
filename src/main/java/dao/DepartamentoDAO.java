package dao;

import java.util.List;

import org.hibernate.Session;

import entity.Departamento;
import entity.Empleado;

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
	
	public static List<Departamento> getAllDepartamentos(Session s) {
		//String hQuery = "from Departamento"; // Sin ordenar
		String hQuery = "from Departamento order by codigo";
		List<Departamento> departamentoList = s.createQuery(hQuery, Departamento.class).list();
				   	   			           
		return departamentoList;
	}

}
