package com.ipartek.formacion.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ipartek.formacion.pojo.Cliente;

public class ClienteDaoArrayList implements ClienteDao {

	// ArrayList<Cliente> lista = new ArrayList<Cliente>();

	private static ClienteDaoArrayList INSTANCE = null;

	private ClienteDaoArrayList() {
		super();

		/*
		 * lista.add(new Cliente(1, "marcelo", "de souza", "larra�azubi", 48640,
		 * "berango", "vizcaya", 946256789, 625478562, "16456789M", "S2547896F",
		 * "marcos@gmail.com"));
		 */

	}

	public static synchronized ClienteDaoArrayList GetInstance() {

		if (INSTANCE == null) {
			INSTANCE = new ClienteDaoArrayList();
		}

		return INSTANCE;
	}

	@Override
	public Cliente recuperar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente crear(Cliente c) throws Exception {

		return null;
	}

	@Override
	public Cliente modificar(Cliente c) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eliminar(int id) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Cliente> listar() {

		final String SQL = "SELECT idcliente, nombre, apellido, domicilio, codigoPostal, localidad, provincia, telefono, movil, nif, nie,email FROM clientes ORDER BY nombre ASC;";
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();

		/*
		 * import java.sql.Connection; import java.sql.PreparedStatement; import
		 * java.sql.ResultSet; import java.sql.SQLException; import java.util.ArrayList;
		 */

		try (Connection conn = ConectionManager.getConnection();
				PreparedStatement pst = conn.prepareStatement(SQL);
				ResultSet rs = pst.executeQuery();) {

			System.out.println("***" + pst);

			while (rs.next()) {

				clientes.add(mapper(rs));

			} // while

		} catch (Exception e) {
			e.printStackTrace();
		}
		return clientes;
	}

	private Cliente mapper(ResultSet rs) throws SQLException {

		Cliente cliente = new Cliente();

		cliente.setIdcliente(rs.getInt("idcliente"));
		cliente.setNombre(rs.getString("nombre"));
		cliente.setApellido(rs.getString("apellido"));
		cliente.setDomicilio(rs.getString("domicilio"));
		cliente.setCodigoPostal(rs.getInt("codigoPostal"));
		cliente.setLocalidad(rs.getString("localidad"));
		cliente.setProvincia(rs.getString("provincia"));
		cliente.setTelefono(rs.getInt("telefono"));
		cliente.setMovil(rs.getInt("movil"));
		cliente.setNif(rs.getString("nif"));
		cliente.setNie(rs.getString("nie"));
		cliente.setEmail(rs.getString("email"));

		return cliente;
	}

}
