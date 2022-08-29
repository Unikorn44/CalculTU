package fr.m2i.logique;

public class Calculette {
	
	public Integer addition(Integer a, Integer b) {
		return a+b;		
	}

	public Integer soustraction(Integer a, Integer b) {
		return a-b;
	}

	public Integer multiplication(Integer a, Integer b) {	
		return a*b;
	}

	public Integer division(Integer a, Integer b) {
		return a/b;
	}

	public Integer puissance(Integer a, Integer b) {
		return (int)Math.pow(a,b); 
	}

	public boolean oddNumber(int a) {
		return (a % 2) == 0;
	}
	
}
