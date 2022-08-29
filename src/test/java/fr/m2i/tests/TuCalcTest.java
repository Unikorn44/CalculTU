package fr.m2i.tests;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import fr.m2i.logique.Calculette;
import fr.m2i.service.CalculetteService;

@ExtendWith(MockitoExtension.class)
public class TuCalcTest {
	@Mock
	Calculette calculette;
	
	CalculetteService classUnderTest;
	
	@BeforeEach
	public void init() {
		classUnderTest = new CalculetteService(calculette);
	}
	
	@Test
	public void calcul_Addition_test() {
		// GIVEN
		when(calculette.addition(5, 6)).thenReturn(11);
		
		// WHEN
		final int result = classUnderTest.addition(5, 6);
		
		// THEN
		verify(calculette).addition(5,6);
		assertThat(result).isEqualTo(11);
	}
	
	@Test
	public void calcul_Soustraction_test() {
		// GIVEN
		when(calculette.soustraction(8, 4)).thenReturn(4);
		
		// WHEN
		final int result = classUnderTest.soustraction(8, 4);
		
		// THEN
		verify(calculette).soustraction(8, 4);
		assertThat(result).isEqualTo(4);
	}
	
	@Test
	public void calcul_Multiplication_test() {
		// GIVEN
		when(calculette.multiplication(7, 3)).thenReturn(21);
		
		// WHEN
		final int result = classUnderTest.multiplication(7, 3);
		
		// THEN
		verify(calculette).multiplication(7, 3);
		assertThat(result).isEqualTo(21);
	}
	
	@Test
	public void calcul_Division_test() {
		// GIVEN
		when(calculette.division(25, 5)).thenReturn(5);
		
		// WHEN
		final int result = classUnderTest.division(25, 5);
		
		// THEN
		verify(calculette).division(25, 5);
		assertThat(result).isEqualTo(5);
	}
}