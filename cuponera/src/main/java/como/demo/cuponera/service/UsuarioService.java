package como.demo.cuponera.service;

import java.util.List;

import como.demo.cuponera.model.UsuarioModel;

public interface UsuarioService {

	public UsuarioModel addUsuario(UsuarioModel usuario);
	
	public List<UsuarioModel>listaUsuarios();
	
	public UsuarioModel obtenerUsuario(Long id);
}
