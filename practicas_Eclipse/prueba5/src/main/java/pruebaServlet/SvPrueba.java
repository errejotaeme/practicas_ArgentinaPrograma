package pruebaServlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SvPrueba")
public class SvPrueba extends HttpServlet {
       
    public SvPrueba() {
        super();
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    }

    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    	//Simulo lista de clientes que podria venir de una BD
    	List <Cliente> listaClientes = new ArrayList<>();
    	listaClientes.add(new Cliente("123456", "Pepe", "Perez", "879423132"));
    	listaClientes.add(new Cliente("321654", "Carla", "Gomez", "7895422"));
    	listaClientes.add(new Cliente("789456", "Lucas", "Sosa", "98745612"));
    	listaClientes.add(new Cliente("789556", "Pedro", "Paredes", "9875412"));
    	
    	//seteo la lista de clientes como parámetro
    	//para utilizarla en cualquier JSP
    	//para eso traigo la sesion de la request
    	HttpSession misession = request.getSession();
    	misession.setAttribute("listaClientes", listaClientes);
    	
    	
    	
    	//redirecciono a otro jsp    	
    	response.sendRedirect("MostrarJSP.jsp");
    	
    	
	}

    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	//Variables que almacenan datos ingresados en el Formulario.JSP
    	String dni = request.getParameter("dni");
    	String nombre = request.getParameter("nombre");
    	String apellido = request.getParameter("apellido");
    	String telefono = request.getParameter("telefono");
    	
	}

}
