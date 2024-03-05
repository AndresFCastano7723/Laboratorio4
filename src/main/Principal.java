package main;
import logica.Calculadora;

public class Principal {

	public static void main(String[] args) {
		Calculadora clc;
		clc = new Calculadora(5,3);
		int a = clc.getVal1();
		int b = clc.getVal2();
		System.out.println(a + "\t" + b);
		
		try{
			double div = clc.division();
			System.out.println(div);
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		try {
			int fac = clc.factorial(3);
			System.out.println(fac);
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		try {
			double cm = clc.comb();
			System.out.println(cm);
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

}
