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
	
	@RequestMapping(value = "/subtraction/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	private Double subtraction(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		if(!isNumeric(numberOne) || !isNumeric(numberTwo))
			throw new UnsuportedMathOperacionException("Please set a numeric value!");
		
		return convertToDouble(numberOne) - convertToDouble(numberTwo);
	}
	
	@RequestMapping(value = "/division/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	private Double division(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		if(!isNumeric(numberOne) || !isNumeric(numberTwo))
			throw new UnsuportedMathOperacionException("Please set a numeric value!");
		
		return convertToDouble(numberOne) / convertToDouble(numberTwo);
	}
	
	@RequestMapping(value = "/multiplication/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	private Double multiplication(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		if(!isNumeric(numberOne) || !isNumeric(numberTwo))
			throw new UnsuportedMathOperacionException("Please set a numeric value!");
		
		return convertToDouble(numberOne) * convertToDouble(numberTwo);
	}
	
	@RequestMapping(value = "/mean/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	private Double mean(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
		if(!isNumeric(numberOne) || !isNumeric(numberTwo))
			throw new UnsuportedMathOperacionException("Please set a numeric value!");
		
		return (convertToDouble(numberOne) + convertToDouble(numberTwo))/2;
	}
	
	@RequestMapping(value = "/sqrt/{numberOne}", method = RequestMethod.GET)
	private Double sqrt(@PathVariable(value = "numberOne") String numberOne) throws Exception {
		if(!isNumeric(numberOne))
			throw new UnsuportedMathOperacionException("Please set a numeric value!");
		
		return (Double) Math.sqrt(convertToDouble(numberOne));
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
