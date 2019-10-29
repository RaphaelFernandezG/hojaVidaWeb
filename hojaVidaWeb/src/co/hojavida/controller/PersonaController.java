package co.hojavida.controller;

import java.io.IOException;
import java.io.Serializable;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.hojavida.dao.PersonaDAO;
import co.hojavida.model.Persona;

/**
 * Servlet implementation class PersonaController
 */
@WebServlet("/PersonaController")
public class PersonaController extends HttpServlet implements Serializable {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PersonaController() {
        super();
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
		// TODO Auto-generated method stub
		String nombres=request.getParameter("nombres");
		String primerapellido=request.getParameter("primerapellido");
		String segundoapellido=request.getParameter("segundoapellido");
		String tipodocumento=request.getParameter("tipodocumento");
		String numerodocumento=request.getParameter("numerodocumento");//int
		String sexo=request.getParameter("sexo");
		String fechanacimiento=request.getParameter("fechanacimiento");
		String paisnacimiento=request.getParameter("paisnacimiento");//int
		String departamentonacimiento=request.getParameter("departamentonacimiento");//int
		String municipionacimiento=request.getParameter("municipionacimiento");//int
		String correo=request.getParameter("correo");
		String password=request.getParameter("password");
		
		Persona p=new Persona();
		p.setNombres(nombres);
		p.setPrimerapellido(primerapellido);
		p.setSegundoapellido(segundoapellido);
		p.setTipodocumento(tipodocumento);
		p.setNumerodocumento(Integer.parseInt(numerodocumento));
		p.setSexo(sexo);
		p.setFechanacimiento(fechanacimiento);
		p.setPaisnacimiento(Integer.parseInt(paisnacimiento));
		p.setDepartamentonacimiento(Integer.parseInt(departamentonacimiento));
		p.setMunicipionacimiento(Integer.parseInt(municipionacimiento));
		p.setCorreo(correo);
		p.setPassword(password);
		
		PersonaDAO pa=new PersonaDAO();
		pa.insertarPersona(p);
		
		response.sendRedirect("pages/principal.jsp");
		
		
		
	}

	/**
	 * @see HttpServlet#doPut(HttpServletRequest, HttpServletResponse)
	 */
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doDelete(HttpServletRequest, HttpServletResponse)
	 */
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
