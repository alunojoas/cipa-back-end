package br.edu.ifpe.cipa.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifpe.cipa.model.Pessoa;
import br.edu.ifpe.cipa.service.PessoaService;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {
	PessoaService pessoaService = new PessoaService();
	
	@GetMapping("")
	public List<Pessoa> list() {
		return pessoaService.listAllPessoa();
		
	}
	@PostMapping("/")
	public void add(@RequestBody Pessoa pessoa) {
		pessoaService.saverPessoa(pessoa);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Pessoa> consultarPessoaPorId(@PathVariable Integer id){
		try {
			return new ResponseEntity<Pessoa>(pessoaService.listAllPessoa().get(id), HttpStatus.OK);
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			return new ResponseEntity<Pessoa>(HttpStatus.NOT_FOUND);
		}
	}
	
}
