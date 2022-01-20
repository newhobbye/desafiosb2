package br.com.accurate.desafiosb.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.accurate.desafiosb.entities.AchadosPerdidos;

public interface AchadosPerdidosRepository extends PagingAndSortingRepository<AchadosPerdidos, Integer> {

	public Iterable<AchadosPerdidos> findByNomeContaining(String poreNome);
	public Iterable<AchadosPerdidos> findByCategoriaContaining(String categoria);

	
}
