package dao;

import org.hibernate.Session;

import entity.Empleado;



public class EmpleadoDAO {
	
	// Create
	public static void insertEmpleado(Session s, Empleado empleado) {
		s.save(empleado);
	}
	
	// Read
	public static Empleado getEmpleado(Session s, int id) {
		return s.get(Empleado.class, id);
	}
	
	// Update
	public static void updateEmpleado(Session s, Empleado empleado) {
		s.update(empleado);
	}
	
	// Delete
	public static void deleteEmpleado(Session s, Empleado empleado) {
		s.delete(empleado);
	}

}
