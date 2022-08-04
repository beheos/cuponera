package como.demo.cuponera.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import como.demo.cuponera.model.RestauranteModel;

public interface RestauranteRepository extends JpaRepository<RestauranteModel, Long> {

}
