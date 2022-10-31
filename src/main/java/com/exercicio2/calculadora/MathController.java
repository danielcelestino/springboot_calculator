package com.exercicio2.calculadora;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.exercicio2.calculadora.exception.UnsuportedMathOperacionException;

@RestController
public class MathController {
	
	@RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	private Double sum(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		if(!isNumeric(numberOne) || !isNumeric(numberTwo))
			throw new UnsuportedMathOperacionException("Please set a numeric value!");
		
		return convertToDouble(numberOne) + convertToDouble(numberTwo);
	}

	private Double convertToDouble(String number) {
		if(number == null) return 0D;
		String str = number.replaceAll(",", ".");
		if(isNumeric(str)) {
			return Double.valueOf(str);
		}
		return 0D;
	}

	private boolean isNumeric(String number) {
		if (number == null) {
			return false;
		}else{
			String str = number.replaceAll(",", ".");
			return str.matches("[-+]?[0-9]*\\.?[0-9]+");
		}
	}

}
