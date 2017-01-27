package br.com.alura;

import static org.junit.Assert.assertEquals;

import java.text.NumberFormat;
import java.util.Locale;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;

import org.javamoney.moneta.Money;
import org.javamoney.moneta.function.MonetaryOperators;
import org.junit.Test;

import br.com.caelum.stella.inwords.FormatoDeReal;
import br.com.caelum.stella.inwords.NumericToWordsConverter;

public class MoneyTest {

	@Test
	public void monetaryTest() {
		CurrencyUnit moeda = Monetary.getCurrency("BRL");
		MonetaryAmount valor = Money.of(750.35, moeda);
		//System.out.println(valor);
		assertEquals("BRL 750.35", valor.toString());

		assertEquals("BRL 75035", valor.multiply(10).multiply(10).toString());
	}

	@Test
	public void moneteryDiscountInFullTest() {
		CurrencyUnit moeda = Monetary.getCurrency("BRL");
	    MonetaryAmount valorDaParcela = Money.of(75, moeda);
	    MonetaryAmount valorTotal = valorDaParcela.multiply(12);
	    MonetaryAmount desconto = valorTotal.with(MonetaryOperators.percent(10));
	    
	    NumericToWordsConverter conversor = new NumericToWordsConverter(new FormatoDeReal());
	    assertEquals("noventa reais", conversor.toWords(desconto.getNumber().doubleValue()));
	    
	    NumberFormat nf = NumberFormat.getCurrencyInstance();
	    System.out.println(Locale.getDefault());
	    assertEquals("R$ 90,00", nf.format(desconto.getNumber().doubleValue()));
	}
}
