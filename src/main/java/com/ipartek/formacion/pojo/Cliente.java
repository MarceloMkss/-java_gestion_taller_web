package com.ipartek.formacion.pojo;

public class Cliente implements Comparable<Cliente> {

	int idcliente;
	String nombre;
	String apellido;
	String domicilio;
	int codigoPostal;
	String localidad;
	String provincia;
	int movil;
	int telefono;
	String nif;
	String nie;
	String email;

	public Cliente() {

		super();
		this.idcliente = 0;
		this.nombre = "";
		this.apellido = "";
		this.domicilio = "";
		this.codigoPostal = 0;
		this.provincia = "";
		this.movil = 0;
		this.telefono = 0;
		this.nif = "";
		this.nie = "";
		this.email = "";

	}

	public Cliente(int idcliente, String nombre, String apellido, String domicilio, int codigoPostal, String localidad,
			String provincia, int movil, int telefono, String nif, String nie, String email) {
		this.idcliente = idcliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.domicilio = domicilio;
		this.codigoPostal = codigoPostal;
		this.localidad = localidad;
		this.provincia = provincia;
		this.movil = movil;
		this.telefono = telefono;
		this.nif = nif;
		this.nie = nie;
		this.email = email;
	}

	public int getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public int getMovil() {
		return movil;
	}

	public void setMovil(int movil) {
		this.movil = movil;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getNie() {
		return nie;
	}

	public void setNie(String nie) {
		this.nie = nie;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Cliente [idcliente = " + idcliente + ", nombre = " + nombre + ", apellido = " + apellido
				+ ", domicilio = " + domicilio + ", codigoPostal = " + codigoPostal + ", localidad = " + localidad
				+ ", provincia = " + provincia + ", movil = " + movil + ", telefono = " + telefono + ", nif = " + nif
				+ ", nie = " + nie + ", email = " + email + "]";
	}

	@Override
	public int compareTo(Cliente arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
