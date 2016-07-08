package model;

public class EmpleadoDTO {

	private String cod_empleado; // VARCHAR(50) not null primary key,
	private String primer_nombre; // VARCHAR(50),
	private String apellido; // VARCHAR(50),
	private String titulo; // VARCHAR(19)
	
	public EmpleadoDTO(String cod_empleado, String primer_nombre,
			String apellido, String titulo) {
		super();
		this.cod_empleado = cod_empleado;
		this.primer_nombre = primer_nombre;
		this.apellido = apellido;
		this.titulo = titulo;
	}
	
	public EmpleadoDTO(){}

	public String getCod_empleado() {
		return cod_empleado;
	}

	public void setCod_empleado(String cod_empleado) {
		this.cod_empleado = cod_empleado;
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

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "EmpleadoDTO [cod_empleado=" + cod_empleado + ", primer_nombre="
				+ primer_nombre + ", apellido=" + apellido + ", titulo="
				+ titulo + "]";
	}
	
	
	
}
