package src;

import java.util.ArrayList;

public class Alarma {

	private Integer idAlarma;
	private Integer codigoActivacion;
	private Integer codigoConfiguracion;
	private String nombre;
	private ArrayList<Usuario> usuarios;
	private ArrayList<Accion> acciones;
	private ArrayList<Sensor> sensores;

	public Alarma(Integer idAlarma, Integer codigoActivacion, Integer codigoConfiguracion, String nombre) {
		this.idAlarma=idAlarma;
		this.codigoActivacion=codigoActivacion;
		this.codigoConfiguracion=codigoConfiguracion;
		this.nombre=nombre;
		this.usuarios =new ArrayList<Usuario>();
		this.acciones =new ArrayList<Accion>();
		this.sensores =new ArrayList<Sensor>();
	}

	public Integer getIdAlarma() {
		return idAlarma;
	}

	public void setIdAlarma(Integer idAlarma) {
		this.idAlarma = idAlarma;
	}

	public Integer getCodigoActivacion() {
		return codigoActivacion;
	}

	public void setCodigoActivacion(Integer codigoActivacion) {
		this.codigoActivacion = codigoActivacion;
	}

	public Integer getCodigoConfiguracion() {
		return codigoConfiguracion;
	}

	public void setCodigoConfiguracion(Integer codigoConfiguracion) {
		this.codigoConfiguracion = codigoConfiguracion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public ArrayList<Accion> getAcciones() {
		return acciones;
	}

	public void setAcciones(ArrayList<Accion> acciones) {
		this.acciones = acciones;
	}

	public ArrayList<Sensor> getSensores() {
		return sensores;
	}

	public void setSensores(ArrayList<Sensor> sensores) {
		this.sensores = sensores;
	}

	
	
}
