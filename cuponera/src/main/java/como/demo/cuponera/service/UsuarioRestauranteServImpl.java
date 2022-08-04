package como.demo.cuponera.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import como.demo.cuponera.model.UsuarioRestaurante;
import como.demo.cuponera.repository.UsuarioRestauranteRepository;

@Service
public class UsuarioRestauranteServImpl implements UsuarioRestaurantService {

	@Autowired
	UsuarioRestauranteRepository usuarioRestauranteRepository;
	
	@Override
	public List<UsuarioRestaurante> obtenerCuponesByIdRestaurante(Long idRestaurante) {
		return usuarioRestauranteRepository.findByIdRestaurante(idRestaurante);
	}

	@Override
	public void addUsuarioRestaurante(UsuarioRestaurante usuarioRestaurante) {
		usuarioRestauranteRepository.save(usuarioRestaurante);
		
	}

}
