package com.i3tv.test;

public class Factorial {

	/**
	 * Este método debe calcular y devolver el factorial de un número N
	 * @param n Número origen
	 * @return Factorial del número
	 */
	public static Integer getFactorial(Integer n) {
		int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
	}

}
