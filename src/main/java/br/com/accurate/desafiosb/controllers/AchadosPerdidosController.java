package br.com.accurate.desafiosb.controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.accurate.desafiosb.entities.AchadosPerdidos;
import br.com.accurate.desafiosb.repositories.AchadosPerdidosRepository;

@RestController
@RequestMapping("/api/achadosperdidos")
public class AchadosPerdidosController {
	
	@Autowired
	private AchadosPerdidosRepository achadosPerdidosRepository;
	

	
	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT}) 
	public @ResponseBody AchadosPerdidos salvarProduto(@Valid AchadosPerdidos achadosPerdidos) {
		achadosPerdidosRepository.save(achadosPerdidos);
		return achadosPerdidos;
	}
	
	@GetMapping
	public Iterable<AchadosPerdidos> obterTodosAchados() {
		return achadosPerdidosRepository.findAll();
	}
	
	
		@GetMapping("nome/{porNome}")
		public Iterable<AchadosPerdidos> obterAchadosPerdidosPorNome(@PathVariable String porNome) {
			return achadosPerdidosRepository.findByNomeContaining(porNome);
		}
		
		@GetMapping("categoria/{categoria}")
		public Iterable<AchadosPerdidos> obterAchadosPerdidosPorCategoria
		(@PathVariable String categoria) {
			return achadosPerdidosRepository.findByCategoriaContaining(categoria);
		}
		
		@GetMapping(path = "/{id}")
		public Optional<AchadosPerdidos> obterAchadosPerdidosPorId(@PathVariable int id) {
			return achadosPerdidosRepository.findById(id);
		}
		
		@DeleteMapping("/{id}")
		public void excluirAchadosPerdidos(@PathVariable int id) {
			achadosPerdidosRepository.deleteById(id);
		}
		
		
}
