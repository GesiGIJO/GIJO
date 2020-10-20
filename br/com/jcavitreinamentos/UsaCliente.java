package br.com.jcavitreinamentos;

import java.util.Date;

import br.com.jcavitreinamentos.Cliente;

public class UsaCliente {

	public static void main(String[] args) {
		
		Cliente objCliente = new Cliente();
		
		objCliente.setCodigo("9000");
		objCliente.setCpf("003.675.859-01");
		objCliente.setNome("Gesiel Neves");
		objCliente.setSexo("Masculino");
		objCliente.setTelefone("48 99123-9970");
		objCliente.setDataNascimento(new Date("31/08/1978"));
		
		Cliente objCliente2 = new Cliente();
		
		objCliente2.setCodigo("9001");
		objCliente2.setCpf("003.675.859-05");
		objCliente2.setNome("Daniel Luiz Neves");
		objCliente2.setSexo("Masculino");
		objCliente2.setTelefone("48 98469-7179");
		objCliente2.setDataNascimento(new Date("15/10/1955"));
		
		System.out.println(objCliente);
		System.out.println(objCliente2);
		

	}

}
