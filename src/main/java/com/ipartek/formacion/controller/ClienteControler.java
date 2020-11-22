package com.ipartek.formacion.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.modelo.ClienteDaoArrayList;
import com.ipartek.formacion.pojo.Cliente;

/**
 * Servlet implementation class ClienteControler
 */
@WebServlet("/ClienteControler")
public class ClienteControler extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ClienteControler() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ArrayList<Cliente> lista = new ArrayList<Cliente>();

		// conseguir clientes

		try {
			ClienteDaoArrayList dao = ClienteDaoArrayList.GetInstance();
			lista = dao.listar();
		} catch (Exception e) {
			e.printStackTrace();

		} finally {

			lista.add(new Cliente());

		}

		// enviarlos a la JSP

		request.setAttribute("clientes", lista);

		// ir a la JSP

		request.getRequestDispatcher("cliente.jsp").forward(request, response); // val al cliente.jsp cre he creado en
																				// webapp

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String mensaje = "";

		// recibri datos del formulario, fijaros en el input el atributo 'name'
		int idcliente = Integer.parseInt(request.getParameter("idcliente"));
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String domicilio = request.getParameter("domicilio");
		String codigoPostal = request.getParameter("codigoPostal");
		String localidad = request.getParameter("localidad");
		String provincia = request.getParameter("provincia");
		int telefono = Integer.parseInt(request.getParameter("telefono"));
		int movil = Integer.parseInt(request.getParameter("movil"));
		String nif = request.getParameter("nif");
		String nie = request.getParameter("nie");
		String email = request.getParameter("email");
	}

}
