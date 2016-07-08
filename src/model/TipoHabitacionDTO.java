package model;

public class TipoHabitacionDTO {
	
	private int tipo_hab; // INT not null primary key,
	private String desc_hab; // VARCHAR(11)
	private String image_tipo;
	private Double precio;
	
	public TipoHabitacionDTO(int tipo_hab, String desc_hab) {
		super();
		this.tipo_hab = tipo_hab;
		this.desc_hab = desc_hab;
	}
	
	public TipoHabitacionDTO(){}

	public int getTipo_hab() {
		return tipo_hab;
	}

	public void setTipo_hab(int tipo_hab) {
		this.tipo_hab = tipo_hab;
	}

	public String getDesc_hab() {
		return desc_hab;
	}

	public void setDesc_hab(String desc_hab) {
		this.desc_hab = desc_hab;
	}

	@Override
	public String toString() {
		return "TipoHabitacionDTO [tipo_hab=" + tipo_hab + ", desc_hab="
				+ desc_hab + "]";
	}

	public String getImage_tipo() {
		return image_tipo;
	}

	public void setImage_tipo(String image_tipo) {
		this.image_tipo = image_tipo;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

}
