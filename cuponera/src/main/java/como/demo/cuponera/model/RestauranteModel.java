package como.demo.cuponera.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "restaurantes")
public class RestauranteModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String restaurante;
	private String rfc;
	private String descripcion;
	private Date vigencia;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRestaurante() {
		return restaurante;
	}
	public void setRestaurante(String restaurante) {
		this.restaurante = restaurante;
	}
	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getVigencia() {
		return vigencia;
	}
	public void setVigencia(Date vigencia) {
		this.vigencia = vigencia;
	}
	
	@Override
	public String toString() {
		return "Restaurante [id=" + id + ", restaurante=" + restaurante + ", rfc=" + rfc + ", descripcion="
				+ descripcion + ", vigencia=" + vigencia + ", getId()=" + getId() + ", getRestaurante()="
				+ getRestaurante() + ", getRfc()=" + getRfc() + ", getDescripcion()=" + getDescripcion()
				+ ", getVigencia()=" + getVigencia() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
