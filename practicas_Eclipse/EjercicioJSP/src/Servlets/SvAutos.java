package Servlets;

import java.util.*;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SvAutos")
public class SvAutos extends HttpServlet {       

    public SvAutos() {
        super();
    }  

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
		List<Auto> listaDeAutos = new LinkedList <>();
	    listaDeAutos.add(new Auto("00A", "123456", "Fiat", "2000", "Gris", "Naftero"));
	    listaDeAutos.add(new Auto("90R","789456", "Renault", "2001", "Blanco", "Gasolero"));
	    listaDeAutos.add(new Auto("45W", "654456", "Peugeot", "2002", "Rojo", "Naftero"));   
	    listaDeAutos.add(new Auto("67R", "489456", "BMW", "2010", "Negro", "Naftero"));   


		HttpSession miSesion = request.getSession();
		miSesion.setAttribute("listaDeAutos", listaDeAutos);
		
		response.sendRedirect("mostrarAutos.jsp");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");		
		String patente = request.getParameter("patente");
		String marca = request.getParameter("marca");
		String modelo = request.getParameter("modelo");
		String color = request.getParameter("color");
		String tipoMotor = request.getParameter("tipoMotor");

	}

}
