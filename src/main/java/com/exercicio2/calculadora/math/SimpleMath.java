package com.exercicio2.calculadora.math;

public class SimpleMath {
	
	public double sum(Double numberOne, Double numberTwo) {
		return numberOne + numberTwo;
	}

	public double subtratcion(Double numberOne, Double numberTwo) {
		return numberOne - numberTwo;
	}

	public double division(Double numberOne, Double numberTwo) {
		return numberOne / numberTwo;
	}
	
	public double multiplication(Double numberOne, Double numberTwo) {
		return numberOne * numberTwo;
	}
	
	public double mean(Double numberOne, Double numberTwo) {
		return sum(numberOne,numberTwo)/2;
	}
	
	public double sqrt(Double number) {
		return (Double) Math.sqrt(number);
	}
}
