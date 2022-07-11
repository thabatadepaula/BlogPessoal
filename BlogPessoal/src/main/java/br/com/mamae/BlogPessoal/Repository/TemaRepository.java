package br.com.mamae.BlogPessoal.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.mamae.BlogPessoal.Model.Tema;

public interface TemaRepository extends JpaRepository<Tema, Long> {
	public List<Tema> findAllByDescricaoContainingIgnoreCase(String descricao);
	
}

