package mybatis.mapper;

import java.util.List;

import model.ClienteDTO;

public interface ClienteMapper {
	
	List<ClienteDTO>buscar(ClienteDTO cliente);
	
	ClienteDTO obtener(String nombre);
	
	ClienteDTO obtener(int cod_cli);
	
	void insertar(ClienteDTO cliente);
	
	void actualizar(ClienteDTO cliente);
	

}
