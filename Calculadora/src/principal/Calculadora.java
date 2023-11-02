package principal;

import java.util.ArrayList;

import menu.Menu;
import operaciones.Operacion;
import operaciones.Operaciones;

public class Calculadora {
	public static void main(String[] args) {

		Menu menu = new Menu();
		Operaciones operaciones = new Operaciones();

		ArrayList<Operacion> listadoOperaciones = new ArrayList<Operacion>();

		do {
			Operacion operacionActual = new Operacion();

			operacionActual.setOperandos(menu.pedirNumeros());

			operacionActual.setOperacion(menu.menuOpciones());

			if (operacionActual.getOperacion().equalsIgnoreCase("+")) {
				operacionActual.setResultado(
						operaciones.sumar(operacionActual.getOperandos()[0], operacionActual.getOperandos()[1]));
				System.out.println("Resultado: " + operacionActual.getResultado());
			} else if (operacionActual.getOperacion().equalsIgnoreCase("-")) {
				operacionActual.setResultado(
						operaciones.restar(operacionActual.getOperandos()[0], operacionActual.getOperandos()[1]));
				System.out.println("Resultado: " + operacionActual.getResultado());
			} else if (operacionActual.getOperacion().equalsIgnoreCase("*")) {
				operacionActual.setResultado(
						operaciones.multiplicar(operacionActual.getOperandos()[0], operacionActual.getOperandos()[1]));
				System.out.println("Resultado: " + operacionActual.getResultado());
			} else if (operacionActual.getOperacion().equalsIgnoreCase("/")) {
				operacionActual.setResultado(
						operaciones.dividir(operacionActual.getOperandos()[0], operacionActual.getOperandos()[1]));
				System.out.println("Resultado: " + operacionActual.getResultado());
			} else if (operacionActual.getOperacion().equalsIgnoreCase("%")) {
				operacionActual.setResultado(
						operaciones.resto(operacionActual.getOperandos()[0], operacionActual.getOperandos()[1]));
				System.out.println("Resultado: " + operacionActual.getResultado());
			} else {
				System.out.println("Operación no válida");
			}

			listadoOperaciones.add(operacionActual);

		} while (menu.repetir());
		
		System.out.println("Listado de operaciones efectuadas:");
		
		for (Operacion operacion : listadoOperaciones) {
			System.out.println(operacion.toString());
		}
		
		// TODO Mostrar los contenidos del Arraylist
	}
}