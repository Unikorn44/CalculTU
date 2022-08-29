package fr.m2i.service;

import fr.m2i.logique.Calculette;

public class CalculetteService {
	private final Calculette calculette;
	
	public CalculetteService(Calculette calculette) {
		this.calculette = calculette;
	}
	
	public Integer addition(Integer a, Integer b) {
		return calculette.addition(a,b);
	}
	
	public Integer soustraction(Integer a, Integer b) {
		return calculette.soustraction(a,b);
	}
	
	public Integer multiplication(Integer a, Integer b) {
		return calculette.multiplication(a,b);
	}
	
	public Integer division(Integer a, Integer b) {
		return calculette.division(a,b);
	}
}
