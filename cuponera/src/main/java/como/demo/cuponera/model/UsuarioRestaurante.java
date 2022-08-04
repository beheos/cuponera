package como.demo.cuponera.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usuariorestaurante")
public class UsuarioRestaurante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToOne
	@JoinColumn(name = "idusuario")
	private UsuarioModel usuario;
	@OneToOne
	@JoinColumn(name = "idrestaurante")
	private RestauranteModel restaurante;
	private boolean utilizado;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public UsuarioModel getUsuario() {
		return usuario;
	}
	public void setUsuario(UsuarioModel usuario) {
		this.usuario = usuario;
	}
	public RestauranteModel getRestaurante() {
		return restaurante;
	}
	public void setRestaurante(RestauranteModel restaurante) {
		this.restaurante = restaurante;
	}
	public boolean isUtilizado() {
		return utilizado;
	}
	public void setUtilizado(boolean utilizado) {
		this.utilizado = utilizado;
	}
	
	

}
