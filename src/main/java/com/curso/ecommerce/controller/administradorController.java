package com.curso.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.curso.ecommerce.model.Producto;
import com.curso.ecommerce.service.IUsuarioService;
import com.curso.ecommerce.service.ProductoService;
import com.curso.ecommerce.service.iOrdenService;


@Controller
@RequestMapping("/administrador")
public class administradorController {

	@Autowired
	private ProductoService productoService;
	
	@Autowired
	private IUsuarioService usuarioService;
	
	@Autowired
	private iOrdenService ordenService;

	@GetMapping("")
	public String home (Model modell) {
		List<Producto> productos = productoService.findAll();
		modell.addAttribute("productos", productos); 
		return "administrador/home";
	}
	
	//Metodo para listar los usuarios de la base de datos
	@GetMapping("/usuarios")
	public String usuarios(Model model) {
		model.addAttribute("usuarios", usuarioService.findAll());
		return "administrador/usuarios";
	}
	
	@GetMapping("/ordenes")
	public String ordenes(Model model) {
		model.addAttribute("ordenes", ordenService.findAll());
		return "administrador/ordenes";
	}

}
