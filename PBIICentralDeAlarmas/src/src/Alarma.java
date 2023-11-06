package src;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import test.SensorDuplicadoException;

public class Alarma {

	private Integer idAlarma;
	private Integer codigoActivacion= 1234;
	private Integer codigoConfiguracion = 0000;
	private String nombre;
	private Set<Usuario> usuarios;
	private ArrayList<Accion> acciones;
	private Set<Sensor> sensores;
	private Boolean estadoAlarma;

	public Alarma(Integer idAlarma, Integer codigoActivacion, Integer codigoConfiguracion, String nombre) throws CodigoAlarmaIncorrectoException {
		this.idAlarma=idAlarma;
		this.codigoActivacion=codigoActivacion;
		this.setCodigoConfiguracion(codigoConfiguracion);
		this.nombre=nombre;
		this.usuarios =new HashSet<Usuario>();
		this.acciones =new ArrayList<Accion>();
		this.sensores =new HashSet<Sensor>();
		this.estadoAlarma=false;
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

	public void setCodigoConfiguracion(Integer codigoConfiguracion) throws CodigoAlarmaIncorrectoException {
		if(this.codigoConfiguracion != codigoConfiguracion) {
			throw new CodigoAlarmaIncorrectoException();
		}
		this.codigoConfiguracion = codigoConfiguracion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public ArrayList<Accion> getAcciones() {
		return acciones;
	}

	public void setAcciones(ArrayList<Accion> acciones) {
		this.acciones = acciones;
	}

	public Set<Sensor> getSensores() {
		return sensores;
	}

	public void setSensores(Set<Sensor> sensores) {
		this.sensores = sensores;
	}

	public Boolean getEstadoAlarma() {
		return estadoAlarma;
	}

	public void setEstadoAlarma(Boolean estadoAlarma) {
		this.estadoAlarma = estadoAlarma;
	}

	public boolean registrarUsuario(Usuario nuevo) {
		
		return usuarios.add(nuevo);
	}

	public boolean agregarSensor(Sensor nuevo) throws SensorDuplicadoException {
		if (buscarSensor(nuevo) != null) {
			throw new SensorDuplicadoException();
		}
		return sensores.add(nuevo);
	}
	
	public Sensor buscarSensor(Sensor nuevo) {
		for(Sensor actual: sensores) {
			if (actual.getId_sensor().equals(nuevo.getId_sensor())) {
				return actual;
			}
		}
		return null;
	}

	public boolean activarSensor(Sensor nuevo) {
		Boolean estado = false;
		if(estado != nuevo.getEstado()) {
			return false;
		}
		nuevo.setEstado(true);
		return true;
	}
	
	public boolean desactivarSensor(Sensor nuevo) {
		Boolean estado = true;
		if(estado != nuevo.getEstado()) {
			return false;
		}
		nuevo.setEstado(false);
		return true;
	}

	public boolean activarAlarma(Integer idAlarma, Integer codigoActivacion, UsuarioConfigurador usuario) {
	
		for(Sensor actual: sensores) {
			if(!actual.getEstado()) {
				return false;
			}
		}
		if(!this.codigoActivacion.equals(codigoActivacion)) {
			return false;
		}
		for (Usuario actual: usuarios) { //ver esto
			if(!actual.equals(usuario)) {
				return false;
		}
		}
		setEstadoAlarma(true);
		return true;
	}
	
	public boolean desactivarAlarma(Integer idAlarma, Integer codigoActivacion, UsuarioConfigurador usuario) {
		
		for(Sensor actual: sensores) {
			if(!actual.getEstado()) {
				return false;
			}
		}
		if(!this.codigoActivacion.equals(codigoActivacion)) {
			return false;
		}
		for (Usuario actual: usuarios) { //ver esto
			if(!actual.equals(usuario)) {
				return false;
		}
		}
		setEstadoAlarma(false);
		return true;
	}

	
	
}
