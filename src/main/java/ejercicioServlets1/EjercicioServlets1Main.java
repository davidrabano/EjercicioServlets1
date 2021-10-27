package ejercicioServlets1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import dao.EmpleadoDAO;
import entity.Empleado;



public class EjercicioServlets1Main {
	


	public static void main(String[] args) {
		
		
		/* PRUEBAS

		Session session = HibernateUtil.getSessionFactory().openSession(); // Copiada la clase HibernateUtil de su
																			// proyecto
		Transaction tx = null;

		try {

			tx = session.beginTransaction();
			
			List<Empleado> empleadosTabla=EmpleadoDAO.getAllEmpleados(session);
			
			for (Empleado empl : empleadosTabla) {
				
			}
			
			
			
			
			
			
			

		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			//logger.error(String.format("%1$s: error when inserting registries.", "insertEmpleado"), e);
		
		} finally {
			if (session != null) {
				session.close();
			}
		}
	*/
	}

}
