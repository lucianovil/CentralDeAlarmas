package test;

import static org.junit.Assert.*;

import org.junit.Test;

import src.Alarma;
import src.Central;
import src.Sensor;
import src.Usuario;
import src.UsuarioActivador;
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
	
	@Test //test punto 1.
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
	public void QueSePuedaAgregarUnUsuarioConfiguradorOActivadorAUnaAlarma() {
		Central atucha = new Central();
		Integer idAlarma = 1;
		Integer codigoActivacion = 1234;
		Integer codigoConfiguracion= 0000;
		String nombre = "TuAlarma";
		Alarma nuevo = new Alarma(idAlarma, codigoActivacion, codigoConfiguracion, nombre);
		assertTrue(atucha.agregarAlarma(nuevo));
		Integer id =10;
		Integer id2 =5;
		String userName = "Pepito";
		UsuarioConfigurador pepito = new UsuarioConfigurador(id, userName);
		UsuarioActivador pepito2 = new UsuarioActivador(id2, userName);
		assertTrue(atucha.agregarUsuario(pepito));
		assertTrue(atucha.agregarUsuario(pepito2));
	}
	
	@Test //test punto 2.
	public void QueSePuedaAgregarUnUsuarioConfiguradorAUnaAlarma() {
		Central atucha = new Central();
		Integer idAlarma = 1;
		Integer codigoActivacion = 1234;
		Integer codigoConfiguracion= 0000;
		String nombre = "TuAlarma";
		Alarma nuevo = new Alarma(idAlarma, codigoActivacion, codigoConfiguracion, nombre);
		assertTrue(atucha.agregarAlarma(nuevo));
		Integer id =10;
		Integer id2= 5;
		String userName = "Pepito";
		UsuarioConfigurador pepito = new UsuarioConfigurador(id, userName);
		assertTrue(nuevo.registrarUsuario(pepito));
		UsuarioConfigurador pepito2 = new UsuarioConfigurador(id2, userName);
		assertTrue(nuevo.registrarUsuario(pepito2));
	}
	
	@Test // preguntar
	public void QueSePuedaAgregarUnUsuarioValidoAUnaAlarma() {
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
		assertTrue(atucha.agregarUsuario(pepito));
	}
	
	@Test
	public void QueSePuedaAgregarUnSensorAUnaAlarma() {
		Central atucha = new Central();
		Integer idAlarma = 1;
		Integer codigoActivacion = 1234;
		Integer codigoConfiguracion= 0000;
		String nombre = "TuAlarma";
		Alarma nuevo = new Alarma(idAlarma, codigoActivacion, codigoConfiguracion, nombre);
		assertTrue(atucha.agregarAlarma(nuevo));
		Integer idSensor =1;
		Sensor ruido = new Sensor(idSensor);
		assertTrue(nuevo.agregarSensor(ruido));
	}
	
	@Test
	public void QueSePuedaActivarUnSensorAUnaAlarma() {
		Central atucha = new Central();
		Integer idAlarma = 1;
		Integer codigoActivacion = 1234;
		Integer codigoConfiguracion= 0000;
		String nombre = "TuAlarma";
		Alarma nuevo = new Alarma(idAlarma, codigoActivacion, codigoConfiguracion, nombre);
		assertTrue(atucha.agregarAlarma(nuevo));
		Integer idSensor =1;
		Sensor ruido = new Sensor(idSensor);
		assertTrue(nuevo.agregarSensor(ruido));
		assertTrue(nuevo.activarSensor(ruido));
	}
	
	@Test
	public void QueSePuedaActivarUnaAlarmaSiTodosLosSensoresEstanActivados() {
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
		assertTrue(atucha.agregarUsuario(pepito));
		Integer idSensor =1;
		Integer idSensor2 =2;
		Sensor ruido = new Sensor(idSensor);
		Sensor luz = new Sensor(idSensor2);
		assertTrue(nuevo.agregarSensor(ruido));
		assertTrue(nuevo.agregarSensor(luz));
		assertTrue(nuevo.activarSensor(ruido));
		assertTrue(nuevo.activarSensor(luz));
		assertTrue(nuevo.activarAlarma(idAlarma, codigoActivacion, pepito));
	}
	
}
