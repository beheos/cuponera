package como.demo.cuponera.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import como.demo.cuponera.model.RestauranteModel;
import como.demo.cuponera.repository.RestauranteRepository;

@Service
public class RestauranteServiceImpl implements RestauranteService {

	@Autowired
	RestauranteRepository restauranteRepository;
	
	@Override
	public List<RestauranteModel> listaRestaurantes() {
		return restauranteRepository.findAll();
	}

}
