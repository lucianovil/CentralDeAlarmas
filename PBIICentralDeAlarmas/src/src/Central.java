package src;

import java.util.ArrayList;
import java.util.List;

public class Central {

	private List<Alarma> alarmas;
	private List<Usuario> usuarios;

	public Central() {
		this.alarmas = new ArrayList<Alarma>();
		this.usuarios = new ArrayList<Usuario>();
	}

	public List<Alarma> getAlarmas() {
		return alarmas;
	}

	public void setAlarmas(List<Alarma> alarmas) {
		this.alarmas = alarmas;
	}
	
	

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Boolean agregarAlarma(Alarma alarma) {
		for(Alarma alarmaABuscar: alarmas) {
			if (alarmaABuscar.getIdAlarma().equals(alarma.getIdAlarma())) {
				return false;
			}
		}
		return this.alarmas.add(alarma);
		
	}

	public Boolean registrarUsuario(Usuario usuario) {
		for(Usuario usuarioABuscar: usuarios) {
			if (usuarioABuscar.getDni().equals(usuario.getDni())) {
				return false;
			}
		}
		return this.usuarios.add(usuario);
		
	}
	
	
}
