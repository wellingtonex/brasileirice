package br.com.alura;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.caelum.stella.format.CPFFormatter;
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
	
	@Test
	public void removeFormatacaoTest() {
		String cpf = "862.883.667-57";
		CPFFormatter formatter = new CPFFormatter();
		assertEquals("86288366757", formatter.unformat(cpf));
	}
	
	@Test
	public void formataTest() {
		String cpf = "86288366757";
		CPFFormatter formatter = new CPFFormatter();
		assertEquals("862.883.667-57", formatter.format(cpf));
	}
}
