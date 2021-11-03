package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import dao.DepartamentoDAO;
import dao.EmpleadoDAO;
import entity.Departamento;
import entity.Empleado;
import utils.HibernateUtil;

/**
 * Servlet implementation class MostrarDepartamentosServ
 */
//@WebServlet("/MostrarDepartamentosServ")
@WebServlet("/MostrarDepartamentos")
public class MostrarDepartamentosServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MostrarDepartamentosServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		processRequest(request, response);
		
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

	}
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		try (PrintWriter out = response.getWriter()) {
			/* TODO output your page here. You may use following sample code. */
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet Mostrar Departamentos</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Servlet MostrarDepartamentosServ at " + request.getContextPath() + "</h1>");
			
			out.println("<table>");
			out.println("<tr>");
			out.println("<td><strong>Código</strong></td>");
			out.println("<td><strong>Código_responsable</strong></td>");
			out.println("<td><strong>Nombre</strong></td>");
			//out.println("<td><strong></strong></td>");			
			out.println("</tr>");
	
			Session session = HibernateUtil.getSessionFactory().openSession(); // Copiada la clase HibernateUtil de su
			// proyecto
			Transaction tx = null;

			try {
				tx = session.beginTransaction();
				List<Departamento> departamentosTabla = DepartamentoDAO.getAllDepartamentos(session);
				for (Departamento dep : departamentosTabla) {
					out.println("<tr>");
					out.println("<td>" + dep.getCodigo() + "</td>");
					out.println("<td>" + dep.getCodResponsable() + "</td>");
					out.println("<td>" + dep.getNombre() + "</td>");
					out.println("<tr>");
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
			
			out.println("</table>");

			out.println("</body>");
			out.println("</html>");
		}
	}

}
