package br.edu.ifpe.cipa.service;

import java.util.ArrayList;

import br.edu.ifpe.cipa.model.Pessoa;

public class PessoaService {
	ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
	
	public ArrayList<Pessoa> listAllPessoa(){
		
		Pessoa pessoa = new Pessoa();
		pessoa.setCpf("1234");
		pessoa.setNome("joás");
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setCpf("2345");
		pessoa1.setNome("josé");
		
		lista.add(pessoa);
		lista.add(pessoa1);
		return lista;
	}
	public void saverPessoa(Pessoa pessoa) {
		lista.add(pessoa);
	}

}
