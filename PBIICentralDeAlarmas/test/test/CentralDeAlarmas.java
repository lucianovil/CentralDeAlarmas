package test;

import static org.junit.Assert.*;

import org.junit.Test;

import src.Alarma;
import src.Central;
import src.Usuario;
import src.UsuarioConfigurador;

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
	
	@Test
	public void QueSePuedaRegistrarUnaAlarmaEnLaCentral() {
		Central atucha = new Central();
		Integer idAlarma = 1;
		Integer codigoActivacion = 1234;
		Integer codigoConfiguracion= 0000;
		String nombre = "TuAlarma";
		Alarma nuevo = new Alarma(idAlarma, codigoActivacion, codigoConfiguracion, nombre);
		assertTrue(atucha.agregarAlarma(nuevo));
	}
	
	@Test
	public void QueSePuedaAgregarUnUsuarioConfiguradorAUnaAlarma() {
		Central atucha = new Central();
		Integer idAlarma = 1;
		Integer codigoActivacion = 1234;
		Integer codigoConfiguracion= 0000;
		String nombre = "TuAlarma";
		Alarma nuevo = new Alarma(idAlarma, codigoActivacion, codigoConfiguracion, nombre);
		assertTrue(atucha.agregarAlarma(nuevo));
		Integer id =10;
		String userName = "Pepito";
		UsuarioConfigurador pepito = new UsuarioConfigurador(id, userName);
		assertTrue(atucha.registrarUsuario(pepito));
	}
}
