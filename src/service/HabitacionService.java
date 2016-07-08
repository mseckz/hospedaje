package service;

import java.util.List;

import model.HabitacionDataDTO;
import model.ReservaUsuarioDTO;
import model.TipoHabitacionDTO;
import mybatis.MyBatisUtil;
import mybatis.mapper.HabitacionDataMapper;
import mybatis.mapper.ReservaMapper;
import mybatis.mapper.TipoHabitacionMapper;

import org.apache.ibatis.session.SqlSession;

public class HabitacionService {
	
	public List<HabitacionDataDTO> listHabitaciones() {
		SqlSession session= MyBatisUtil.getSqlSessionFactory().openSession();
		HabitacionDataMapper habMapper = session.getMapper(HabitacionDataMapper.class);
		List<HabitacionDataDTO> habitaciones = habMapper.getHabitacionDTO();
		session.close();
		return habitaciones;
	}
	
	public List<TipoHabitacionDTO> obtenerTipos(){
		SqlSession session= MyBatisUtil.getSqlSessionFactory().openSession();
		TipoHabitacionMapper tipoMapper = session.getMapper(TipoHabitacionMapper.class);
		List<TipoHabitacionDTO> tipos = tipoMapper.getTipos();
		session.close();
		return tipos;
	}
	
	public void registrarReserva(ReservaUsuarioDTO reserv) {
		SqlSession session= MyBatisUtil.getSqlSessionFactory().openSession();
		ReservaMapper reservaMapper = session.getMapper(ReservaMapper.class);
		reservaMapper.registrarReserva(reserv);
		session.commit();
		session.close();
	}

	public ReservaUsuarioDTO getUltimaReserva() {
		SqlSession session= MyBatisUtil.getSqlSessionFactory().openSession();
		ReservaMapper reservaMapper = session.getMapper(ReservaMapper.class);
		ReservaUsuarioDTO r = reservaMapper.getUltimaReserva();
		session.close();
		return r;
	}
	
	public TipoHabitacionDTO obtenerTipo(Integer id) {
		SqlSession session= MyBatisUtil.getSqlSessionFactory().openSession();
		TipoHabitacionMapper tipoMapper = session.getMapper(TipoHabitacionMapper.class);
		TipoHabitacionDTO tipo = tipoMapper.obtenerTipo(id);
		session.close();
		return tipo;
	}

}
