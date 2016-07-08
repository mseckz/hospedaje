package action;

import java.util.List;

import org.joda.time.Days;
import org.joda.time.LocalDate;

import com.opensymphony.xwork2.ActionSupport;

import model.ClienteDTO;
import model.HabitacionDataDTO;
import model.ReservaUsuarioDTO;
import model.TipoHabitacionDTO;
import service.ClienteService;
import service.HabitacionService;

public class ReservaAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	private List<HabitacionDataDTO> habitaciones;
	private List<TipoHabitacionDTO> tipos;
	private ReservaUsuarioDTO reserva;
	private ReservaUsuarioDTO ultimaReserva;
	private Integer idTipo;
	private TipoHabitacionDTO tipo;
	private ClienteDTO cliente;
	
	HabitacionService habService = new HabitacionService();
	 
	public String index() {
		tipos = habService.obtenerTipos();
		return "ok";
	}
	
	public String showForm(){
		reserva = new ReservaUsuarioDTO();
		reserva.setTipo_hab(idTipo);
		return SUCCESS;
	}

	public String registrarReserva(){
		int dias = Days.daysBetween(new LocalDate(reserva.getFecha_llegada()), new LocalDate(reserva.getFecha_salida())).getDays();
		reserva.setDias(dias);
		reserva.setPersonas(reserva.getCuartos()*reserva.getTipo_hab());
		
		tipo = habService.obtenerTipo(reserva.getTipo_hab());
		reserva.setMonto(tipo.getPrecio()*reserva.getCuartos());
		
		habService.registrarReserva(reserva);
		reserva = new ReservaUsuarioDTO();
		ultimaReserva = habService.getUltimaReserva();
		return SUCCESS;
	}
	
	public String mostrarRegistroCliente(){
		cliente = new ClienteDTO();
		return SUCCESS;
	}
	
	public String registrarCliente() {
		ClienteService serv = new ClienteService();
		serv.registrarCliente(cliente);
		cliente = new ClienteDTO();
		addActionMessage("Cliente registrado con exito");
		return SUCCESS;
	}
	
	
	public List<HabitacionDataDTO> getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(List<HabitacionDataDTO> habitaciones) {
		this.habitaciones = habitaciones;
	}

	public List<TipoHabitacionDTO> getTipos() {
		return tipos;
	}

	public void setTipos(List<TipoHabitacionDTO> tipos) {
		this.tipos = tipos;
	}

	public ReservaUsuarioDTO getReserva() {
		if(reserva == null) reserva = new ReservaUsuarioDTO();
		return reserva;
	}

	public void setReserva(ReservaUsuarioDTO reserva) {
		this.reserva = reserva;
	}

	public ReservaUsuarioDTO getUltimaReserva() {
		return ultimaReserva;
	}

	public void setUltimaReserva(ReservaUsuarioDTO ultimaReserva) {
		this.ultimaReserva = ultimaReserva;
	}

	public Integer getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(Integer idTipo) {
		this.idTipo = idTipo;
	}

	public TipoHabitacionDTO getTipo() {
		if(tipo == null) tipo = new TipoHabitacionDTO();
		return tipo;
	}

	public void setTipo(TipoHabitacionDTO tipo) {
		this.tipo = tipo;
	}

	public ClienteDTO getCliente() {
		if(cliente == null) cliente = new ClienteDTO();
		return cliente;
	}

	public void setCliente(ClienteDTO cliente) {
		this.cliente = cliente;
	}
	
	
}
