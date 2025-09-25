package br.loginCadastro.loginCadastro.Servise;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import br.loginCadastro.loginCadastro.DTO.UsuarioDTO;
import br.loginCadastro.loginCadastro.Model.Usuario;
import br.loginCadastro.loginCadastro.repository.UsuarioRepository;


@org.springframework.stereotype.Service
public class UsuarioService {


   @Autowired
    private UsuarioRepository repository;

    public Usuario cadastrar(UsuarioDTO dto) {
        Usuario usuario = new Usuario();
        usuario.setNome(dto.getNome());
        usuario.setEmail(dto.getEmail());
        usuario.setSenha(dto.getSenha()); 
        return repository.save(usuario);
    }

    public Optional<Usuario> autenticar(String email, String senha) {
        return repository.findByEmail(email)
                .filter(u -> u.getSenha().equals(senha));
    }

    
}