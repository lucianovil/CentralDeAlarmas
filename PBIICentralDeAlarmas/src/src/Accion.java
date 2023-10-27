package src;

import java.util.Date;

public class Accion {

	private Integer id_accion;
	private Alarma id_alarma;
	private Usuario dni;
	private Date fecha;
	private Operacion tipo_operacion;
	
	public Accion(Integer id_accion, Alarma id_alarma, Usuario dni, Date fecha, Operacion tipo_operacion) {
		this.id_accion = id_accion;
		this.id_alarma = id_alarma;
		this.dni = dni;
		this.fecha = fecha;
		this.tipo_operacion = tipo_operacion;
	}

	public Integer getId_accion() {
		return id_accion;
	}

	public void setId_accion(Integer id_accion) {
		this.id_accion = id_accion;
	}

	public Alarma getId_alarma() {
		return id_alarma;
	}

	public void setId_alarma(Alarma id_alarma) {
		this.id_alarma = id_alarma;
	}

	public Usuario getDni() {
		return dni;
	}

	public void setDni(Usuario dni) {
		this.dni = dni;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Operacion getTipo_operacion() {
		return tipo_operacion;
	}

	public void setTipo_operacion(Operacion tipo_operacion) {
		this.tipo_operacion = tipo_operacion;
	}
	
	
}
