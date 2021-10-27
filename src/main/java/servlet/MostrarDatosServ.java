package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MostrarDatosServ
 */
@WebServlet(
		urlPatterns = { "/MostrarDatos" }, 
		initParams = { 
				@WebInitParam(name = "table", value = "DireccionServletCorresp")
		})
public class MostrarDatosServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MostrarDatosServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String param=request.getParameter("table");
		
		if (param!=null) {
			if (param.equals("departamento")) {
				request.getRequestDispatcher("/MostrarDepartamentos").forward(request, response);
				// logger
			} else if (param.equals("empleado")){
				request.getRequestDispatcher("/MostrarEmpleados").forward(request, response);
				// logger
			}
			
		}
		else {
			// logger
		}
		
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
