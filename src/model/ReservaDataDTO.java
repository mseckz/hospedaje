package model;

import java.util.Calendar;

public class ReservaDataDTO {
	
	private int cod_reserva; // INTEGER(10) NOT NULL AUTO_INCREMENT PRIMARY KEY,
	private String cod_empleado; // VARCHAR(50) null,
	private String cod_cliente; // VARCHAR(50),
	private Calendar fecha_reserva; // DATE,
	private int dias; // INT,
	private String cod_hab; // VARCHAR(3),
	private double monto_total; // DECIMAL(4,1)
	private byte[] foto;
	
	public ReservaDataDTO(int cod_reserva, String cod_empleado,
			String cod_cliente, Calendar fecha_reserva, int dias,
			String cod_hab, double monto_total) {
		super();
		this.cod_reserva = cod_reserva;
		this.cod_empleado = cod_empleado;
		this.cod_cliente = cod_cliente;
		this.fecha_reserva = fecha_reserva;
		this.dias = dias;
		this.cod_hab = cod_hab;
		this.monto_total = monto_total;
	}
	
	public ReservaDataDTO(){}

	public int getCod_reserva() {
		return cod_reserva;
	}

	public void setCod_reserva(int cod_reserva) {
		this.cod_reserva = cod_reserva;
	}

	public String getCod_empleado() {
		return cod_empleado;
	}

	public void setCod_empleado(String cod_empleado) {
		this.cod_empleado = cod_empleado;
	}

	public String getCod_cliente() {
		return cod_cliente;
	}

	public void setCod_cliente(String cod_cliente) {
		this.cod_cliente = cod_cliente;
	}

	public Calendar getFecha_reserva() {
		return fecha_reserva;
	}

	public void setFecha_reserva(Calendar fecha_reserva) {
		this.fecha_reserva = fecha_reserva;
	}

	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public String getCod_hab() {
		return cod_hab;
	}

	public void setCod_hab(String cod_hab) {
		this.cod_hab = cod_hab;
	}

	public double getMonto_total() {
		return monto_total;
	}

	public void setMonto_total(double monto_total) {
		this.monto_total = monto_total;
	}

	@Override
	public String toString() {
		return "ReservaDataDTO [cod_reserva=" + cod_reserva + ", cod_empleado="
				+ cod_empleado + ", cod_cliente=" + cod_cliente
				+ ", fecha_reserva=" + fecha_reserva + ", dias=" + dias
				+ ", cod_hab=" + cod_hab + ", monto_total=" + monto_total + "]";
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
	
	

}
