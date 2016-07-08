package service;

import model.ClienteDTO;
import mybatis.MyBatisUtil;
import mybatis.mapper.ClienteMapper;

import org.apache.ibatis.session.SqlSession;

public class ClienteService {
	
	public void registrarCliente(ClienteDTO cliente){
		SqlSession session= MyBatisUtil.getSqlSessionFactory().openSession();
		ClienteMapper cliMapper = session.getMapper(ClienteMapper.class);
		cliMapper.insertar(cliente);
		session.commit();
		session.close();
	}
}
