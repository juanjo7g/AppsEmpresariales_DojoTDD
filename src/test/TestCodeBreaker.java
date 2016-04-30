package test;

import static org.junit.Assert.*;

import org.junit.Test;

import codebreak.CodeBreaker;

public class TestCodeBreaker {
	CodeBreaker codeBreaker;
	String resultado;
	
	@Test
	public void numeroEsta() {
		codeBreaker = new CodeBreaker(1234);
		String resultado = codeBreaker.numeroEsta("2179");
		assertTrue(resultado.equals("__"));
	}
	
	@Test
	public void numeroEsta2() {
		codeBreaker = new CodeBreaker(1234);
		resultado = codeBreaker.numeroEsta("2163");
		assertTrue(resultado.equals("___"));
	}
	
	@Test
	public void todosNumerosEnPosicion(){
		codeBreaker= new CodeBreaker(1234);
		resultado = codeBreaker.numeroEsta("1234");
		assertTrue(resultado.equalsIgnoreCase("XXXX"));
	}
	
	@Test
	public void numeroEnPosicion(){
		codeBreaker= new CodeBreaker(1234);
		resultado = codeBreaker.numeroEsta("1567");
		assertTrue(resultado.equalsIgnoreCase("X"));
	}
	
	@Test
	public void xPrimero(){
		codeBreaker= new CodeBreaker(1234);
		resultado = codeBreaker.numeroEsta("1324");
		assertTrue(resultado.equalsIgnoreCase("XX__"));
	}
	
	
	
}
