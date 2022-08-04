package como.demo.cuponera.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import como.demo.cuponera.model.UsuarioModel;
import como.demo.cuponera.repository.UsuarioReposistory;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	UsuarioReposistory usuarioReposistory;
	
	
	@Override
	@Transactional
	public UsuarioModel addUsuario(UsuarioModel usuario) {
		UsuarioModel newUsuario =  usuarioReposistory.save(usuario);
		return newUsuario;
	}


	@Override
	public List<UsuarioModel> listaUsuarios() {
		return usuarioReposistory.findAll();
	}


	@Override
	public UsuarioModel obtenerUsuario(Long id) {
		Optional<UsuarioModel> usuarioOptional = usuarioReposistory.findById(id);
		if(usuarioOptional.isPresent()) {
			return usuarioOptional.get();
		}
		return null; 
	}

}
