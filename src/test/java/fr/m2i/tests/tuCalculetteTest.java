package fr.m2i.tests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import fr.m2i.logique.Calculette;

public class tuCalculetteTest {

	/*
	Set<Integer> monSet = new Set;
	monSet.add(5);
	
	assertThat(monSet).containsExactlyInAnyOrder(1,2,3,4,5);
	*/
	
	
	//création variable pour utilisation future
	private Calculette calc ;
	
	
	//pré-Organisation
	@BeforeEach
	public void init() {
		this.calc = new Calculette();
	}
	
	@AfterEach //Après CHAQUE test
	public void clean() {
		this.calc = null;
	}
	
	
	/*
	 * Test Addition
	 */
	@ParameterizedTest(name = "Opération {0} + {1} doit être égal à {2}")
	@CsvSource({"3,4,7","5,3,8"}) //les entrées tableau sont "arg1, arg2, resultatAttendu"
	public void additionTest(int a, int b, int resultatAttendu) {		
		
		//Organiser
		//fait dans le @BeforeEach et dans la préparation des données
		
		//Agir
		Integer resultatObtenu = this.calc.addition(a, b);
		
		//Vérifier
		//assertEquals(resultatAttendu, resultatObtenu);
		assertThat(resultatObtenu)
			.isEqualTo(resultatAttendu);
		
		//fail("test failed");		
	}
	
	
	/*
	 * Test soustraction, laissé en l'état pour l'exmeple 
	 */
	@Test
	public void soustractionTest() {
		
		//Organiser
		Integer a = 5;
		Integer b = 3;
		Integer resultatAttendu = 2;
		Calculette calcul = new Calculette();
		
		//Agir
		Integer resultatObtenu = calcul.soustraction(a, b);
		
		//Vérifier
		//assertEquals(resultatAttendu, resultatObtenu);
		assertThat(resultatObtenu)
			.isEqualTo(resultatAttendu);
		//fail("test failed");
	}
	
	/*
	 * Test Multiplication
	 */
	@ParameterizedTest(name = "Operation {0} * {1} = {2}")
	@CsvSource({"5,3,15","2,3,6"}) //les entrées tableau sont "arg1, arg2, resultatAttendu"
	public void multiplicationTest(int a, int b, int resultatAttendu) {
		
		//Organiser
		//fait en @BeforeEach
		
		//Agir
		Integer resultatObtenu = this.calc.multiplication(a, b);		
		//Vérifier
		//assertEquals(resultatAttendu, resultatObtenu);
		assertThat(resultatObtenu)
			.isEqualTo(resultatAttendu);
	}
	
	/*
	 * Test Addition
	 */
	@ParameterizedTest(name = "Operation {0} / {1} = {2}")
	@CsvSource({"6,3,2","18,3,6"}) 
	public void divisionTest(int a, int b, int resultatAttendu) {
		
		//Organiser

		//Agir
		Integer resultatObtenu = this.calc.division(a, b);
		
		//Vérifier
		//assertEquals(resultatAttendu, resultatObtenu);
		assertThat(resultatObtenu)
			.isEqualTo(resultatAttendu);
		//fail("test failed");
		
	}
	
	/*
	 * Test Puissance
	 */
	@ParameterizedTest(name = "Operation {0}^{1} = {2}")
	@CsvSource({"6,2,36","2,3,8"}) 
	public void puissanceTest(int a, int b, int resultatAttendu) {
		
		//Organiser
		
		//Agir
		Integer resultatObtenu = this.calc.puissance(a, b);
		//Vérifier
		//assertEquals(resultatAttendu, resultatObtenu);
		assertThat(resultatObtenu)
			.isEqualTo(resultatAttendu);
	}
	
	/*
	 * Test parité
	 */
	@ParameterizedTest(name = "Nombre {0} est pair")
	@ValueSource(ints = { 2, 4, 6, 8})
	public void testParité(int a) {
		boolean resultatObtenu = this.calc.oddNumber(a);
		//assertEquals(true, resultatObtenu);
		assertThat(resultatObtenu)
			.isTrue();
	}
	
	
	
	
}
