package br.csi.model.dao;

import java.util.ArrayList;

import br.csi.modelo.Cliente;

public class ClienteDao {

	private ArrayList <Cliente> clientes;
	
	public void initClientes(){
		clientes= new ArrayList<Cliente>();
		Cliente c= new Cliente();
		c.setNome("Paulo");
		c.setBairro("Centro");
		c.setRuaNroComp("Duque de Caxias N:187 apt 258");
		c.setCidade("Santa Maria");
		clientes.add(c);
	}
	
	public boolean adicionar(Cliente c)
	{
		System.out.println("Nome" +c.getNome());
		System.out.println("Rua Numero" +c.getRuaNroComp());
		System.out.println("Bairro" +c.getBairro());
		System.out.println("Cidade" +c.getCidade());
		
		clientes.add(c);
		return true;
	}
	
	public ArrayList<Cliente> listaClientes(){
		initClientes();
		return clientes;
	}
}
