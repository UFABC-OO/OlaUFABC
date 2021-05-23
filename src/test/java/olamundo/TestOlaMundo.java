package olamundo;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class TestOlaMundo {

	@Test
	public void testOlaMundo() {
		PrintStream saidaSistema = System.out;
	    ByteArrayOutputStream saida = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(saida));

	    // ação
		OlaMundo.main(null);

		// comparação
		assertEquals("Sou UFABC!\n", saida.toString());

		// saída original
		System.setOut(saidaSistema);
	}
}

