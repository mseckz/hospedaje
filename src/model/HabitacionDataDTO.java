package model;

import java.io.Serializable;

public class HabitacionDataDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5847615722795795430L;
	private String cod_hab; // VARCHAR(3) not null primary key,
	private int tipo_hab; // INT,
	private int tipo_cama; // INT null ,
	private int estado_hab; // INT null ,
	private double costo_hab; // DECIMAL(4,1)
	private byte[] foto;
	
	
	
	public HabitacionDataDTO(String cod_hab, int tipo_hab, int tipo_cama,
			int estado_hab, double costo_hab, byte[] foto) {
		super();
		this.cod_hab = cod_hab;
		this.tipo_hab = tipo_hab;
		this.tipo_cama = tipo_cama;
		this.estado_hab = estado_hab;
		this.costo_hab = costo_hab;
		this.foto = foto;
	}

	public HabitacionDataDTO(){}

	public String getCod_hab() {
		return cod_hab;
	}

	public void setCod_hab(String cod_hab) {
		this.cod_hab = cod_hab;
	}

	public int getTipo_hab() {
		return tipo_hab;
	}

	public void setTipo_hab(int tipo_hab) {
		this.tipo_hab = tipo_hab;
	}

	public int getTipo_cama() {
		return tipo_cama;
	}

	public void setTipo_cama(int tipo_cama) {
		this.tipo_cama = tipo_cama;
	}

	public int getEstado_hab() {
		return estado_hab;
	}

	public void setEstado_hab(int estado_hab) {
		this.estado_hab = estado_hab;
	}

	public double getCosto_hab() {
		return costo_hab;
	}

	public void setCosto_hab(double costo_hab) {
		this.costo_hab = costo_hab;
	}

	@Override
	public String toString() {
		return "HabitacionDataDTO [cod_hab=" + cod_hab + ", tipo_hab="
				+ tipo_hab + ", tipo_cama=" + tipo_cama + ", estado_hab="
				+ estado_hab + ", costo_hab=" + costo_hab + "]";
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
	
	
}
