package test;

import static org.junit.Assert.*;

import org.junit.Test;

import src.Usuario;

public class CentralDeAlarmas {

	@Test
	public void QueSePuedaCrearUnUsuario() {
		Integer dni =38123456;
		String nombre = "Lucho";
		Usuario nuevo = new Usuario(dni, nombre);
		assertNotNull(nuevo);
	}

}
