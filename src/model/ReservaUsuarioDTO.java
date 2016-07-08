package model;

import java.util.Date;

public class ReservaUsuarioDTO {
	
	private Integer id;
	private String nombres;
	private String apellidos;
	private String correo;
	private String telefono;
	private Integer cuartos;
	private Integer personas;
	private Integer dias;
	private Integer tipo_hab;
	private Date fecha_llegada;
	private Date fecha_salida;
	private Double monto;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Integer getCuartos() {
		return cuartos;
	}
	public void setCuartos(Integer cuartos) {
		this.cuartos = cuartos;
	}
	public Integer getPersonas() {
		return personas;
	}
	public void setPersonas(Integer personas) {
		this.personas = personas;
	}
	public Integer getDias() {
		return dias;
	}
	public void setDias(Integer dias) {
		this.dias = dias;
	}
	public Integer getTipo_hab() {
		return tipo_hab;
	}
	public void setTipo_hab(Integer tipo_hab) {
		this.tipo_hab = tipo_hab;
	}
	public Date getFecha_llegada() {
		return fecha_llegada;
	}
	public void setFecha_llegada(Date fecha_llegada) {
		this.fecha_llegada = fecha_llegada;
	}
	public Date getFecha_salida() {
		return fecha_salida;
	}
	public void setFecha_salida(Date fecha_salida) {
		this.fecha_salida = fecha_salida;
	}
	public Double getMonto() {
		return monto;
	}
	public void setMonto(Double monto) {
		this.monto = monto;
	}
	
}
