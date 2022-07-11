package br.com.mamae.BlogPessoal.Repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import br.com.mamae.BlogPessoal.Model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	public Optional<Usuario> findByUsuario(String usuario);
}
