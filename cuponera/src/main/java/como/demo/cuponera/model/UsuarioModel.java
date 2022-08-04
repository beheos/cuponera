package como.demo.cuponera.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name = "usuarios")
public class UsuarioModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false)
	private String nombre;
	@Column(nullable = false)
	private String paterno;
	private String materno;
	@Column(nullable = false)
	private String correo;
	@Column(nullable = false)
	private String contrasenia;
	private Long referenciado;
	@Transient
	private String nombreReferenciado;
	
	public String getNombreReferenciado() {
		return nombreReferenciado;
	}
	public void setNombreReferenciado(String nombreReferenciado) {
		this.nombreReferenciado = nombreReferenciado;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPaterno() {
		return paterno;
	}
	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}
	public String getMaterno() {
		return materno;
	}
	public void setMaterno(String materno) {
		this.materno = materno;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	public Long getReferenciado() {
		return referenciado;
	}
	public void setReferenciado(Long referenciado) {
		this.referenciado = referenciado;
	}
	
	@Override
	public String toString() {
		return "UsuarioModel [id=" + id + ", nombre=" + nombre + ", paterno=" + paterno + ", materno=" + materno
				+ ", correo=" + correo + ", contrasenia=" + contrasenia + ", referenciado=" + referenciado
				+ ", nombreReferenciado=" + nombreReferenciado + "]";
	}
	

	
	

}
