package com.ipartek.formacion.Principal;

import java.util.Scanner;

import com.ipartek.formacion.modelo.ClienteDaoArrayList;
import com.ipartek.formacion.pojo.Cliente;

public class Main {

	static final protected String OP_LISTAR = "1";
	static final protected String OP_CREAR = "2";
	static final protected String OP_ELIMINAR = "3";
	static final protected String OP_MODIFICAR = "4";
	static final protected String OP_SALIR = "s";
	private static Scanner entrada = null;
	private static String opc = "";
	private static boolean isValid = false;

	static private ClienteDaoArrayList lista = ClienteDaoArrayList.GetInstance();

	public static void main(String[] args) {

		entrada = new Scanner(System.in);

		do {

			pintarMenu("Libro");
			System.out.println("Introduzca una opcion del menu: \n");
			opc = entrada.nextLine();

			switch (opc) {

			case OP_LISTAR:

				listar();

				break;

			case OP_CREAR:

				break;

			case OP_ELIMINAR:

				break;

			case OP_MODIFICAR:

				break;

			case OP_SALIR:
				isValid = true;
				System.out.println("Has salido del programa, gracias...");

				break;

			default:
				System.out.println("no has introducido una Opcion Valida!!!!! Vuele a introducir el numero: \n");
				break;
			}

		} while (!isValid);
		entrada.close();
	}

	private static void listar() {

		for (Cliente l : lista.listar()) {

			// con el syso de abajo podemos sacar la lista de clientes acesando el
			// toString de Cliente.java
			// System.out.println(Cliente);
			System.out.printf("[%s] %-35s %4s paginas \n", l.getIdcliente(), l.getNombre(), l.getApellido());
		}

	}

	protected static void pintarMenu(final String nombrePojo) {

		System.out.println("************************************");
		System.out.println(" " + OP_LISTAR + ".- Listar todos los Clientes" + nombrePojo);
		System.out.println(" " + OP_CREAR + ".- Crear un " + nombrePojo);
		System.out.println(" " + OP_ELIMINAR + ".- Dar de baja un " + nombrePojo);
		System.out.println(" " + OP_MODIFICAR + ".- Editar un " + nombrePojo);
		System.out.println(" ");
		System.out.println(" " + OP_SALIR + " - Salir");
		System.out.println("************************************");

	}

}
