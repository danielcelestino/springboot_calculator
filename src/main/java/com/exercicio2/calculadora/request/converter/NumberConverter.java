package com.exercicio2.calculadora.request.converter;

public class NumberConverter {
	
	public static Double convertToDouble(String number) {
		if(number == null) return 0D;
		String str = number.replaceAll(",", ".");
		if(isNumeric(str)) {
			return Double.valueOf(str);
		}
		return 0D;
	}
	
	public static boolean isNumeric(String number) {
		if (number == null) {
			return false;
		}else{
			String str = number.replaceAll(",", ".");
			return str.matches("[-+]?[0-9]*\\.?[0-9]+");
		}
	}


}
