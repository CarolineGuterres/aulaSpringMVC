package br.csi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.csi.model.dao.ClienteDao;
import br.csi.modelo.Cliente;

@Controller
public class ClienteController {
	
	@RequestMapping("clientes")
	public String msgTeste(){
		System.out.println("chamou controlador");
		return "cliente";
	}

	@RequestMapping("adicionarClientes")
	public String adiciona (Cliente cliente){
		boolean retorno= new ClienteDao().adicionar(cliente);
	     if(retorno){
	    	 return "cliente";
	     }else{
	    	 return "erro";
	     }
		
	}
	
	@RequestMapping("listaClientes")
	public ModelAndView lista(){
		System.out.println("Entrou listar clientes");
		ModelAndView mv= new ModelAndView("cliente");
		mv.addObject("clientes",new ClienteDao().listaClientes());
		return mv;
	}
}
