package como.demo.cuponera.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import como.demo.cuponera.model.UsuarioModel;

public interface UsuarioReposistory extends JpaRepository<UsuarioModel, Long> {

}
