package mybatis.mapper;

import java.util.List;

import model.TipoHabitacionDTO;

public interface TipoHabitacionMapper {
	
	List<TipoHabitacionDTO> getTipos();

	TipoHabitacionDTO obtenerTipo(Integer id);
}
