package br.com.alura;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;

import br.com.caelum.stella.inwords.FormatoDeReal;
import br.com.caelum.stella.inwords.InteiroSemFormato;
import br.com.caelum.stella.inwords.NumericToWordsConverter;

public class ValoresPorExtensoTest {

	@Test
	public void escreveValorPorExtensoTest() {
		NumericToWordsConverter converter = new NumericToWordsConverter(new InteiroSemFormato());
		BigDecimal valor = new BigDecimal(750.00);
		
		assertEquals("setecentos e cinquenta", converter.toWords(valor.doubleValue()));
	}
	
	@Test
	public void escreveValorMonetarioPorExtensoTest() {
		NumericToWordsConverter converter = new NumericToWordsConverter(new FormatoDeReal());
		BigDecimal valor = new BigDecimal(750.30);
		//System.out.println(converter.toWords(valor.doubleValue()));
		assertEquals("setecentos e cinquenta reais e trinta centavos", converter.toWords(valor.doubleValue()));
	}
}
