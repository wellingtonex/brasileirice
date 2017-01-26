package br.com.alura;

import org.junit.Test;

import br.com.caelum.stella.validation.InvalidStateException;
import br.com.caelum.stella.validation.TituloEleitoralValidator;

public class ValidaTituloEleitorTest {

	@Test
	public void validaTituloEleitorValidoTest() {
		TituloEleitoralValidator validator = new TituloEleitoralValidator();
		validator.assertValid("417453530116");
	}
	
	@Test(expected=InvalidStateException.class)
	public void validaTituloEleitorInvalidoTest() {
		TituloEleitoralValidator validator = new TituloEleitoralValidator();
		validator.assertValid("417453530118");
	}
}
