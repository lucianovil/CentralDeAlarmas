package src;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Alarma {

	private Integer idAlarma;
	private Integer codigoActivacion;
	private Integer codigoConfiguracion;
	private String nombre;
	private Set<Usuario> usuarios;
	private ArrayList<Accion> acciones;
	private Set<Sensor> sensores;
	private Boolean estadoAlarma;

	public Alarma(Integer idAlarma, Integer codigoActivacion, Integer codigoConfiguracion, String nombre) {
		this.idAlarma=idAlarma;
		this.codigoActivacion=codigoActivacion;
		this.codigoConfiguracion=codigoConfiguracion;
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

	public void setCodigoConfiguracion(Integer codigoConfiguracion) {
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

	public boolean agregarSensor(Sensor nuevo) {
		return sensores.add(nuevo);
	}

	public boolean activarSensor(Sensor nuevo) {
		Boolean estado = false;
		if(estado != nuevo.getEstado()) {
			return false;
		}
		nuevo.setEstado(true);
		return true;
	}

	public boolean activarAlarma(Integer idAlarma, Integer codigoActivacion, UsuarioConfigurador usuario) {
	
		for(Sensor actual: sensores) {
			if(actual.getEstado() != true) {
				return false;
			}
		}
		if(!this.codigoActivacion.equals(codigoActivacion)) {
			return false;
		}
		for (Usuario actual: usuarios) { //ver esto
			if(!actual.getDni().equals(usuario.getDni())) {
				return false;
		}
		}
		setEstadoAlarma(true);
		return true;
	}

	
	
}
