

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Eleve;
import service.EleveService;
import service.Serviceimp;

/**
 * Servlet implementation class EnterStu
 */
@WebServlet("/EnterStu")
public class EnterStu extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public EnterStu() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String surname = request.getParameter("surname");
		String classe = request.getParameter("classe");
		EleveService es = new Serviceimp();
		
		Eleve eleve = new Eleve(name,surname,classe);
		es.addEleve(eleve);
		
		request.setAttribute("eleve1", eleve);
		
		RequestDispatcher dispatch = request.getRequestDispatcher("result");
		
	}

}
