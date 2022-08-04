package como.demo.cuponera.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import como.demo.cuponera.model.RestauranteModel;
import como.demo.cuponera.model.UsuarioModel;
import como.demo.cuponera.model.UsuarioRestaurante;
import como.demo.cuponera.repository.RestauranteRepository;
import como.demo.cuponera.service.RestauranteService;
import como.demo.cuponera.service.UsuarioRestaurantService;
import como.demo.cuponera.service.UsuarioService;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	UsuarioService usuarioService;
	@Autowired
	RestauranteService restauranteService;
	@Autowired
	UsuarioRestaurantService usuarioRestaurantService;
	
	//listar los usuarios
	@GetMapping("/")
	public String listUsarios(Model model) {
		List<UsuarioModel> listaUsuarios =  usuarioService.listaUsuarios();
		for(UsuarioModel  usuario: listaUsuarios) {
			if(usuario.getReferenciado()!=null) {
				UsuarioModel user = usuarioService.obtenerUsuario(usuario.getReferenciado());
				usuario.setNombreReferenciado(user.getNombre() + " " + user.getPaterno() + " " + user.getMaterno());
			}else {
				usuario.setNombreReferenciado("Sin Referencia");
			}
			
		}
		model.addAttribute("listaUsuarios", listaUsuarios);
		model.addAttribute("usuario", new UsuarioModel());
		return "usuarios.html";
	}
	
	
	//listar los usuarios
		@GetMapping("/restaurante")
		public String listRestaurantes(Model model) {
			List<RestauranteModel> listarestaurantes =  restauranteService.listaRestaurantes();
			model.addAttribute("cupones", listarestaurantes);
			model.addAttribute("restaurante", new RestauranteModel());
			return "restaurante.html";
		}
		
		//listar los usuarios
		@GetMapping("/cupones")
		public String listCuponess(Model model) {
			model.addAttribute("usuario", new UsuarioModel());
			return "cupones.html";
		}
	
	
	//Agregar Usuario
	@PostMapping("/guardar")
	public String agregarUsuario(UsuarioModel usuario) {
		try {
			UsuarioModel usr = usuarioService.addUsuario(usuario);
			List<RestauranteModel>listadoRestaurantes = restauranteService.listaRestaurantes();
			for(RestauranteModel retaurante : listadoRestaurantes) {
				UsuarioRestaurante usrRes = new UsuarioRestaurante();
				usrRes.setUsuario(usr);
				usrRes.setRestaurante(retaurante);
				usrRes.setUtilizado(false);
				usuarioRestaurantService.addUsuarioRestaurante(usrRes);
			}
			
			return "redirect:/usuario/";
		} catch (Exception e) {
			return "redirect:/usuario/";
		}
	}
	
	@GetMapping("/busqueda")
	public String busqueda(@Param("id")Long id, Model model) {
		try {
			List<UsuarioRestaurante> listaRestaurantes =  usuarioRestaurantService.obtenerCuponesByIdRestaurante(id);
			model.addAttribute("listaRestaurantes", listaRestaurantes);
			model.addAttribute("usuario", new UsuarioModel());
			return "cupones.html";
		} catch (Exception e) {
			return "redirect:/usuario/";
		}
	}

}
