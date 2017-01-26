package br.com.alura;

import org.junit.Test;

import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;

public class ValidacaoCpfTest {
	
	@Test(expected = InvalidStateException.class)
	public void validaCPFInvalidoTest() {
		String cpf = "99988399125";
		CPFValidator validator = new CPFValidator();
		validator.assertValid(cpf);
	}

	@Test
	public void validaValidoCPFTest() {
		String cpf = "99988399120";
		CPFValidator validator = new CPFValidator();
		validator.assertValid(cpf);
	}
}
