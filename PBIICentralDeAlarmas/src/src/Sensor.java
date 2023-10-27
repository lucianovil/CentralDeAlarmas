package src;

public class Sensor {

	private Integer id_sensor;
	private Boolean estado;
	
	public Sensor(Integer id_sensor, Boolean estado) {
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
	
	
}
