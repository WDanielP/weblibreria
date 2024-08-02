package com.distribuida.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.distribuida.dao.AutorDAO;
import com.distribuida.dao.CategoriaDAO;
import com.distribuida.entities.Autor;
import com.distribuida.entities.Categoria;

@Controller
@RequestMapping("/categorias")//path principal
public class CategoriaController {
	@Autowired
	private CategoriaDAO categoriaDAO;
	
	@RequestMapping ("/findAll")//path secundario
	public String findAll(Model model) {
		
		//try {
			List<Categoria> categorias=categoriaDAO.findAll();
			
			model.addAttribute("categorias",categorias);//key:clientes o keyclientes !! valor:clientes
			
			return"categorias-listar";//este es el nombre del formulario web a usar"clientes-listar.html","clientes-listar.jsp"
			
			
//		} catch (Exception e) {
	//		// TODO: handle exception
		//}
		
				
	}
	
	
	@RequestMapping("/findOne") //Actualizar o eliminar
	public String findOne(@RequestParam("idCategoria") @Nullable Integer idCategoria
						,@RequestParam("opcion")@Nullable Integer opcion
						,Model model
			) {
		
		if(idCategoria !=null) {
			Categoria categoria =categoriaDAO.findOne(idCategoria);
			model.addAttribute("categoria",categoria);
		}
		if(opcion == 1) return "categorias-add"; 
		else return "categorias-del";
	}
	
	@RequestMapping("/add")
	public String add(@RequestParam("idCategoria")@Nullable Integer idCategoria
					 ,@RequestParam("categoria")@Nullable String categoria
					 ,@RequestParam("descripcion")@Nullable String descripcion
					 ,Model model
					) {
			if(idCategoria == null) {
				Categoria categoria1 =new Categoria(0,categoria,descripcion);
				categoriaDAO.add(categoria1);
				
			}else {
				Categoria categoria2 =new Categoria(idCategoria,categoria,descripcion);
				categoriaDAO.up(categoria2);
				
			}
		
			
				
		return "redirect:/categorias/findAll";
	}
	
	@RequestMapping("/del")
	public String del(@RequestParam("idCategoria")@Nullable Integer idCategoria) {
		categoriaDAO.del(idCategoria);
		
	return"redirect:/categorias/findAll";	
	}
	
}
