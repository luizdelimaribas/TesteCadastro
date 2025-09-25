package br.loginCadastro.loginCadastro.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class UsuarioDTO {

 @NotBlank(message = "O nome e obrigatorio")
 private String nome;

 @NotBlank(message = "A senha e obrigatorio")
 @Size(min = 6, max = 10, message = "A senha deve ter entre minimo de 6 a no maximo 8 caracteres")
 private String senha;
 
 @NotBlank(message = "O email e obrigatorio")
 @Email(message = "Formato invalido")
 private String email;

    
}
