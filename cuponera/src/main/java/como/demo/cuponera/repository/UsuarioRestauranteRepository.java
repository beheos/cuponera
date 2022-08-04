package como.demo.cuponera.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import como.demo.cuponera.model.UsuarioRestaurante;

public interface UsuarioRestauranteRepository extends JpaRepository<UsuarioRestaurante, Long> {
	
	@Query(value = "SELECT * FROM cupones.usuariorestaurante where idrestaurante = ?1 and utilizado = true", nativeQuery=true)
	List<UsuarioRestaurante> findByIdRestaurante(Long restaurante);

}
