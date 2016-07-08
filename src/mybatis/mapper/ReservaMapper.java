package mybatis.mapper;

import model.ReservaUsuarioDTO;

public interface ReservaMapper {
	
	void registrarReserva(ReservaUsuarioDTO reserva);

	ReservaUsuarioDTO getUltimaReserva();

}
