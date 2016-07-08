package model;

public class EstadoHabitacionDTO {
	
	private int estado_hab; // INT not null primary key,
	private String desc_estado; // VARCHAR(10)
	
	public EstadoHabitacionDTO(int estado_hab, String desc_estado) {
		super();
		this.estado_hab = estado_hab;
		this.desc_estado = desc_estado;
	}
	
	public EstadoHabitacionDTO(){}

	public int getEstado_hab() {
		return estado_hab;
	}

	public void setEstado_hab(int estado_hab) {
		this.estado_hab = estado_hab;
	}

	public String getDesc_estado() {
		return desc_estado;
	}

	public void setDesc_estado(String desc_estado) {
		this.desc_estado = desc_estado;
	}

	@Override
	public String toString() {
		return "EstadoHabitacionDTO [estado_hab=" + estado_hab
				+ ", desc_estado=" + desc_estado + "]";
	}
	
	

}
