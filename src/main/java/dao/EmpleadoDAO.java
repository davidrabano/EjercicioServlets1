package dao;

import java.util.List;

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
	
	public static List<Empleado> getAllEmpleados(Session s) {
		//String hQuery = "from Empleado"; // Sin ordenar
		String hQuery = "from Empleado order by codigo";
		List<Empleado> empleadoList = s.createQuery(hQuery, Empleado.class).list();
				   	   			           
		return empleadoList;
	}

}
