package mybatis.mapper;

import java.util.List;

import model.HabitacionDataDTO;

public interface HabitacionDataMapper {
	
	List<HabitacionDataDTO>buscar(HabitacionDataDTO habitacion);
	
	List<HabitacionDataDTO>getHabitacionDTO(); //ejemplo
	
	HabitacionDataDTO obtener(Integer codigo);
	
	HabitacionDataDTO obtenerDetalle(Integer codigo);
	
	void insertar (HabitacionDataDTO habitacion);
	
	void eliminar(Integer codigo);
	
	void actualizar(HabitacionDataDTO habitacion);

}
