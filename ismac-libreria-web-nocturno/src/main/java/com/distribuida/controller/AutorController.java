package com.distribuida.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.distribuida.dao.AutorDAO;
import com.distribuida.entities.Autor;

@Controller
@RequestMapping("/autores")//path principal
public class AutorController {
	@Autowired
	private AutorDAO autorDAO;
	
	@RequestMapping ("/findAll")//path secundario
	public String findAll(Model model) {
		
		//try {
			List<Autor> autores=autorDAO.findAll();
			
			model.addAttribute("autores",autores);//key:clientes o keyclientes !! valor:clientes
			
			return"autores-listar";//este es el nombre del formulario web a usar"clientes-listar.html","clientes-listar.jsp"
			
			
//		} catch (Exception e) {
	//		// TODO: handle exception
		//}
		
				
	}
	
	
	@RequestMapping("/findOne") //Actualizar o eliminar
	public String findOne(@RequestParam("idAutor") @Nullable Integer idAutor
						,@RequestParam("opcion")@Nullable Integer opcion
						,Model model
			) {
		
		if(idAutor !=null) {
			Autor autor =autorDAO.findOne(idAutor);
			model.addAttribute("autor",autor);
		}
		if(opcion == 1) return "autores-add"; 
		else return "autores-del";
	}
	
	@RequestMapping("/add")
	public String add(@RequestParam("idAutor")@Nullable Integer idAutor
					 ,@RequestParam("nombre")@Nullable String nombre
					 ,@RequestParam("apellido")@Nullable String apellido
					 ,@RequestParam("pais")@Nullable String pais
					 ,@RequestParam("direccion")@Nullable String direccion
					 ,@RequestParam("telefono")@Nullable String telefono
					 ,@RequestParam("correo")@Nullable String correo
					 ,Model model
					) {
			if(idAutor == null) {
				Autor autor =new Autor(0,nombre,apellido,pais,direccion,telefono,correo);
				autorDAO.add(autor);
				
			}else {
				Autor autor =new Autor(idAutor,nombre,apellido,pais,direccion,telefono,correo);
				autorDAO.up(autor);
				
			}
		
			
				
		return "redirect:/autores/findAll";
	}
	
	@RequestMapping("/del")
	public String del(@RequestParam("idAutor")@Nullable Integer idAutor) {
		autorDAO.del(idAutor);
		
	return"redirect:/autores/findAll";	
	}
	
}
