package br.com.alura;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.github.gilbertotorrezan.viacep.se.ViaCEPClient;
import com.github.gilbertotorrezan.viacep.shared.ViaCEPEndereco;

public class CepTest {

	@Test
	public void findCepTest() throws IOException {
		ViaCEPClient client = new ViaCEPClient();
		
		ViaCEPEndereco endereco = client.getEndereco("60830345");
		assertEquals("Rua Manuel Teixeira", endereco.getLogradouro());
		assertEquals("José de Alencar", endereco.getBairro());
		assertEquals("Fortaleza", endereco.getLocalidade());
	}
}
