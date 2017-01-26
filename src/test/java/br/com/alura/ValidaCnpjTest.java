package br.com.alura;

import org.junit.Test;

import br.com.caelum.stella.validation.CNPJValidator;
import br.com.caelum.stella.validation.InvalidStateException;

public class ValidaCnpjTest {

	@Test
	public void validaCNPJValidoTest() {
		String cnpj = "82588641000173";
		CNPJValidator validadorCNPJ = new CNPJValidator();
		validadorCNPJ.assertValid(cnpj);
	}
	
	@Test(expected=InvalidStateException.class)
	public void validaCNPJInvalidoTest() {
		String cnpj = "82588641000175";
	    CNPJValidator validadorCNPJ = new CNPJValidator();
        validadorCNPJ.assertValid(cnpj);
	}
}
