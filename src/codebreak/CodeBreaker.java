package codebreak;

public class CodeBreaker {
	int numeroPorAdivinar;

	public CodeBreaker(int numeroPorAdivinar) {
		super();
		this.numeroPorAdivinar = numeroPorAdivinar;
	}

	public String numeroEsta(String numeroStr) {
		String numeroPorAdivinarStr = Integer.toString(numeroPorAdivinar);
		String resultado = "";
		Character caracter1;
		Character caracter2;

		if (numeroPorAdivinarStr.equalsIgnoreCase(numeroStr)) {
			return "XXXX";
		}

		for (int i = 0; i < numeroPorAdivinarStr.length(); i++) {
			caracter1 = numeroPorAdivinarStr.charAt(i);
			for (int j = 0; j < numeroStr.length(); j++) {
				caracter2 = numeroStr.charAt(j);
				if (caracter1.equals(caracter2)) {
					if (i == j) {
						resultado = "X" + resultado;
					} else {
						resultado = resultado + "_";
					}
				}
			}

		}
		return resultado;
	}

}
