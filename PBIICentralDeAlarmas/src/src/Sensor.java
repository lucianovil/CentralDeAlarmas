package src;

import java.util.Objects;

public class Sensor {

	private Integer id_sensor;
	private Boolean estado;
	
	public Sensor(Integer id_sensor) {
		this.id_sensor = id_sensor;
		this.estado = false;
	}

	public Integer getId_sensor() {
		return id_sensor;
	}

	public void setId_sensor(Integer id_sensor) {
		this.id_sensor = id_sensor;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_sensor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sensor other = (Sensor) obj;
		return Objects.equals(id_sensor, other.id_sensor);
	}
	
	
}
