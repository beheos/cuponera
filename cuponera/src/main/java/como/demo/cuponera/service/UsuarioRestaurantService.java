package como.demo.cuponera.service;

import java.util.List;
import como.demo.cuponera.model.UsuarioRestaurante;

public interface UsuarioRestaurantService {
	
	public  List<UsuarioRestaurante>obtenerCuponesByIdRestaurante(Long idRestaurante);
	
	public void addUsuarioRestaurante(UsuarioRestaurante usuarioRestaurante);

}
