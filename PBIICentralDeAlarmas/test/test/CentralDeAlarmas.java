package test;

import static org.junit.Assert.*;

import org.junit.Test;

import src.Alarma;
import src.Usuario;

public class CentralDeAlarmas {

	@Test
	public void QueSePuedaCrearUnUsuario() {
		Integer dni =38123456;
		String nombre = "Lucho";
		Usuario nuevo = new Usuario(dni, nombre);
		assertNotNull(nuevo);
	}

	@Test
	public void QueSePuedaCrearUnaAlarma() {
		Integer idAlarma = 1;
		Integer codigoActivacion = 1234;
		Integer codigoConfiguracion= 0000;
		String nombre = "TuAlarma";
		Alarma nuevo = new Alarma(idAlarma, codigoActivacion, codigoConfiguracion, nombre);
		assertNotNull(nuevo);
	}
}
