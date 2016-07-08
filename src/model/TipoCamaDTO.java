package model;

public class TipoCamaDTO {
	private int tipo_cama; // int not null primary key,
	private String desc_cama; // VARCHAR(6)
	
	public TipoCamaDTO(int tipo_cama, String desc_cama) {
		super();
		this.tipo_cama = tipo_cama;
		this.desc_cama = desc_cama;
	}
	
	public TipoCamaDTO(){}

	public int getTipo_cama() {
		return tipo_cama;
	}

	public void setTipo_cama(int tipo_cama) {
		this.tipo_cama = tipo_cama;
	}

	public String getDesc_cama() {
		return desc_cama;
	}

	public void setDesc_cama(String desc_cama) {
		this.desc_cama = desc_cama;
	}

	@Override
	public String toString() {
		return "TipoCamaDTO [tipo_cama=" + tipo_cama + ", desc_cama="
				+ desc_cama + "]";
	}
	
	

}
