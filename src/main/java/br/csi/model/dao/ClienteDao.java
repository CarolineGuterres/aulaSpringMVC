package br.csi.model.dao;

import java.util.ArrayList;

import br.csi.modelo.Cliente;

public class ClienteDao {

	private static ArrayList <Cliente> clientes= new ArrayList<Cliente>();
	
	public Long geraCodigo(){
		int co= clientes.size()+1;
		String cod=String.valueOf(co);
		Long codigo = Long.parseLong(cod);
		return codigo;
	}
	
	private void initClientes(){
		if(clientes.size()<=0){
			//clientes= new ArrayList<Cliente>();
			Cliente c= new Cliente();
			
			c.setCodigo(geraCodigo());
			c.setNome("Paulo");
			c.setBairro("Centro");
			c.setRuaNroComp("Duque de Caxias N:187 apt 258");
			c.setCidade("Santa Maria");
			clientes.add(c);
		}
			
	
	}
	
	public boolean adicionar(Cliente c)
	{
		System.out.println("Codigo" +c.getCodigo());
		System.out.println("Nome" +c.getNome());
		System.out.println("Rua Numero" +c.getRuaNroComp());
		System.out.println("Bairro" +c.getBairro());
		System.out.println("Cidade" +c.getCidade());
		c.setCodigo(geraCodigo());
		
		clientes.add(c);
		return true;
	}
	
	public ArrayList<Cliente> listaClientes(){
		initClientes();
		return clientes;
	}
	//public boolean remover(Cliente c)
	//{
		
	//}
	
	
}
