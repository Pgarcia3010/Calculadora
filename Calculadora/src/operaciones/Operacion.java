package operaciones;

import java.util.Arrays;

public class Operacion {

	@Override
	public String toString() {
		return "Operacion [resultado=" + resultado + ", operacion=" + operacion + ", operandos="
				+ Arrays.toString(operandos) + "]";
	}

	int resultado = 0;
	String operacion = "";
	int[] operandos = new int[2];

	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}

	public String getOperacion() {
		return operacion;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}

	public int[] getOperandos() {
		return operandos;
	}

	public void setOperandos(int[] operandos) {
		this.operandos = operandos;
	}

}
