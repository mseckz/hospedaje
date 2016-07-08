package model;

public class AdministradorDTO {
	
	private String cod_usuario; // VARCHAR(50) not null primary key,
	private String clave; // VARCHAR(50),
	private String primer_nombre; // VARCHAR(50),
	private String apellido; // VARCHAR(50),
	private String nro_telefono; // VARCHAR(9),
	private String email; // VARCHAR(50) null
	
	public AdministradorDTO(String cod_usuario, String clave,
			String primer_nombre, String apellido, String nro_telefono,
			String email) {
		super();
		this.cod_usuario = cod_usuario;
		this.clave = clave;
		this.primer_nombre = primer_nombre;
		this.apellido = apellido;
		this.nro_telefono = nro_telefono;
		this.email = email;
	}
	
	public AdministradorDTO(){}

	public String getCod_usuario() {
		return cod_usuario;
	}

	public void setCod_usuario(String cod_usuario) {
		this.cod_usuario = cod_usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getPrimer_nombre() {
		return primer_nombre;
	}

	public void setPrimer_nombre(String primer_nombre) {
		this.primer_nombre = primer_nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNro_telefono() {
		return nro_telefono;
	}

	public void setNro_telefono(String nro_telefono) {
		this.nro_telefono = nro_telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "AdministradorDTO [cod_usuario=" + cod_usuario + ", clave="
				+ clave + ", primer_nombre=" + primer_nombre + ", apellido="
				+ apellido + ", nro_telefono=" + nro_telefono + ", email="
				+ email + "]";
	}
	
	

}
