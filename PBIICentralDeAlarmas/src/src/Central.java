package src;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Central {

	private List<Alarma> alarmas;
	private Set<Usuario> usuarios;

	public Central() {
		this.alarmas = new ArrayList<Alarma>();
		this.usuarios = new HashSet<Usuario>();
	}

	public List<Alarma> getAlarmas() {
		return alarmas;
	}

	public void setAlarmas(List<Alarma> alarmas) {
		this.alarmas = alarmas;
	}

	public Set<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Set<Usuario> usuarios) {
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

	public Boolean agregarUsuario(Usuario usuario) {
		return this.usuarios.add(usuario);
		
	}
	
}
