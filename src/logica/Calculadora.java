package logica;

public class Calculadora {
	private int val1;
	private int val2;
	
	public Calculadora() {
		
	}
	
	public Calculadora(int val1, int val2) {
		this.val1 = val1;
		this.val2 = val2;
	}

	public int getVal1() {
		return val1;
	}
	public void setVal1(int val1) {
		this.val1 = val1;
	}
	public int getVal2() {
		return val2;
	}
	public void setVal2(int val2) {
		this.val2 = val2;
	}
	
	public int suma() {
		return this.val1 + this.val2;
	}
	
	public int resta() {
		return this.val1 - this.val2;
	}
	
	public int multiplicacion() {
		return this.val1 * this.val2;
	}
	
	public double division() throws Exception {
		if(this.val2 != 0) return (double)this.val1 / (double)this.val2;
		else throw new Exception("Divisor igual a 0, no es posible operar");
	}
	
	public int factorial(int n) throws Exception {
		if(n>=0) {
			if(n == 1) return 1;
			else return n = n * factorial(n - 1);
		}else throw new Exception("Valor menor a 0, no es posible operar");
	}
	
	public double comb() throws Exception {
		double cm = (double)factorial(this.val1)/(factorial(this.val2)*factorial(this.val1 - this.val2));
		return cm;
	}
	
	
}
