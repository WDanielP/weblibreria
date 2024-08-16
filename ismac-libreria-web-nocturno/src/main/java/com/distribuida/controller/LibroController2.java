package com.distribuida.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.distribuida.dao.AutorDAO;
import com.distribuida.dao.CategoriaDAO;
import com.distribuida.dao.LibroDAO;
import com.distribuida.entities.Libro;

@Controller
@RequestMapping("/libros2")
public class LibroController2 {
	
	
	@Autowired
	private LibroDAO libroDAO;
	
	@Autowired
	private CategoriaDAO categoriaDAO;
	
	@Autowired
	@Qualifier("autorDAOImpl")
	private AutorDAO autorDAO;
	
	@GetMapping("/findAll")
	private String findAll(ModelMap modelMap) {
		
		List<Libro> libros= libroDAO.findAll();
		modelMap.addAttribute("libros",libros);
		return "libros-listar2";
		
	}
	
	@GetMapping("/findOne")
	private String findOne(@RequestParam("idLibro")@Nullable Integer idLibro
			,@RequestParam("opcion")@Nullable Integer opcion
			,ModelMap modelMap
			) {
	if(idLibro!=null) {
		Libro libro= libroDAO.findOne(idLibro);
		modelMap.addAttribute("libro",libro);
	}
	modelMap.addAttribute("categorias",categoriaDAO.findAll());
	modelMap.addAttribute("autores",autorDAO.findAll());
	
	if(opcion==1) return "libros-add";
	else return "libros-del";
	
	}
	

}
