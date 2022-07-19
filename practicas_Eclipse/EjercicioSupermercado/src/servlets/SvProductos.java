package servlets;


import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import conexionBD.Producto;
import conexionBD.altaProductos;





@WebServlet("/SvProductos")
public class SvProductos extends HttpServlet {
	private static final long serialVersionUID = 1L;
	  
	
    public SvProductos() {
        super();
    }
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Producto> listaProductos = altaProductos.traerProductos();
		
		try{HttpSession miSesion = request.getSession();
		miSesion.setAttribute("listaProductos", listaProductos);
		
		response.sendRedirect("mostrarProductos.jsp");
		}catch (Exception e){
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		int id = Integer.parseInt(request.getParameter("id"));
		String categoria = request.getParameter("categoria");
		String nombre = request.getParameter("nombre");
		String marca = request.getParameter("marca");
		float precio_costo = Integer.parseInt(request.getParameter("precio_costo"));
		float precio_venta = Integer.parseInt(request.getParameter("precio_venta"));
		int cantidad_stock = Integer.parseInt(request.getParameter("cantidad_stock"));
		
		try {
			altaProductos.agregarProducto(id, categoria, nombre, marca, precio_costo, precio_venta, cantidad_stock);
			response.sendRedirect("exito.jsp");
		} catch (Exception e) {;		
			e.printStackTrace();
		} 	

	}

}
