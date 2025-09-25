package br.loginCadastro.loginCadastro.repository;




import org.springframework.data.jpa.repository.JpaRepository;

import br.loginCadastro.loginCadastro.Model.Usuario;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByEmail(String email);
}
